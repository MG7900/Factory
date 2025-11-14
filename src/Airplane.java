public class Airplane {
    //instance variables\
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;

    public Airplane(){
        //a default constructor that java makes
        capacity = 250;
        name = "Jacob6";
        isDoubleDecker = false;
        model = "lufthansa";
        length = 157;

    }
    //have to have different names e.g. "pCapacity"
    public Airplane(int pCapacity){
        capacity = pCapacity;
        name = "Jacob6";
        isDoubleDecker = false;
        model = "lufthansa";
        length = 157;
    }
    //todo: make a method called printInfo() that prints the airplane's instance variables
    public void printInfo(){
        System.out.println("Name: " + name + " Model: " + model + " Length: " + length + " Capacity: " + capacity + " Double Decker status: " + isDoubleDecker);
    }

}
