package ie.Franco.main;

import java.io.IOException;
/**
 * @author :Franco Gutierrez
 * version :1.0
 * @Description This project is a represation of the algorithm page Rank it try to give a vote to
 * each page according to the backlinks and outlinks.
 * The formula implemented is P(R)= 1-damping factor + damping * (sum+=P(T)/C(T))
 * Where P(T) means one backlink divided by the outlinks contains in T.
 *
 * Running in the command prompt as java -jar pageRank.jar the html file is located in the project as "html"
 * @since :2016-01-01
 *
 */


public class Main {

    public static void main(String[] args) throws IOException {
        CrawlerAsGraph g = new CrawlerAsGraph(args[0]);//"C:\\Users\\Franco\\IdeaProjects\\pageRank\\html\\index.html"
        g.generatePagerank(0.8, 5); //damping factor of 0.8 and 5 rounds of calculations
        System.out.println();


    }
}
