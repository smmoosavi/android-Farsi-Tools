package farsiTools;

public class Tools {

	public static Boolean enable = true;

	public static String fa(String s) {
		if (s == null) {
			return null;
		}

		if (!enable) {
			return s;
		}
		s = s.replace((char) 1740, (char) 1610);
		s = s.replace((char) 1563, (char) 59);
		s = s.replace((char) 1548, (char) 44);
		StringBuffer corrected = new StringBuffer();
		ArabicLigaturizer.shape(s.toCharArray(), corrected, 1);
		return corrected.toString();
	}

}
