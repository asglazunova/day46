package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {

        String word ="java";
try {
    System.out.println("word = " + word);
    System.out.println("length = " + word.length());
    System.out.println(word.substring(20));

}catch(NullPointerException e){
    System.out.println("NullPointerException caught and handle, please check if String has value ");
} catch(StringIndexOutOfBoundsException e){
    System.out.println("Index is wrong , please check if you entered a value index ");
}catch (Throwable t){
    System.out.println("Exception is caught");
    System.out.println("Reason = " + t.getCause());
}
    }
}
