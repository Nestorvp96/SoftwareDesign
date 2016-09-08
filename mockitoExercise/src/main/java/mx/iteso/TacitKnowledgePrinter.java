package mx.iteso;

public class TacitKnowledgePrinter {

    private Printer printer;


    public TacitKnowledgePrinter(Printer printer) {
        this.printer = printer;
    }

    private static final int FIVE = 5;
    private static final int THREE = 3;

    public String printNumbers(int limit) {
        if (limit < 1) {
            throw new RuntimeException("limit must be >= 1");
        }

        String result = "";

        for (int i = 1; i <= limit; i++) {
            try {
                printer.print(calculate(i));
            } catch (Exception e) {
                continue;
            }
        }

        return result;
    }

    public String calculate(int number) {
        if(number == 0){

            throw new RuntimeException("Cero no permitido");
        }

        if (isDivisibleBy(number, THREE) && isDivisibleBy(number, FIVE)) {
            return "TacitKnowledge";
        }

        if (isDivisibleBy(number, THREE)) {
            return "Tacit";
        }

        if (isDivisibleBy(number, FIVE)) {
            return "Knowledge";
        }
        return "" + number;
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}