//Polynomial class

public class Polynomial {
    int degcoeff[];
    Polynomial(){
        degcoeff=new int[10];
    }
	public void setCoefficient(int degree, int coeff){
           if(degree>degcoeff.length-1){
               int temp[]=degcoeff;
               degcoeff=new int[degree+1];
               for(int i=0;i<temp.length;i++){
                   degcoeff[i]=temp[i];
               }
           }
        degcoeff[degree]=coeff;
    }

    public int getcoeff(int degree){
        if(degree<this.degcoeff.length){
            return degcoeff[degree];
        }
        else{
            return 0;
        }
    }
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
	public void print(){
         for(int i=0;i<degcoeff.length;i++) {
            if(degcoeff[i] != 0 ) {
                System.out.print(degcoeff[i] +"x"+i+" ");
            }
        }

	}


	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        Polynomial resultAdd = new Polynomial();
        int p1=this.degcoeff.length;
        int p2=p.degcoeff.length;
        int len=Math.min(p1,p2);
        int i;
        for(i=0;i<len;i++) {
            resultAdd.setCoefficient(i,this.degcoeff[i]+p.degcoeff[i]);
        }
        while(i<p1){
            resultAdd.setCoefficient(i,this.degcoeff[i]);
            i++;
        }
        while(i<p2){
            resultAdd.setCoefficient(i,p.degcoeff[i]);
            i++;
        }
        return resultAdd;

	}
 // Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        Polynomial resultSub = new Polynomial();
	int p1=this.degcoeff.length;
	int p2=p.degcoeff.length;
	int len=Math.min(p1,p2);
	int i;
	for(i=0;i<len;i++) {
	resultSub.setCoefficient(i,this.degcoeff[i]-p.degcoeff[i]);
	}
	while(i<p1){
	resultSub.setCoefficient(i,this.degcoeff[i]);
	i++;
	}
	while(i<p2){
	resultSub.setCoefficient(i,-p.degcoeff[i]);
        i++;
	}
	return resultSub;
	}
	// // Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial ans=new Polynomial();
       for(int i=0;i<this.degcoeff.length;i++){
           for(int j=0;j<p.degcoeff.length;j+=1){
               int termdeg=i+j;
               int termcoeff=this.degcoeff[i]*p.degcoeff[j];
               int oldcoeff=ans.getcoeff(termdeg);
               ans.setCoefficient(termdeg , termcoeff + oldcoeff);
           }
        }
        return ans;
	}
}


