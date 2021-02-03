import java.util.*;

public class DataManagement {
    public static void main(String args[]) {
        
        RandomAnalyzation random = new RandomAnalyzation();
        
        ArrayList<String> container = new ArrayList<>();
        
        int arrayLength = (int)(Math.random()*(12 - 1 + 1) + 1);
        int layer = 0;
        int length = 0;
        
        for(int i = 0; i < arrayLength; i++) {
            
            layer = (int)(Math.random()*(3 - 1 + 1) + 1);
            length = (int)(Math.random()*(9 - 2 + 1) + 2);
            
            Data dt = new Data(layer, length);
            
            container.add(dt.dataCapture());
        }//end for
        
        container = Sorter.orgByAlp(container);
        
        System.out.println(container + "\n\n");
        
        // System.out.println(Analyze.analyzed(container) + "\n\n");
        // System.out.println(Analyze.findInList(container, '0'));
        
        random.RA(container);
        
    }//end main
}//end DataManagement
