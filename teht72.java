/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 7
Jakson tehtävänumero: 7.2
Päiväys: 1.12.2020
*************************************/

import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL osoite = new URL("http://web.centria.fi/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(osoite.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}

