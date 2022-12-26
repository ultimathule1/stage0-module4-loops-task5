package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j) {
                    for (; (j + i) < height; j++) {
                        System.out.print(8);
                    }
                    j--;
                } else if (i + j + 1 == height) {
                    for (int k = j; j <= i; j++) {
                        System.out.print(8);
                    }
                    j--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
