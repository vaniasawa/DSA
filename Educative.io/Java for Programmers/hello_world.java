class Main{
    private final int rx, ry;
    
    public Main(int x, int y){
        rx = x;
        ry = y;
    }

    public int get_sum(){
        return rx + ry;
    }

    public String get_to_string(){
        return rx + " " + ry;
    }
}

class Test{
    public static void main(String[] args) {
        Main obj = new Main(10, 11);
        System.out.println(obj.get_sum());
    }
}