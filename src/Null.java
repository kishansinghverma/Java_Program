import static java.lang.System.exit;

public class Null{
    public static void greet(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        try{
            System.out.println("Try Block");
            int x=10/0;
            exit(0);
        }

        catch (IndexOutOfBoundsException e){
            System.out.println("Catch Block");
            exit(0);
        }
        catch (ArithmeticException e){

        }
        finally{
            System.out.println("Final Block");
        }
    }
}