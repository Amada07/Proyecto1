import java.util.Scanner;

 
public class promedio1 {
  
	  	public static void main(String [] args){

	       
		Scanner scanner = new Scanner(System.in);
              
		int examen1= scanner.nextInt();
                int examen2 = scanner.nextInt();
                int examen3 = scanner.nextInt();
                int examen4 = scanner.nextInt();

		int suma = examen1 + examen2 + examen3 + examen4;
		int promedio = suma / 4;
		
		System.out.println(promedio);

	}
}