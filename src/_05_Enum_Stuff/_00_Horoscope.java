package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void horoscope(Zodiac input) {
		switch(input) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "1");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "2");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "3");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "4");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "5");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "6");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "7");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "8");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "9");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "10");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "11");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "12");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Something went wrong");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac sign;
		Random rand = new Random();
		int z = rand.nextInt(12);
		switch(z) {
		case 0:
			sign = Zodiac.ARIES;
			break;
		case 1:
			sign = Zodiac.TAURUS;
			break;
		case 2:
			sign = Zodiac.GEMINI;
			break;
		case 3:
			sign = Zodiac.CANCER;
			break;
		case 4:
			sign = Zodiac.LEO;
			break;
		case 5:
			sign = Zodiac.VIRGO;
			break;
		case 6:
			sign = Zodiac.LIBRA;
			break;
		case 7:
			sign = Zodiac.SCORPIO;
			break;
		case 8:
			sign = Zodiac.SAGITTARIUS;
			break;
		case 9:
			sign = Zodiac.CAPRICORN;
			break;
		case 10:
			sign = Zodiac.AQUARIUS;
			break;
		case 11:
			sign = Zodiac.PISCES;
			break;
		default:
			sign = Zodiac.ARIES;
			break;
		}
		System.out.println(sign);
		new _00_Horoscope().horoscope(sign);
	}
}
