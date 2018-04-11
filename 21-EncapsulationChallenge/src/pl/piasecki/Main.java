package pl.piasecki;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(100,0,false);
        System.out.println(printer.getTonerLevel() + "% toner");
        System.out.println(printer.getNumberOfPagesPrinted() + " pages printed.");

        printer.print(23);

        System.out.println(printer.getTonerLevel() + "% toner");
        System.out.println(printer.getNumberOfPagesPrinted() + " pages printed.");

        printer.print(70);
        printer.fillToner(80);
        printer.print(75);

        System.out.println(printer.getTonerLevel() + "% toner");
        System.out.println(printer.getNumberOfPagesPrinted() + " pages printed.");

        printer.print(50);
        System.out.println(printer.getTonerLevel() + "% toner");
        System.out.println(printer.getNumberOfPagesPrinted() + " pages printed.");

        printer.setDuplexOn(true);
        System.out.println(printer.isDuplexOn());

        printer.fillToner(100);
        printer.print(25);
        System.out.println(printer.getTonerLevel() + "% toner");
        System.out.println(printer.getNumberOfPagesPrinted() + " pages printed.");
    }
}
