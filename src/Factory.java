public class Factory {

    public int yearFounded = 1798;
    public String factoryName = "airplane Factory";
    public boolean isOpen = true;

    //instance variables at the top of class, they can be seen by every class
    //the scope is the whole class
    //they have to have the word public

    public static void main(String[] args) {    //a psvm, general rule, dont put lots of stuff
        System.out.println("Welcome to Mike's Factory");
        new Factory();
    }
    //constructor: is a very special type of method; it has the exact name as the class; and it
    //doesn't have void. This allows us to make a factory

    public Factory(){
        isOpen = false;
        String manager = "Mr. Hales";   //this is not an instance variable
        factoryInfo();
        yearFounded = 1991;;
        factoryInfo();
        //todo: change the year founded to be a different value
        //todo: call factoryInfo() afterwards

        //type varName = value
        //object of type airplane
        //constructor: is a method, has the same name as class, no void and just public
        Airplane plane1 = new Airplane();   //constructing a new airplane, the order of code matters
        plane1.name = "keff";
        plane1.model = "Paper Plane";
        plane1.capacity = 64;
        plane1.length = 128;
        plane1.isDoubleDecker = false;
        System.out.println("Name: " + plane1.name + " Model: " + plane1.model + " Length: " + plane1.length + " Capacity: " + plane1.capacity + " Double Decker status: " + plane1.isDoubleDecker);
        //todo: give all of plane1's instance variables values

        Airplane plane2 = new Airplane();
        System.out.println(plane2.capacity);

        Airplane plane3 = new Airplane();
        plane3.name = "max";
        plane3.model = "F67";
        plane3.capacity = 1;
        plane3.length = 26;
        plane3.isDoubleDecker = true;
        System.out.println("Name: " + plane3.name + " Model: " + plane3.model + " Length: " + plane3.length + " Capacity: " + plane3.capacity + " Double Decker status: " + plane3.isDoubleDecker);


        Airplane plane4 = new Airplane();
        System.out.println("Name: " + plane4.name + " Model: " + plane4.model + " Length: " + plane4.length + " Capacity: " + plane4.capacity + " Double Decker status: " + plane4.isDoubleDecker);
        //hw: make 2 more airplane objects
        //for one of the objects, change all the instance variables
        //for both objects print all the instance variables
        //uploading changes to github

        //Use the method with the pCapacity parameter
        Airplane plane5 = new Airplane(232);
        plane5.printInfo();



    }

    public void factoryInfo(){
        System.out.println("The " + factoryName + " was founded in " + yearFounded);
        System.out.println(isOpen);

    }
}
