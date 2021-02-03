public class Sorter {
    
    // byAlp  ----------------------------------------------------------------------------------------------------------------------
    private static ArrayList<String> byAlp(ArrayList<String> orig) {
        
        orig.sort(String::compareToIgnoreCase);
        
        return orig;
    }//end byLet
    
    // byLen  ----------------------------------------------------------------------------------------------------------------------
    private static ArrayList<String> byLen(ArrayList<String> orig) {
        
        orig.sort(Comparator.comparingInt(String::length));
        
        return orig;
    }//end byLen
    
     // byLenRev  ----------------------------------------------------------------------------------------------------------------------
    private static ArrayList<String> byLenRev(ArrayList<String> orig) {
        
        orig.sort(Comparator.comparingInt(String::length).reversed());
        
        return orig;
    }//end byLenRev
    
    // orgByAlp  ----------------------------------------------------------------------------------------------------------------------
    public static ArrayList<String> orgByAlp(ArrayList<String> orig) {
        
        return byAlp(orig);
    }//end orgByAlp
    
    // orgByLen  ----------------------------------------------------------------------------------------------------------------------
    public static ArrayList<String> orgByLen(ArrayList<String> orig) {
        
        return byLen(orig);
    }//end orgByLen
    
    // orgByLenRev ----------------------------------------------------------------------------------------------------------------------
    public static ArrayList<String> orgByLenRev(ArrayList<String> orig) {
        
        return byLenRev(orig);
    }//end orgByLenRev
}//end Sorter
