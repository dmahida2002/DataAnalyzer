public class RandomAnalyzation extends Analyze {
    
    
    public static void RA(ArrayList<String> figures) {
        
        String AS = "";
        
        int select = (int)(Math.random()*(2 - 1 + 1) + 1);
        
        if(select == 1) {
            
            AS = analyzed(figures);
        }//end if
        
        if(select == 2) {
            
            char randomizer[] = {
                
                (char)(Math.random()*('Z' - 'A' + 1) + 'A'),
                (char)(Math.random()*('z' - 'a' + 1) + 'a'),
                (char)(int)(Math.random()*('9' - '0' + 1) + '0'),
                (char)(int)(Math.random()*('9' - '0' + 1) + '0'),
                
            };
            
            int r = (int)(Math.random()*((randomizer.length - 1) - 0 + 1) + 0);
            
            AS = findInList(figures,randomizer[r]);
        }//end if
        
        System.out.println(AS);
    }//end RA
}//end RandomAnalyzation
