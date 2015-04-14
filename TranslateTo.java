public class TranslateTo {

	private static Character[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's',  't', 'v', 'w', 'x', 'y', 'z'}; 

	public static String translate(String word)
	{
	

		StringBuilder string = new StringBuilder(word);
		String lowerString = string.toString().toLowerCase();

		int consonantIndex = 0;
		
outerloop:
		for (int ch = 0; ch < string.length(); ch++) {

			for (int consonant = 0; consonant < consonants.length; consonant++) {

				if (lowerString.charAt(ch) == consonants[consonant]) {
					consonantIndex = lowerString.indexOf(lowerString.charAt(ch));
					break outerloop;
				}
			}
		}

		String beforeConsonant = lowerString.charAt(consonantIndex) + "ay";
		String afterConsonant = lowerString.substring(consonantIndex + 1);
		return afterConsonant + beforeConsonant;
	}
	
}
