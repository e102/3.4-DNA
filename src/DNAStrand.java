public class DNAStrand {
	
	private String base;
	
	public DNAStrand(String DNA){
		this.base = DNA;
	}
	
	public boolean isValidDNA(){
		if(base.length() <= 0){
			return false;
		}
		
		for(int i = 0; i < base.length(); i++){
			char z = base.charAt(i);
			if (z != 'A' || z != 'T' || z != 'C' || z != 'G'){
				return false;
			}
		}
		
		return true;
	}
}
