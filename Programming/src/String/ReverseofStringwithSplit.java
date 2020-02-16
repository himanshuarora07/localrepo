package String;

public class ReverseofStringwithSplit {
	public static void main(String[] args) {
		String str="mandir wahi bnwayenge";
		String[] array=str.split(" ");
		for (int i = array.length-1;i >= 0; i--) {
			
			System.out.print(array[i]+" ");
			
		}
	}

}
