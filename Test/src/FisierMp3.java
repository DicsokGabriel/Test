public class FisierMp3 implements Element{

    String nume;



    public FisierMp3(String nu){
        nume=nu;
    }




    public void print(){


        System.out.println("FisierMp3: "+this.nume);

    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
