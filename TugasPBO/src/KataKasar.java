public class KataKasar extends Kata {
	//--------------- PRIVATE -----------------//
	private boolean isKataKasar;
	
	/* IS kata kasar
	 * @param str
	 * 
	 * memeriksa apakah kata
	 * yang di passing adalah
	 * kata kasar atau bukan.
	 * */
	private boolean isKataKasar (String str) {
		boolean result;
		switch (str.toLowerCase()) {
			case "bangsat":
			case "bajingan":
			case "keparat":
			case "anjay":
			case "bedebah":
				result = true;
				break;
			default:
				result = false;
				break;
		};
		return result;
	};
	
	//--------------- PUBLIC -----------------//
	
	/* SET kata palindrom
	 * @override setKata
	 * @param kata
	 * */
	public void setKata (String str) {
		//super.setKata(kata);
		this.isKalimat = isKalimat(str);
		// System.out.printf("Str = %s\nisKalimat = %s\n", str, this.isKalimat ? "True":"False");

		str = this.isKalimat ? extractKata(str) : str;

		
		boolean state = this.isKataKasar;
		
		if ( isKataKasar(str) ) {
			this.isKataKasar = true;
			super.setKata(str);
		} else {
			System.out.printf("Input \"%s\" bukan kata kasar !\n", str);
			if (!state) {
				super.setKata("null");
			};
		};
	};
	

	public KataKasar (String kata) {
		super(kata);
	};
}
