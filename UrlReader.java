import java.net.*;
import java.io.*;

public class UrlReader {
    public static void main(String[] args) throws Exception {
    	URL site;
    	if (args.length > 0){
            site = new URL(args[0]);
        } else {
        	site = new URL("http://www.google.gr");
        }

        BufferedReader in = new BufferedReader(
        new InputStreamReader(site.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}