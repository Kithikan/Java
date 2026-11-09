class Two_Arrays {
    public static void main(String args[]) {

        int[][] y = new int[5][2];

        y[0][0] = 10;
        y[0][1] = 20;

        y[1][0] = 30;
        y[1][1] = 40;

        y[2][0] = 50;
        y[2][1] = 60;

        y[3][0] = 70;
        y[3][1] = 80;

        y[4][0] = 90;
        y[4][1] = 100;

        for (int i = 0; i <= 4; i++) {
            for (int x = 0; x <= 1; x++) {
                System.out.println(y[i][x]);
            }
            System.out.println();
        }
    }
}