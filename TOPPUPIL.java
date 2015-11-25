import javax.swing.JOptionPane;    
import java.io.* ;

public class TOPPUPIL 
{
    // array of PUPIL objects 
    private PUPIL pupilList [] ;
    //number of members to be calculated after reading file
    int noOfPUPILS ; 
    FILEREADCSV examDataFile ;

    public TOPPUPIL() 
    {  
        examDataFile = new FILEREADCSV () ; 
    }

    //top level algorithm 
    public void processPUPILS () 
    {
        setUppupilList () ; 
        counttopMark () ; 
    }

    private void setUppupilList () 
    {
        //placeholder
    }

    public void counttopMark () 
    {
        // placeholder
    }
}

// member = pupil
//club = toppupil
//bmi = topmark
//bmiFile = examDataFile 