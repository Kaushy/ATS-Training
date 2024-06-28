package Week4;

class MultiThread extends Thread {
    public MultiThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Main{
    public static void main(String[]args) {
       MultiThread mt1 = new MultiThread("kaushik 1:");
       MultiThread mt2 = new MultiThread("vishnu 2:");
       MultiThread mt3 = new MultiThread("hari 3:");
       mt1.start();
       mt2.start();
       mt3.start();

    }
}
