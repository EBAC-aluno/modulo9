public class App {
  public static void main(String args[]) throws Exception {

    int value = 0;
    try{
      value = Integer.parseInt(args[0]);
    }catch(NumberFormatException e){
      throw new Exception("Invalid input.");
    }
    
    Integer intCastedToWrapper = Integer.valueOf(value);
    System.out.println(intCastedToWrapper);
  }
}
