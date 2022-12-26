package school.mjc.stage0.loops.task5;

public class Cross {
    public static void main(String[] args) {
        printCross(8);
    }
    public static void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            if ((sideLength / 2 - 1) == i) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print(8);
                }
            } else {
                for (int j = 0; j < sideLength; j++) {
                    if ((sideLength / 2) == j) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
