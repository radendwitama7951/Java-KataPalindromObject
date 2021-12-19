public class KataKerja extends Kata {
	//--------------- PRIVATE -----------------//
	private boolean isKataKerja;
	
	/* IS kata kerja
	 * @param str
	 * 
	 * memeriksa apakah kata
	 * yang di passing adalah
	 * kata kerja atau bukan.
	 * */
	private boolean isKataKerja (String str) {
		boolean result;
        
		switch (str.toLowerCase()) {
			case "bangun":
			case "diam":
			case "duduk":
			case "makan":
			case "minum":
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

		
		boolean state = this.isKataKerja;
		
		if ( isKataKerja(str) ) {
			this.isKataKerja = true;
			System.out.printf("Input \"%s\" termasuk kata kerja dasar\n", str);
		} else {
			System.out.printf("Input \"%s\" tidak ada di dalam data\n", str);
			if (!state) {
				super.setKata("null");
			};
		};
	};
	

	public KataKerja (String kata) {
		super(kata);
	};
}
