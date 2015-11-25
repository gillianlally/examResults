import javax.swing.JOptionPane;    

public class PUPIL 
{
    private String fName ;
    private String sName ; 
    private int mark ; 
    public PUPIL () 
    {
        fName = "" ; 
        sName = "" ;
        mark = 0 ; 
    }

    public void readPupilDetails(String dataItems)
    {
        //unpack string of row data into fields
        String[] rowItems = dataItems.split(",") ;

        // store each data item as instance property
        fName = rowItems[0] ;
        sName = rowItems[1] ; 
        mark = Integer.parseInt(rowItems[2]) ;

    }

    public String writeDetails()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        String memberData = "";
        memberData = memberData.concat(fName);
        memberData = memberData.concat(",");
        memberData = memberData.concat(sName);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Integer.toString(mark));
        return memberData;
    }

    public int getMark ()
    {
        return mark ;
    }
    
   
}