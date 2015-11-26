import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class Wykres2abz extends JPanel{
    boolean czystart;
    int wielkosc=500;
    int [][] siec = new int [wielkosc][wielkosc];
    int krok=0;
    int ile_czastek=0;
    Label etykpanel = new Label("coś tam");
    public Wykres2abz(){czystart=false;
        for (int i=0;i<wielkosc;i++){
            for (int j=0;j<wielkosc;j++){
                siec[i][j]=(int)(2*Math.random())+1;
            }
        }
    }
    public Dimension getPreferredSize()
    {return new Dimension(wielkosc,wielkosc);
    }
    void step (){
        int x=0, y=0;
        for(int i = 0; i < wielkosc * wielkosc; i++) {
            int ix = (int)(wielkosc * Math.random());
            int iy = (int)(wielkosc * Math.random());
            x=ix;
            y=iy;
            int siecxy = siec[ix][iy];
            if(siecxy>0) {
                double losowa = Math.random();
                if(losowa<0.25) {
                    x=ix+1;
                    if(x==wielkosc) { x=0; }
                } else if(losowa<0.5) {
                    x=ix-1;
                    if(x==-1) { x=wielkosc-1; }
                } else if(losowa<0.75) {
                    y=iy+1;
                    if(y==wielkosc) { y=0; }
                } else {
                    y=iy-1;
                    if(y==-1) { y=wielkosc-1; }
                }
                if(siecxy!=siec[x][y]) {
                    siec[ix][iy] = 0;
                    siec[x][y] = (siecxy+siec[x][y])%3;
                }

            }
        }
        try {
            FileWriter outFile = new FileWriter("anihil.txt", true);
            PrintWriter out1 = new PrintWriter(outFile);
            out1.println(""+krok+" "+ile_czastek);
            out1.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics graf){
        super.paintComponent(graf);
        graf.drawLine(0, 0, 0, wielkosc);
        graf.drawLine(0, 0, wielkosc,0);
        graf.drawLine(0, wielkosc, wielkosc, wielkosc);
        graf.drawLine(wielkosc, 0,wielkosc, wielkosc);
        ile_czastek=0;
        for (int i=0;i<wielkosc;i++){
            for (int j=0;j<wielkosc;j++){
                if(siec[i][j]==1){graf.setColor(Color.BLUE);graf.drawRect(i,j,1,1);ile_czastek++;}
                if(siec[i][j]==2){graf.setColor(Color.RED);graf.drawRect(i,j,1,1);ile_czastek++;}
            }
        }
        if((czystart)&&(krok<10000)){
            krok++;
            step();
            try {
                Thread.sleep(50);               // sleep for 10 msec
            } catch (InterruptedException t){}
            repaint();
            setForeground(Color.black);
            etykpanel.setText(""+ile_czastek);
            System.out.println("krok="+krok+" #czastek="+ile_czastek);
        }
    }
}