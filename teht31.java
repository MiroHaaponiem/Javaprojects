/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 3
Jakson tehtävänumero: 3.1
Päiväys: 26.10.2020
*************************************/

import java.awt.*;

import java.applet.*;

class Mokki
{
    public String etunimi;
    public String sukunimi;
    public String talo;
    public void varaus(Graphics g, int y) {
        g.drawString("Mökin " + talo + " on varannut " + etunimi + sukunimi, y+20);
    }
}
public class Varaustiedot extends Applet
{
	public void tiedot(Graphics g) {
		Mokki varaus1 = new Mokki();
		Mokki varaus2 = new Mokki();
		Mokki varaus3 = new Mokki();
		varaus1.etunimi = "Keijo";
		varaus1.sukunimi = "Koppava";
		varaus1.talo = "Lakonranta 23";
		varaus2.etunimi = "Liisa";
		varaus2.sukunimi = "Hynnynen";
		varaus2.talo = "Läntäjärvi 19";
		varaus3.etunimi = "Aino";
		varaus3.sukunimi = "Antanen";
		varaus3.talo = "Kohloontie 6";
		varaus1.varaus(g, 10);
		varaus2.varaus(g, 60);
		varaus3.varaus(g, 130);
	}
}