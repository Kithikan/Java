class IrregularArray {
    public static void main(String args[]) {

        int[][] x = {{10, 20, 30}, {40, 50, 60, 70}, {80, 90}, {100}};

        for (int i = 0; i < x.length; i++) {

            System.out.println("Student " + (i + 1));

            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Marks " + (j + 1) + ": " + x[i][j]);
            }

            System.out.println("*******");
        }
    }
}