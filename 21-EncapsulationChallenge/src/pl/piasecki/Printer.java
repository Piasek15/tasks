package pl.piasecki;

/**
 * Created by Patrick on 11 kwi 2018
 */
public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplexOn;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexOn) {
        fillToner(tonerLevel);
        if (numberOfPagesPrinted >= 0){
            this.numberOfPagesPrinted = numberOfPagesPrinted;
        }
        this.isDuplexOn = isDuplexOn;
    }

    public void print(int numberOfPages){
        if (!isDuplexOn) {
            normalModePrint(numberOfPages);
        } else {
            duplexModePrint(numberOfPages);
        }
    }

    private void duplexModePrint(int numberOfPages) {
        System.out.println("You are printing in duplex mode.");
        int pages = (numberOfPages / 2) + (numberOfPages % 2);
        for (int i = pages; i>0; i--){
            if (tonerLevel > 1){
                numberOfPagesPrinted++;
                tonerLevel -= 2;
            } else {
                System.out.println("Toner level is " + tonerLevel + "%, fill it up.");
                break;
            }
        }
    }

    private void normalModePrint(int numberOfPages) {
        System.out.println("You are printing in normal mode.");
        for (int i = numberOfPages; i>0; i--){
            if (tonerLevel > 0){
                numberOfPagesPrinted++;
                tonerLevel -= 1;
            } else {
                System.out.println("Toner level is 0%, fill it up.");
                break;
            }
        }
    }

    public void fillToner(int tonerLevel) {
        if (tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else if (tonerLevel < 0){
            this.tonerLevel = 0;
            System.out.println("Toner level can be minimum 0%");
        } else{
            this.tonerLevel = 100;
            System.out.println("Toner level can't be above 100%");
        }
        System.out.println("Toner filled to " + this.tonerLevel + "%.");
    }



    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexOn() {
        return isDuplexOn;
    }

    public void setDuplexOn(boolean duplexOn) {
        isDuplexOn = duplexOn;
    }
}
