package creationalpattern;

public class phonebuild
{
                   public phonetype buildSonyCD()
                      { 
                                  phonetype cds=new phonetype();
                                 cds.addItem(new Sony());
                                 return cds;
	          }
	      public phonetype buildSamsungCD()
                       {
		     phonetype cds=new phonetype();
		     cds.addItem(new Samsung());
		     return cds;
                       }
}