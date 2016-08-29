package com.Jc;

/**
 * Created by priyaranjanjc on 8/26/2016.
 */
public class Printer {

    private double percentToner;
    private  int noOfPagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, int noOfPagesPrinted, boolean duplex) {
        this.percentToner = tonerLevel;
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.duplex = duplex;
    }

    public double getTonerLevel() {
        return percentToner;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(double percent){
        if ((percentToner + percent) < 100)
        this.percentToner = this.percentToner + percent;
        else
            System.out.println("Toner will overflow fill it with less percent");
    }

    public void printPage ( String text){
        System.out.println("Printing the following text" + text);
    }
}
