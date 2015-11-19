import javax.swing.JOptionPane;    

public class PUPIL
{
    private String fName;
    private String sName;
    private float mark;
    private float topMark;

    public PUPIL()
    {
        // initialise instance variables
        fName = "";
        sName = "";
        mark = 0.0f;
        topMark = 0.0f;
    }

    // file handling store details from file
    public void readPupilDetails(String dataItems)
    {
        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");
        // store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];
        mark = Float.parseFloat(rowItems[2]);

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
        return memberData;
    }

    public float gettopMark() 
    {
        return topMark;
    }

    public void displayDetails()
    {
        // output basic details
        System.out.print("Pupil: " + fName + " " + sName);
        System.out.print(",  top mark is: ");
        System.out.println();
    }

}

