public class TranslateFrom {
	public static String translate(String word)
	{
		word = word.toLowerCase();

		int consonantIndex = word.length() - 3;

		return word.charAt(consonantIndex) + word.substring(0, consonantIndex);
	}
}
