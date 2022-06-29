package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        int minus;
        for (int i = 0; i < cathetusLength; i++) {
            minus = i + 1;
            for (int j = 0; j < cathetusLength * 2; j++) {
                if (j >= cathetusLength - i && j <= cathetusLength + i) {
                    if (j <= cathetusLength) {
                        System.out.print(minus);
                        minus--;
                    } else {
                        minus++;

                        System.out.print(minus + 1);

                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(9);
    }
}
