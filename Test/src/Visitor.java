public interface Visitor {


    void visit(Director d);
    void visit(FisierTxt f1);
    void visit(FisierSvg f2);
    void visit(FisierMp3 f3);

}
