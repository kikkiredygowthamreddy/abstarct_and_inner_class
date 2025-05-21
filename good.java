abstract class a{
      public  void Antena(){
      }
}
public class good{
      public static void main(String args[])
      {
       a obj = new a()
       {
            public void Antena(){
                  System.out.println("connecting...");
            }
       };   
       obj.Antena();
      }
}