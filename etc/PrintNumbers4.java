class RunFor40Minutes {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long runTime = 40L * 60L * 1000L; // 40 minutes in milliseconds

        long i = 100;

        while (System.currentTimeMillis() - startTime < runTime) {
            System.out.println(i);
            i++;
        }

        System.out.println("Program finished after 40 minutes.");
    }
}
   