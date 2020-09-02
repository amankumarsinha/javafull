package creationalpattern;
public class BuilderDemo{
    public static void main(String args[]){
   phonebuild phonebuild=new phonebuild();
   phonetype phonetype1=phonebuild.buildSonyCD();
   phonetype1.showItems();
    phonetype phonetype2=phonebuild.buildSamsungCD();
   phonetype2.showItems();
}
}
