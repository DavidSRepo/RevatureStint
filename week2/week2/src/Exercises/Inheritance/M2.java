package Exercises.Inheritance;

public class M2 extends Bots{

   private String type;

   public M2(String type){
       super("Two",2, 0 );
       this.type = type;
   }

   public M2(){

   }

   public void setType(String Type){
       this.type = type;

   }

   public String getType(){
       return this.type;
   }
}
