package codding0705.lottoNumGen;

public class LottoNumGen {
	int[] lotto=new int[6];
	public static void main(String[] args){
		LottoNumGen myLotto=new LottoNumGen();
		myLotto.numGen();
		myLotto.sortNum();
		myLotto.prtLotto();
	}
	
	void numGen(){
		for(int i=0;i<lotto.length;i++){
			lotto[i]=(int)(Math.random()*45+1);
			if(i>=1){
				for(int j=0;j<i;j++){
					if(lotto[i]==lotto[j]){
						--i;
					}
				}
			}
		}
	}
	
	void prtLotto(){
		System.out.println("당신의 로또 번호는...");
		System.out.println("=====================");
		for(int i=0;i<lotto.length;i++){
			System.out.print(lotto[i]+"  ");
		}
		System.out.println("=====================");
	}
	
	
	void sortNum(){
		int temp;
		for(int i=0;i<(lotto.length-1);i++){
			for(int j=i+1;j<lotto.length;j++){
				if(lotto[i]<lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
	}
}
