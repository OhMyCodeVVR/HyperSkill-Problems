class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;


        while (true) {
            if (!Thread.currentThread().interrupted()) {
                this.interrupt();
                System.out.println("It was interrupted");
                System.exit(0);
            }
            counter++;
        }
    }
}