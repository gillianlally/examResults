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
    public void processPUPILS () throws IOException
    {
        setUppupilList () ; 
        counttopMark () ; 
    }

    private void setUppupilList () throws IOException 
    {
        //first user message
        System.out.println("Feeback of marks" ) ;
        System.out.println("** Preparing to read data file.") ;
        
        // read file, fetch data as String array containing the rows
        String[] datarows = examDataFile.readCSVtable () ;
        
        //calculate the number of member rows, skip headings
        noOfPUPILS = datarows.length - 1 ;
        
        // update user with number of rows with membership details
        System.out.println ("** " + noOfPUPILS +  " rows read . /n/n") ;
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