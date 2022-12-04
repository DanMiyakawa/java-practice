public class Continue01{
  public static void main(String[] args){
    for (int count = 0; count < 5; count++){
      if(count == 2){
        continue;
      }
      System.out.println("Continue = " + count);
    }
  }
}