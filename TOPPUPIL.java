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

    public void processPUPIL(String dataItems)
    {
       //
       setUppupilList () ;
       countTopMark () ;

    }

    private void setUppupilList()
    {
      // placeholder
    }
    
    public void countTopMark ()
    {
     // placeholder
    }
}