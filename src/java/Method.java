class Method{
    //finding the smmalest value
    static int smallest(int x,int y,int z){
        return Math.min(Math.min(x,y),z);
    }
    //storing the variable
    public static void main(String[] args) {
        int x=20;
        int y=30;
        int z=40;
        System.out.println(smallest(x,y,z));
        
    }
}