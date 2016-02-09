package ie.Franco.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

/**
 * Created by Franco 28/12/2015
 * Parser class is used to get all the links from each page
 */
public class Parser {
    private String allContent;
    private ArrayList<String> urls;

    /**
     * Creates a new HTML parser
     * @param filepath the HTML file to parse
     */
    public Parser(String filepath) {
        try {
            allContent = readFile(filepath);
            urls=new ArrayList<String>();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description This function will set up in an arrayList all possible hrefs from a URL
     * @return boolean to indicate that everything works properly
     */

    public ArrayList<String> getHyperlinks(String filepath) throws IOException {
        File input = new File(filepath);
        Document htmlDocument = Jsoup.parse(input, "UTF-8");
        Elements linksOnPage = htmlDocument.select("a[href]");
        System.out.println("Found (" + linksOnPage.size() + ") links");

        System.out.println("*****************");
        for (Element link : linksOnPage) {
            String BaseUriAux = htmlDocument.baseUri();
            String absHref = link.attr("href");
            if (!absHref.endsWith(".html"))continue;
            if (absHref.startsWith(".."))
                absHref = absHref.replace("..",
                        "/../../");
            else if (absHref.startsWith("http://"))
                continue;
            else
                BaseUriAux += "/../";
            URI newLink = new File(BaseUriAux + absHref).toURI();
            newLink = newLink.normalize();
            System.out.println(link.attr("href") + " 2 " + newLink.toString().substring(6));
            urls.add(newLink.toString().substring(6));


        }
        System.out.println("*****************");

        return urls;
    }

    /**
     * Returns all the hyperlinks present in the HTML
     * @return the hyperlinks
     */
    public ArrayList<String> getHyperlinkss() {
        if (urls == null) {
            urls = new ArrayList<String>();

            Document doc = Jsoup.parse(allContent);

            for (Element link : doc.select("a[href]")) {
                String url = link.attr("href");

                if (url.length() > 0)
                    urls.add(url);
            }
        }

        return urls;
    }

    private String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line + "\n");
                line = br.readLine();
            }

            return sb.toString();
        } finally {
            br.close();
        }
    }
}
