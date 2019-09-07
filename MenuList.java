package Menu;

public class MenuList extends MenuBase{
	public MenuList() {
		
	}
	public void show() {
		System.out.println("**************���Ա�*******************\n");
    	System.out.println("*\t1������\n*\t2��ɾ��\n*\t3������\n*\t4���˳�\n");
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
		System.out.println("ѡ�����Ա���빦��");
	}
	public void OnDelete() {
		System.out.println("ѡ�����Ա�ɾ������");
	}
	public void OnTraverse() {
		System.out.println("ѡ�����Ա��������");
	}
}
