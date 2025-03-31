public class Main {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            Version1 v1 = new Version1();
            v1.create(0);
            v1.create(0);
            v1.create(2);
            v1.create(0);
            v1.destroy(0);
        }

        long stopTime1 = System.currentTimeMillis();
        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            Version2 v2 = new Version2();
            v2.create(0);
            v2.create(0);
            v2.create(2);
            v2.create(0);
            v2.destroy(0);
        }

        long stopTime2 = System.currentTimeMillis();
        long reactionTime1 = stopTime1 - startTime1;
        long reactionTime2 = stopTime2 - startTime2;

        System.out.println("Version 1 time elapsed: " + reactionTime1  + " ms");
        System.out.println("Version 2 time elapsed: " + reactionTime2  + " ms");
    }
}
