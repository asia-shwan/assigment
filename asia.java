import java.util.Scanner;
public class asia{
	public static void main(String[]args){
		Scanner a =new Scanner(System.in);
		System.out.println("pleas enter number of your name's ");
		int number=a.nextInt();
		char name []= new char[number];
		System.out.println("enter the letter");
		for(int i=0;i<name.length;i++){
			name[i]=a.next().charAt(0);
		}
		System.out.print("your name is: ");
		for(int i=0; i<name.length;i++){
			System.out.print(name[i]);
		}
		System.out.println("");
	}
}