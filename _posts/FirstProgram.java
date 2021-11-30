
public class FirstProgram {
    public static void main(String[] args)
    {

        //JDK-->JAVA Compiler+JRE(JVM+Libraries)

        FirstProgram fs=new FirstProgram();//object creation(fs is reference variable and new FirstProgram() is object
        System.out.println("Object 1 is created");

        FirstProgram fs1=null;//eligible for garbage collection
        System.out.println(fs1);

        new FirstProgram();//object creation and its eligible for garbage collection
        System.out.println("Object 2 is created");

        //Coding standards
        //class Test;//it should be noun
        //varible int rollNumber;//first letter should small
        //interface should represent adjective (eg. Runnable,ActionLister etc
        //method getResult()
        //constant(All should be uppercase) PI,MIN_HEIGHT

    }
}
