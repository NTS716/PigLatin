public class TranslateTo {

	public static String translate(String word)
	{
		word = word.toLowerCase();
		return word.substring(1) + word.charAt(0) + "ay";
	}
}
