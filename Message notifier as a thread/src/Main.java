class MessageNotifier extends Thread {
    int repetitions = 0;
    String msg = "";
    // write fields to store variables here

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.repetitions = repeats;
        this.msg = msg;

    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = 0; i < repetitions; i++) {
            System.out.println(msg);
        }
    }
}
