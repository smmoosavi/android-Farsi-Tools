package farsiTools;


public class Tools {

	public static StringBuffer getCorrected(String s) {
		s = s.replace('ی', 'ي');
		s = s.replace('؛', ';');
		s = s.replace('،', ',');
		StringBuffer corrected = new StringBuffer();
		ArabicLigaturizer.shape(s.toCharArray(), corrected, 1);
		return corrected;
	}
	public static String fa(String s) {
		if(s == null){
			return null;
		}
		s = s.replace('ی', 'ي');
		s = s.replace('؛', ';');
		s = s.replace('،', ',');
		StringBuffer corrected = new StringBuffer();
		ArabicLigaturizer.shape(s.toCharArray(), corrected, 1);
		return corrected.toString();
	}
	

}
