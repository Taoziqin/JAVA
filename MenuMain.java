package Menu;
import java.util.Scanner;
public class MenuMain {
	public static void main(String[] args) {
		MenuBase menu=new MenuBase();
		int i=1;
		Scanner scan=new Scanner(System.in);
		while(i!=0) {
			menu.show();
			int ID=scan.nextInt();
			menu.DoEvent(ID);
		}
	}
}
