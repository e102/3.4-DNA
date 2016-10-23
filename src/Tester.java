public class Tester {

	public static void main(String[] args) {
		DNAStrand dna = new DNAStrand("ATGC");
		System.out.println("Original DNA Sequence: " + dna.toString());
		System.out.println(dna.containsSequence("ATG"));
		
		if (dna.isValidDNA()) {
			System.out.println("Is valid");
			System.out.println("Complement: " + dna.complementWC());
			System.out.println("WC Palindrome: " + dna.palindromeWC());
		} 
		else {
			System.out.println("Not Valid DNA");
		}
	}

}
