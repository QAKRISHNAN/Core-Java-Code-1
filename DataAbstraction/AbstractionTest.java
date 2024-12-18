package DataAbstraction;

public class AbstractionTest {

	public static void main(String[] args) {
		
		ChildSBI sbiir=new ChildSBI();
		sbiir.FixedDeposit();
		
		ChildHDFC hdfcir=new ChildHDFC();
		hdfcir.FixedDeposit();

	}

}
