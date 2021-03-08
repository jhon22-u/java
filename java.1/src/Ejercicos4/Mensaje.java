package Ejercicos4;
 public class Mensaje {
	 
	 
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	for (int x=0;x<args.length;x++)
	{
		System.out.println(args[x]);
	}
          String mayor=(Integer.parseInt(args[0])> Integer.parseInt(args[1])?args[0]:args[1]);
   
       System.out.println("El mayor es:"+mayor);

}

}

