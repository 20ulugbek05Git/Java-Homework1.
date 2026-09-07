public class Homework1 { public static void main(String[] args) { int i, j;
    // 1st Triangle (Bottom-Left)
    for (i = 0; i < 10; i++) {
        for (j = 0; j <= i; j++) {
            System.out.print("#");
        }
        System.out.println();
    }

    System.out.println(); // Space between triangles

    // 2nd Triangle (Top-Left)
    for (i = 0; i < 10; i++) {
        for (j = 0; j < 10 - i; j++) {
            System.out.print("#");
        }
        System.out.println();
    }

    System.out.println(); // Space between triangles

    // 3rd Triangle (Top-Right)
    for (i = 0; i < 10; i++) {
        for (j = 0; j < i; j++) {
            System.out.print(" ");
        }
        for (j = 0; j < 10 - i; j++) {
            System.out.print("#");
        }
        System.out.println();
    }

    System.out.println(); // Space between triangles

    // 4th Triangle (Bottom-Right)
    for (i = 0; i < 10; i++) {
        for (j = 0; j < 10 - i - 1; j++) {
            System.out.print(" ");
        }
        for (j = 0; j <= i; j++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
}