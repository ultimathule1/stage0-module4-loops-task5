package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void main(String[] args) {
        printRectangleFrom8s(8,4);
    }
    public static void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
