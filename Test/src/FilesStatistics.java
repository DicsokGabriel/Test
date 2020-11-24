public class FilesStatistics implements Visitor{

    int fisieremp3=0,fisieretxt=0,fisieresvg=0,dir=0;

    @Override
    public void visit(Director d) {
        dir=dir+1;
    }
    @Override
    public void visit(FisierTxt f) {
        fisieretxt=fisieretxt+5;
    }
    @Override
    public void visit(FisierSvg f1) {
        fisieresvg=fisieresvg+45;
    }
    @Override
    public void visit(FisierMp3 f2) {
        fisieremp3=fisieremp3+1024*3;
    }

    public void printStatistics(){
        System.out.println("FisierTxt: "+fisieretxt+"\nFisierSvg: "+fisieresvg+"\nFisierMp3: "+fisieremp3);
    }
}
