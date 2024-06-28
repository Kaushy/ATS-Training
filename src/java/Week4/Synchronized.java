package Week4;

class CakeCounter{
    int counter=0;
    public synchronized void increment(){
        counter++;
    }
}

class Team implements Runnable{
    CakeCounter counter;
    public Team(CakeCounter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0;i<10;i++){
            counter.increment();
        }
    }
}

class Synchronized{
    public static void main(String[]args){
        CakeCounter counter=new CakeCounter();
        Thread team1=new Thread(new Team(counter));
        Thread team2=new Thread(new Team(counter));

        team1.start();
        team2.start();
        try{
            team1.join();
            team2.join();
        }
        catch (Exception e){
            System.out.println(e);

        }
        System.out.println(counter.counter);
    }
}