import javax.swing.JOptionPane;    
import java.io.* ;

public class TOPPUPIL 
{
    // array of PUPIL objects
    private PUPIL pupilList [] ;
    // number of pupils to be calculated after reading file
    int noOfPupils ; 
    FILEREADCSV examDataFile ;

    public TOPPUPIL () 
    {
        examDataFile = new FILEREADCSV () ;
    }

    public void processPUPIL() throws IOException
    {
        //
        setUppupilList () ;
        countTopMark () ;

    }

    private void setUppupilList() throws IOException
    {
        // first user message

        // First user message
        System.out.println("ScotFit Club: Membership BMI update");
        System.out.println("** Preparing to read data file.");

        // read file, fetch data as String array containing the rows
        String[] dataRows = examDataFile.readCSVtable();
        // calculate the number of member rows, skip headings
        noOfPupils= dataRows.length - 1;

        // update user with number of rows with membership details
        System.out.println("** " + noOfPupils + " rows read.\n\n");
    }

    public void countTopMark ()
    {
        // placeholder
    }
}

