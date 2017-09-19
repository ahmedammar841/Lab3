import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Ammar
 *
 */
public class Url {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    /**
     * @param args args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
       String words = urlToString("http://erdani.com/tdpl/hamlet.txt");
       int prince1 = words.split("prince").length - 1;
       int prince2 = words.split("Prince").length - 1;
       int prince3 = prince1 + prince2;
       System.out.println(prince3);
    }

}
