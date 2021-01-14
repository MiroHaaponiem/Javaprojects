/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 7
Jakson tehtävänumero: 7.1
Päiväys: 1.12.2020
*************************************/

 import java.applet.Applet;
 import java.awt.Color;
 import java.awt.Image;
 import java.awt.Graphics;
 import java.awt.MediaTracker;

 public class Main extends Applet implements Runnable {
    // Tee kategoriat
    MediaTracker mt= new MediaTracker(this);
    Image kuvat[] = new Image[10];
    int index;
    Thread animaatio;

      // lisää kuvat
      public void init() {
          mt = new MediaTracker(this);
          for (int i = 0; i < 10; i++) {
              kuvat[i] = getImage(getDocumentBase(),
                      "javamies/T"+i+".gif");
              mt.addImage(kuvat[i], 1);
          }
      }

      // Aloita animaatiosäke
      public void start() {
          animaatio = new Thread(this);
          animaatio.start();
      }

      // Lopeta animaatiosäke.
      public void stop() {
          animaatio = null;
      }

      // Pyöritä animaatiosäke
      // Odota että kaikki kuvat latautuvat
      public void run() {
          try {
              mt.waitForID(0);
              mt.waitForID(1);
          } catch (InterruptedException e) {
              return;
          }
          Thread me = Thread.currentThread();
          while (animaatio == me) {
              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  break;
              }
              synchronized (this) {
                  index++;
                  if (index >= kuvat.length) {
                      index = 0;
                  }
              }
              repaint();
          }
      }

      // Maalaa tausta
      public void update(Graphics g) {
          paint(g);
      }

      // Toteuta gif
      public void paint(Graphics g) {
          g.drawImage(0, 0, this);
          if (tracker.statusID(1, false) == MediaTracker.COMPLETE) {
              g.drawImage(kuvat[index], 10, 10, this);
          }
      }
 }

