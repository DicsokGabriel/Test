import java.util.ArrayList;

public class Director implements Element{
    String nume;
    protected ArrayList<Element> elements = new ArrayList<>();

    public Director(String n){
        nume=n;
    }
    public void AddElement(Element elm){
        elements.add(elm);

    }

    public void print(){
        System.out.println("Director: "+nume);
        for(Element i : elements){
            i.print();
        }
    }

  /*  public void accept(Visitor v) {

        v.visit(this);
        for (Element i:elements){
            i.accept(v);
        }
    }*/


}
