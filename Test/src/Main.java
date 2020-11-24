public class Main {
    public static void main(String[] args) throws Exception {
        Director d=new Director("dir1");
        FisierTxt fis1 =new FisierTxt("fisier1");
        fis1.setAlignStrategy(new AlignCenter());
        FisierTxt fis2 =new FisierTxt("fisier2");
        fis2.setAlignStrategy(new AlignLeft());
        FisierTxt fis3 =new FisierTxt("fisier3");
        fis3.setAlignStrategy(new AlignRight());
        Director f=new Director("dirdin interor");

        d.AddElement(f);
        d.AddElement(fis1);
        d.AddElement(fis2);
        d.AddElement(fis3);

        d.AddElement(new FisierSvg("Svg File"));
        d.AddElement(new FisierMp3("Mp3File"));
        d.AddElement(new FisierTxt("TxtFile without align"));
        d.print();
        //d.printStatistics();
    }
}


/*Director: dir1
Director: dirdin interor
<<<<<fisier1>>>>>
<<<<<<fisier2
fisier3>>>>>>>
FisierSvg: Svg File
FisierMp3: Mp3File
TxtFile without align

Process finished with exit code 0
*/