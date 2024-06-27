package week2;

class ReturnType {
    int Addition(int a, int b) {
        return a + b;
    }
    public static void main(String []args){
        ReturnType r=new ReturnType();
        int sum =r.Addition(10,20);
        System.out.println(sum);
    }
}
