public class DNAStrand {
	
	private String base;
	StringBuilder s = new StringBuilder();
	
	public DNAStrand(String DNA){
		this.base = DNA;
	}
	
	public boolean isValidDNA(){
		if(base.length() <= 0){
			return false;
		}
		
		for(int i = 0; i < base.length(); i++){
			char z = base.charAt(i);
			if (z != 'A' && z != 'T' && z != 'C' && z != 'G'){
				System.out.println("Bad value");
				return false;
			}
		}
		
		return true;
	}
	
	public String complementWC(){
		s.setLength(0);
		for (int i = 0; i < base.length(); i++) {
			char z = base.charAt(i);
			if(z == 'A'){
				s.append('T');
			}
			if(z == 'T'){
				s.append('A');
			}
			if(z == 'G'){
				s.append('C');
			}
			if(z == 'C'){
				s.append('G');
			}
		}
		
		return(s.toString());
	}
	
	public String palindromeWC(){
		s.setLength(0);
		String palindrome = this.complementWC();
		s.setLength(0);
		s.append(palindrome);
		s.reverse();
		return(s.toString());
	}
	
	public boolean containsSequence(String seq){
		if(base.contains(seq)){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return(base.toString());
	}
}
