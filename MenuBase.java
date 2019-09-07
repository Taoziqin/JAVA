package Menu;
import java.util.Scanner;
public class MenuBase {
	public MenuBase() {
	}
    public void show() {
    	System.out.println("**************���ݽṹ*******************\n");
    	System.out.println("*\t1�����Ա�\n*\t2��ջ�Ͷ���\n*\t3����\n*\t0���˳�\n");
    	System.out.println("*****************************************");
    }
    public void DoEvent(int ID) {
    	switch (ID)
    	{
    	case 1:
    		OnList();
    		break;
    	case 2:
    		OnStackAndQueue();
    		break;
    	case 3 :
    		OnString();
    		break;
    	case 0:
    		OnExit();
    		break;
    	default:
    		OnInvilidate();
    		break;
    	}
    }
    public void OnList() {
    	System.out.println("ѡ�����Ա���");
    	MenuList list=new MenuList();
    	list.show();
    	Scanner scan=new Scanner(System.in);
    	int ID=scan.nextInt();
    	list.DoEvent(ID);
    }
    public void OnStackAndQueue() {
    	System.out.println("ѡ��ջ�Ͷ��й���");
    	MenuStackAndQueue stackandqueue=new MenuStackAndQueue();
    	stackandqueue.show();
    	Scanner scan=new Scanner(System.in);
    	int ID=scan.nextInt();
    	stackandqueue.DoEvent(ID);
    }
    public void OnString() {
    	System.out.println("ѡ�񴮹���");
    	MenuString string=new MenuString();
    	string.show();
    	Scanner scan=new Scanner(System.in);
    	int ID=scan.nextInt();
    	string.DoEvent(ID);
    }
    public void OnExit() {
    	System.out.println("���˳�");
    }
    public void OnInvilidate() {
    	System.out.println("����ѡ�����\n");
    }
}
