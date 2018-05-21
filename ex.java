package oi;
import java.util.PriorityQueue;
import java.util.Scanner;
public class ex28 {

	public static void main(String[] args) {
		Scanner LerS= new Scanner(System.in);
		PriorityQueue <Integer> pq1 = new PriorityQueue <Integer>();
	int variavel;
	System.out.print("Qual é a primeira variavel que quer introduzir?");
	variavel = LerS.nextInt();
	pq1.add(variavel);
	int variavel1;
	System.out.print("Qual é a segunda variavel que quer introduzir?");
	variavel1 = LerS.nextInt();
	pq1.add(variavel1);
	int variavel2;
	System.out.print("Qual é a terceira variavel que introduzir?");
	variavel2 = LerS.nextInt();
	pq1.add(variavel2);
	int variavel3;
	System.out.print("Qual é a quarta variavel que quer introduzir?");
	variavel3 = LerS.nextInt();
	pq1.add(variavel3);
	int variavel4;
	System.out.print("Qual é a quinta variavel que quer introduzir?");
	variavel4 = LerS.nextInt();
	pq1.add(variavel4);
	int variavel5;
	System.out.print("Qual é a sexta variavel que quer introduzir?");
	variavel5 = LerS.nextInt();
	pq1.add(variavel5);
	System.out.print ("Flia Original:" +pq1);
	System.out.print("A variavel à cabeça:" + pq1.element());
	
	

	}

}
