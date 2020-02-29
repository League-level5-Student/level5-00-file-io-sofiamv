package _02_File_Encrypt_Decrypt;

public class Encryption {

	public String encryptor(String a) {
		a = a.replace('a', '7');
		a = a.replace('i', '3');
		a = a.replace('o', '9');
		a = a.replace('e', '2');
		a =a.replace('u', '5');
		return a;
	}
	
	public String decryptor(String a) {
		a = a.replace('7', 'a');
		a = a.replace('3', 'i');
		a = a.replace('2', 'e');
		a = a.replace('5', 'u');
		a = a.replace('9', 'o');
		return a;
	}
}
