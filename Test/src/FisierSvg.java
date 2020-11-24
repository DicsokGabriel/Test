public class FisierSvg implements Element{

    String nume;



    public FisierSvg(String nu){
        nume=nu;
    }

    public void print(){


        System.out.println("FisierSvg: "+this.nume);

    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
