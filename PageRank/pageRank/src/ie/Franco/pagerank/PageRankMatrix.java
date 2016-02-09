package ie.Franco.pagerank;

import java.util.*;

/**
 * PageRankMatrix will keep the adjacency of the back links
 */
public class PageRankMatrix {
    private int totalLinks;
    private ArrayList<Integer>[] outLinksMatrix;
    private int[] toTalOutLinks;

    /**
     * /**
     * Creates a new graph
     *
     * @param size the number of vertices in the graph
     */
    public PageRankMatrix(int size) {
        totalLinks = size;
        outLinksMatrix = new ArrayList[totalLinks];

        for (int i = 0; i < totalLinks; ++i)
            outLinksMatrix[i] = new ArrayList<Integer>();

        toTalOutLinks = new int[totalLinks];
    }

    /**
     * @param from node that is given a vote
     * @param to   node that receive the backlink
     * @Description: This function will set up the adjacency matrix
     */
    public void addConnection(int from, int to) {
        outLinksMatrix[to].add(from);
        toTalOutLinks[from]++;
    }

    static <K,V extends Comparable<? super V>>
    List<Map.Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

        List<Map.Entry<K,V>> sortedEntries = new ArrayList<Map.Entry<K,V>>(map.entrySet());

        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<K,V>>() {
                    @Override
                    public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );

        return sortedEntries;
    }

    /**
     * @Description This function will print all information about page rank as index page rank in-links out-links links
     * @param files
     * @param links
     * @param v
     * @param outLinksMatrix
     * @param toTalOutLinks
     *
     */
    public void printPageRank(ArrayList<String> files, Map<String, Integer> links, TransitionAsVector v,
                              ArrayList<Integer>[] outLinksMatrix,
                              int[] toTalOutLinks) {
        Map<String, Double> mapPrinting = new HashMap<String, Double>();
        System.out.println("Loading PageRank Information : ");

        for (int i = 0; i < files.size(); ++i)
            mapPrinting.put(files.get(i), v.get(i));

        System.out.println("Nro\t\tPage-Rank\tin-links\tout-links\t\tURL");
        int numberMax=9;
        for (Map.Entry<String, Double> value : entriesSortedByValues(mapPrinting)) {
            if(numberMax<0) break;
            int i=value.getKey().indexOf("html/");
            //int j=value.getKey().indexOf(".html");
            System.out.println(links.get(value.getKey()) +
                    "\t\t"   +  String.format("%.3f", value.getValue()) +
                    "\t\t\t"   + outLinksMatrix[links.get(value.getKey())].size() +
                    "\t\t\t"   + toTalOutLinks[links.get(value.getKey())]+
                    "\t\t\t" +  value.getKey().substring(i+5,value.getKey().length()));
            --numberMax;
        }

    }

    /**
     * @param d      it is the damping factor (probability of success)
     * @param rounds the number of rounds
     * @Description It calculates the page Rank according to the formula P(R)= 1-d * d P(T)/C(T)
     */

    public void calculatePageRank(double d, double rounds, Map<String, Integer> links, ArrayList<String> files) {
        TransitionAsVector transition = new TransitionAsVector(totalLinks, 1.0 / (double) totalLinks); //Probability
        TransitionAsVector transitionAux = new TransitionAsVector(totalLinks);
        int iteratorCounter = 0;
        double sum = 0.0;
        while (iteratorCounter < rounds) {

            transitionAux.setAllElementsFromVector(transition);

            for (int i = 0; i < totalLinks; ++i) {
                transition.set(i, 0.0);

                if (outLinksMatrix[i].size() > 0) {
                    sum = 0.0;

                    for (Integer j : outLinksMatrix[i])//e.g P(A) = P(B)/C(B) + P(C)/C(B)
                        sum += transitionAux.get(j) / (double) toTalOutLinks[j]; //All contributions P(R)/C(R) of the iteratorCounter-1;

                    sum *= d;

                    transition.set(i, sum);
                }
            }

            for (int i = 0; i < totalLinks; ++i)
                transition.set(i, transition.get(i) + (1.0 - d)); //updating the transition

            ++iteratorCounter;
            printPageRank(files, links, transition, outLinksMatrix, toTalOutLinks);
        }


    }
}
