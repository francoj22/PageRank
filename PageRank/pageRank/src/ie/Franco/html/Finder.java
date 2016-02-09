package ie.Franco.html;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * Created by Franco on 26/12/2015.
 * @Description: This class will be able to set in a list  all possible links in a folder
 */
public class Finder extends SimpleFileVisitor<Path> {


        private final PathMatcher matcher;
        private int numMatches = 0;
        public ArrayList<String> linksMatches = new ArrayList<String>();//it will keep the possibles Links.

        //it will verify if the link finish with .html
        public Finder(String pattern) {
                matcher = FileSystems.getDefault()
                        .getPathMatcher("glob:" + pattern);
        }

        //it compares the link if it is equal to .html then it will be added to the list.
        private void find(Path file) {
                Path name = file.getFileName();
                if (name != null && matcher.matches(name)) {
                        numMatches++;
                        int i=-1;
                        String shortPath=file.toString();
                        i=shortPath.indexOf("-lewis");
                        shortPath=shortPath.substring(i+7,shortPath.length());
                        URI newLink = new File(file.toString()).toURI();
                        //  System.out.println("Antes  :" +newLink.toString() );
                        newLink = newLink.normalize();
                        linksMatches.add(newLink.toString().substring(6));

                }
        }

        // Prints the number of Links Matched
        void printAllLinks() {
                System.out.println("Matched: " + numMatches);
        }

        //Iterator for each file
        @Override
        public FileVisitResult visitFile(Path file,
                                         BasicFileAttributes attrs) {
                find(file);
                return CONTINUE;
        }

        //iterator for each directory
        @Override
        public FileVisitResult preVisitDirectory(Path dir,
                                                 BasicFileAttributes attrs) {
                find(dir);
                return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file,
                                               IOException exc) {
                System.err.println(exc);
                return CONTINUE;
        }


        static void error() {
                System.err.println("Error: java Main <path>");
                System.exit(-1);
        }

        public ArrayList<String> getFiles() {
                return linksMatches;
        }


}