package accessmodifier;

public class AccessModifier {
	
	public void dispInfo()
	{
		System.out.println("Public Access Modifier");
	}

	private void dispInfo1()
	{
		System.out.println("Private Access Modifier");
	}
	
	protected void dispInfo2()
	{
		System.out.println("Protected Access Modifer");
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.dispInfo();
		am.dispInfo1();
		am.dispInfo2();
		// TODO Auto-generated method stub

	}

}
