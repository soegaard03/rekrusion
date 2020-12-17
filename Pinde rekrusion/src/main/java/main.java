import processing.core.PApplet;

public class main extends PApplet{
    int[] liste = new int[]{1,2,3,4,5,6,7,8,9,10};
    int plads = 0;
    int pointer = 0;


    public static void main(String[] args) {
        PApplet.main("main");
    }

    @Override
    public void settings() {
        super.settings();
        size(500,500);
    }

    @Override
    public void draw() {
        super.draw();

    pindeDia(plads, liste);

    }

    void pindeDia(int i, int[] liste){
    int value = this.liste[plads];

    rect(50*plads,500,45,-50*random(value));

    if(plads < this.liste.length-1){
        pindeDia(++plads, this.liste);
    }
    }

    void findMax(int [] liste, int p, int mV){
        int maxV = 0;
        if(liste[pointer+1] > liste[maxV]){
            return findMax(liste, pointer + 1, pointer + 1);
        } else {
            return findMax(liste, maxV, pointer + 1);
        }
        }

    void sorter(int [] liste, int p1, int p2){

    }

    }

//spørgsmål???
// Hvorfor randomiser den i floats og desuden heller ikke med tal fra listen?
