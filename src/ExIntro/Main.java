package ExIntro;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://docs.google.com/forms/u/0/d/e/1FAIpQLScE6sxLFb3BmCmT2TKHQH5ormS0qvjHwO-uTAR8MXaagBvSSQ/formResponse");
        URLConnection con = url.openConnection();
        con.setDoOutput(true);
        OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
        out.write("entry.835030737=" + "Oskar&");
        out.write("entry.1616686619=" + "No");
        out.close();
        con.getInputStream();
    }
}