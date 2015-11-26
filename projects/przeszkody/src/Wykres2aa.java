import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Wykres2aa extends JPanel{
    boolean rysowac;
    int wielkosc=500;
    int [][] siec = new int [wielkosc][wielkosc];
    int lsquare=100;
    int lczastek=lsquare*lsquare;
    int [][] walker = new int [lczastek][2];
    public Wykres2aa(){rysowac=false;
        for (int i=0;i<wielkosc;i++){
            for (int j=0;j<wielkosc;j++){
                siec[i][j]=0;
            }
        }

        for (int i=0;i<lsquare;i++){
            for (int j=0;j<lsquare;j++){
                siec[i+(wielkosc-lsquare)/2][j+(wielkosc-lsquare)/2]=1;
                walker[i*lsquare+j][0]=i+(wielkosc-lsquare)/2;
                walker[i*lsquare+j][1]=j+(wielkosc-lsquare)/2;
            }
        }
    }
    public Dimension getPreferredSize()
    {return new Dimension(wielkosc,wielkosc);
    }
    void step (int ktory){
        int x=walker[ktory][0];
        int y=walker[ktory][1];
        double losowa=Math.random();
        if(losowa<0.35) {x=x+1;if (x==wielkosc){x=0;}}
        else if(losowa<0.5) {x=x-1;if (x==-1){x=wielkosc-1;}}
        else if(losowa<0.75) {y=y+1;if (y==wielkosc){y=0;}}
        else {y=y-1;if (y==-1){y=wielkosc-1;}}
        if(siec[x][y]==0){
            siec[walker[ktory][0]][walker[ktory][1]]=0;
            walker[ktory][0]=x;
            walker[ktory][1]=y;
            siec[x][y]=1;
        }
    }
    public void paintComponent(Graphics graf){
        super.paintComponent(graf);
        graf.drawLine(0, 0, 0, wielkosc);
        graf.drawLine(0, 0, wielkosc,0);
        graf.drawLine(0, wielkosc, wielkosc, wielkosc);
        graf.drawLine(wielkosc, 0,wielkosc, wielkosc);
        for (int i=0;i<wielkosc;i++){
            for (int j=0;j<wielkosc;j++){
                if(siec[i][j]==1){graf.setColor(Color.blue);graf.drawRect(i,j,1,1);}
                if(siec[i][j]==5){graf.setColor(Color.black);graf.drawRect(i,j,1,1);}
            }
        }
        if(rysowac){
            for (int czastka=0;czastka<lczastek;czastka++){
                int indeks=(int)(lczastek*Math.random());
                step(indeks);
            }
            try {
                Thread.sleep(20);               // sleep for 10 msec
            } catch (InterruptedException t){}
            repaint();
        }
    }
}