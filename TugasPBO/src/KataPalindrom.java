public class KataPalindrom extends Kata {
	//--------------- PRIVATE -----------------//
	
	/* IS palindrom
	 * @param str
	 * 
	 * menentukan apakah string yang di
	 * inputkan palindrom (dibaca sama 
	 * bila dibaca dari depan maupun belakang).
	 * atau bukan
	 * */
	private boolean isPalindrom (String str) {
		int i,j;
		i = 0;
		j = str.length() - 1;
		
		
		while (j > i) {
			if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j))
				return false;
			else {
				++i;
				--j;
			}
		};
		
		
		return true;
	};
	
	
	//--------------- PUBLIC -----------------//
	public boolean isPalindrom;
	
	
	/* SET kata palindrom
	 * @override setKata
	 * @param kata
	 * */
	public void setKata (String str) {
		//super.setKata(kata);
		this.isKalimat = isKalimat(str);
		// System.out.printf("Str = %s\nisKalimat = %s\n", str, this.isKalimat ? "True":"False");

		str = this.isKalimat ? extractKata(str) : str;

		
		boolean state = this.isPalindrom;
		
		if ( isPalindrom(str) ) {
			this.isPalindrom = true;
			super.setKata(str);
		} else {
			System.out.printf("Input \"%s\" bukan kata palindrom !\n", str);
			if (!state) {
				super.setKata("null");
			};
		};
	};
	
	/* Constructor
	 * @override Kata()
	 * @param kata
	 * */	
	public KataPalindrom (String kata) {	
		super(kata);
	};
	
	
};