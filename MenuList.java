package Menu;

public class MenuList extends MenuBase{
	public MenuList() {
		
	}
	public void show() {
		System.out.println("**************线性表*******************\n");
    	System.out.println("*\t1、插入\n*\t2、删除\n*\t3、遍历\n*\t4、退出\n");
    	System.out.println("*****************************************");
	}
	public void DoEvent(int ID) {
    	switch (ID)
    	{
    	case 1:
    		OnInsert();
    		break;
    	case 2:
    		OnDelete();
    		break;
    	case 3 :
    		OnTraverse();
    		break;
    	case 4:
    		OnExit();
    		break;
    	default:
    		OnInvilidate();
    		break;
    	}
	}
	public void OnInsert() {
		System.out.println("选择线性表插入功能");
	}
	public void OnDelete() {
		System.out.println("选择线性表删除功能");
	}
	public void OnTraverse() {
		System.out.println("选择线性表遍历功能");
	}
}
