
public class calc {
	public int Eval(String inputStr) {
		int multiply = 1;
		for(String str: inputStr.split("\\*")) {
			multiply *= Integer.valueOf(str);
		}
		return multiply;
	}
}
