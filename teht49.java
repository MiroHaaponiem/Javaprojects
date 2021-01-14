/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 4
Jakson tehtävänumero: 4.9
Päiväys: 3.11.2020
*************************************/

import java.util.*;
public class Main
{

    static int m = 200000;
	static public void main (String arg[])

    {

    Date d = new Date();
    int h = d.getHours();
    int mi = d.getMinutes();
    int s = d.getSeconds();
    System.out.println("ALKUAIKA: " + h +":"+mi+":" + s);
    Vector x = new Vector();
    for (int k = 0; k < 500; k++)
    {
        Integer p = new Integer((int) (200 * Math.random()));
        x.insertElementAt(p, k);
    }
    for (int k = 0; k < 500; k++)
        System.out.println(x.elementAt(k));
    Date e = new Date();
    h = e.getHours();
    mi = e.getMinutes();
    s = e.getSeconds();
    System.out.println("LOPPUAIKA: " + h +":"+mi+":" + s);
    }
}
