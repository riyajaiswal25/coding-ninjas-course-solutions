//Complex Number Class
public class ComplexNumbers {
    private int R,I;//data members
   public ComplexNumbers(int R,int I){//Constructor for initialization
       this.R=R;
       this.I=I;
   }

        public void plus(ComplexNumbers c2){//member function plus for addition
       this.R=this.R+c2.R;
       this.I=this.I+c2.I;

   }

        public void multiply(ComplexNumbers c2){//member function multiply for multiplication
            int x,y;
       x=(this.R*c2.R)-(this.I*c2.I); //a_real * b_real - a_img * b_img
       y=this.R*c2.I+this.I*c2.R;//a_real * b_img + a_img * b_real
            this.R=x;//Storing back into same complex no.
            this.I=y;
       }

   public void print(){
       System.out.println(this.R+" + "+"i"+this.I);//printing the result
   }
}
