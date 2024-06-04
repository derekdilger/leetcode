import java.lang.Character.*;

public class testing {
	public static void main(String[] args) {
		Character a = Character.valueOf('a');
		Character A = Character.valueOf('A');
		int char_a_val = a.charValue();
		int char_A_val = A.charValue();
		System.out.println(Integer.toString(char_a_val));
		System.out.println(Integer.toString(char_A_val));
	}
}
