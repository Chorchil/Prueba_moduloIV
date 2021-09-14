package pruebaIV;
import java.util.Scanner;
public class MainBancoProdubanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		 String claveR="85AB";
		 String claveIn="";
		 int op=0;
		 int nCuenta;
		 int vTransferencia;
		 int saldo=1000;
		
		 do {
			 System.out.println("Ingrese clave: ");
			 claveIn=lector.nextLine();
			 if (claveR.equals(claveIn)) {
				 do {
					 System.out.println("#############################################");
					 System.out.println("BANCO PRODUBANCO, elija una opción: \n1.Realizar transferencia \n2.Consultar moviminetos \n3.SALIR");
					 System.out.println("#############################################");
					 op=lector.nextInt();
					 if(op==1) {
						 System.out.println("Ingrese el numero de cuenta de destino y el monto de la transferencia");
						 System.out.println("Numero de cuenta");
						 nCuenta=lector.nextInt();
						 System.out.println("Monto a transferir");
						 vTransferencia=lector.nextInt();
						 System.out.println("Su nuevo saldo o saldo restante es de un total de: "+(saldo-vTransferencia));
					 }else if(op==2) {
						 System.out.println("En este momento se estan llevando a cabo las transacciones, intente mas tarde");
					 }
				 }while(op!=3);
			 }
			 
		 }while(claveIn=="0" && op==3 &&claveIn!=claveR);
		 System.out.println("Gracias por preferirnos");
	}

}
