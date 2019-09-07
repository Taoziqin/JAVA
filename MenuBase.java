package Menu;
import java.util.Scanner;
public class MenuBase {
	public MenuBase() {
	}
    public void show() {
    	System.out.println("**************数据结构*******************\n");
    	System.out.println("*\t1、线性表\n*\t2、栈和队列\n*\t3、串\n*\t0、退出\n");
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
    	System.out.println("选择线性表功能");
    	MenuList list=new MenuList();
    	list.show();
    	Scanner scan=new Scanner(System.in);
    	int ID=scan.nextInt();
    	list.DoEvent(ID);
    }
    public void OnStackAndQueue() {
    	System.out.println("选择栈和队列功能");
    	MenuStackAndQueue stackandqueue=new MenuStackAndQueue();
    	stackandqueue.show();
    	Scanner scan=new Scanner(System.in);
    	int ID=scan.nextInt();
    	stackandqueue.DoEvent(ID);
    }
    public void OnString() {
    	System.out.println("选择串功能");
    	MenuString string=new MenuString();
    	string.show();
    	Scanner scan=new Scanner(System.in);
    	int ID=scan.nextInt();
    	string.DoEvent(ID);
    }
    public void OnExit() {
    	System.out.println("已退出");
    }
    public void OnInvilidate() {
    	System.out.println("命令选项错误\n");
    }
}
