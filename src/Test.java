import farsiTools.Tools;

public class Test {
	public static void main(String[] args) {
		String T1 = "متن";
		String T2 = Tools.fa(T1);
		char[] at1 = T1.toCharArray();
		char[] at2 = T2.toCharArray();
		for (int i = 0; i < at1.length; i++) {
			char c = at1[i];
			System.out.print((int) c + "\t");
		}
		System.out.println();
		for (int i = 0; i < at2.length; i++) {
			char c = at2[i];
			System.out.print((int) c + "\t");
		}
		System.out.println();
		for (int i = 0; i < at2.length; i++) {
			char c = at2[i];
			System.out.print(c + "\t");
		}
	}
}
