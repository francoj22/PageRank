package ie.Franco.main;


import ie.Franco.html.Finder;
import ie.Franco.html.Parser;
import ie.Franco.pagerank.PageRankMatrix;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: This class will be the controller that allow make call to set up the page rank by the folders.
 */
public class CrawlerAsGraph {
    private PageRankMatrix pageRankMatrix;
    private ArrayList<String> files;
    private Map<String, Integer> links;

    public CrawlerAsGraph(String folderPath) throws IOException {
        Path startingDir = Paths.get(folderPath+"\\..\\");//args[0]
        String pattern = "*.{html,.HTML,.htm,.HTM}";

        Finder finder = new Finder(pattern); // Create a New FindFolder given a path
        Files.walkFileTree(startingDir, finder);
        files = finder.getFiles();  // Get all the .html files from that findFolder.
        pageRankMatrix = new PageRankMatrix(files.size()); //Create the Matriz by the total of htmls
        links = new HashMap<String, Integer>();             //get All Links

        for (int i = 0; i < files.size(); ++i)
            links.put(files.get(i), i);

        for (String file : files) {
            ArrayList<String> links = new Parser(file).getHyperlinks(file); //Get all links in each page.
            if(links ==null) break;
            for (String link : links)
            {   System.out.println(link);
                file = file.replace('\\', '/');
                pageRankMatrix.addConnection(this.links.get(file), this.links.get(link));//setting each link to the matrix
            }

        }
    }

    public void generatePagerank(double d, double rounds) {
        pageRankMatrix.calculatePageRank(d, rounds,links,files);
    }



}
