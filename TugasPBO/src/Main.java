import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		boolean valid, lagi = true;
		Scanner scan;
		
		/* Membuat instansi objek kata palindrom.
		 * 
		 * @argument "Sugu fsa fuhf iwf wf uwhaf fugc faskjf jso"
		 * Jika kata pertama dari argumen yang dimasukkan  
		 * bukan kata palindrom, maka nilai "iniPalindrom.kata"
		 * adalah string "null"
		 * 
		 *  
		 * */
		Kata iniPalindrom = new KataPalindrom("Sugu fsa fuhf iwf wf uwhaf fugc faskjf jso");
		System.out.printf("iniPalindrom.kata = ");
		iniPalindrom.printKata();
		System.out.println();
		
		/* Membuat instansi objek kata kasar.
		 * 
		 * @argument "Asik"
		 * Jika kata pertama dari argumen yang dimasukkan  
		 * bukan kata kzxzf, maka nilai "iniKataKasar.kata"
		 * adalah string "null"
		 * 
		 * */
		Kata iniKataKasar = new KataKasar("Asik");
		System.out.printf("iniPalindrom.kata = ");
		iniKataKasar.printKata();
		System.out.println();


		
		/* Mengubah "iniPalindrom.kata" secara
		 * hardcode.
		 * 
		 * @argument "Katak kodok"
		 * Jika kata pertama dari argumen yang dimasukkan  
		 * adalah kata palindrom, maka nilai "iniPalindrom.kata"
		 * adalah string kata pertama tersebut.
		 * 
		 * */
		System.out.println("Kata \"Katak\" adalah palindrom");
		iniPalindrom.setKata("Katak kodok");
		System.out.printf("iniPalindrom.kata = ");
		iniPalindrom.printKata();
		System.out.println();

		
		
		do {
			/* Mengubah "iniPalindrom.kata" dengan
			 * input user melalui console.
			 * 
			 * 
			 * */
			iniPalindrom.setKata(iniPalindrom.inputKata());
			System.out.printf("iniPalindrom.kata = ");
			iniPalindrom.printKata();
			System.out.println();
	
			/* Input lagi ?
			 * */
			do {		
				System.out.printf("Coba lagi ? (True/False) ");
				scan = new Scanner(System.in);
				if (!scan.hasNextBoolean()) {
					System.out.printf("Ketikan \"True\" untuk input lagi, atau \"False\" untuk keluar\n");
					valid = false;
				} else {
					lagi = scan.nextBoolean();
					valid = true;
				};
			} while (!valid);
			System.out.println();
		
		} while (lagi);
		
		scan.close();
		iniPalindrom.finalize();
		System.out.printf("Terima Kasih telah mencoba :)\n");
		
		
	};
		
};


