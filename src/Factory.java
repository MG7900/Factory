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
    }

    public void factoryInfo(){
        System.out.println("The " + factoryName + " was founded in " + yearFounded);
        System.out.println(isOpen);

    }
}
