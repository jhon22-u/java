package Exepciones;


public class Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///File fichero= new File("/tmp/prueba.txt");
		File fichero1= new File("C:\\Users\\Jhon Triana\\hola");

		try {
			//Abro el fichero para Leer
			FileReader fr= new FileReader(fichero);
			
			//Buffer para ir cargando las líneas del fichero
			BufferedReader br=new BufferedReader(fr);
			
			String linea;
			linea=br.readLine();
			while ( linea !=null)
			{
				System.out.println(linea);
				linea=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
						
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("He abierto el fichero");
		
	}

		
	}

}
