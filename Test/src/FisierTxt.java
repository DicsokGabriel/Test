public class FisierTxt implements Element{
    String nume;
    AlignStrategy alignStrategy;


    public FisierTxt(String nu){

        nume=nu;

    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.nume);
        }else{
            alignStrategy.render(this.nume);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}


