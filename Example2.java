class Example{
   public String message;

   public Example(String message){
      this.message=message;
   }

   public String getMessage(){
      return message;
   }
}

public class Example2 {
   public static void main(String[] args){
      Example obj= new Example("Hello world");
      String message = obj.getMessage();
      System.out.println(message);
   }
}


