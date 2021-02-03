public class Data {
    
    private int layer = 0;
    private int length = 0;
    
    public Data(int l, int size) {
        
        layer = l;
        length = size;
    }//end Data (constructor)
    
    private static String dataGen(int l, int length) {
        
        String info = "";
        
        char nextChar;
        
        int r = 0;
        
        if(l == 1) {
            
            for(int i = 0; i < length; i++) {
                
                char randomizer[] = {
                    
                    (char)(Math.random()*('Z' - 'A' + 1) + 'A'),
                    (char)(Math.random()*('z' - 'a' + 1) + 'a')
                    
                };
                
                r = (int)(Math.random()*((randomizer.length - 1) - 0 + 1) + 0);
                nextChar = randomizer[r];
                info = info + nextChar;
            }//end for
        }//end if
        
        else if(l == 2) {
            
            for(int i = 0; i < length; i++) {
                
                nextChar = (char)(Math.random()*('9' - '0' + 1) + '0');
                info = info + nextChar;
            }//end for
        }//end else if
        
        else if(l == 3) {
            
            for(int i = 0; i < length; i++) {
                
                char randomizer[] = {
                    
                    (char)(Math.random()*('Z' - 'A' + 1) + 'A'),
                    (char)(Math.random()*('z' - 'a' + 1) + 'a'),
                    (char)(int)(Math.random()*('9' - '0' + 1) + '0'),
                    (char)(int)(Math.random()*('9' - '0' + 1) + '0')
                
                };
                
                r = (int)(Math.random()*((randomizer.length - 1) - 0 + 1) + 0);
                nextChar = randomizer[r];
                info = info + nextChar;
            }//end for
        }//end else if
        
        else if(l >= 4 || l <= 0) {
            
            throw new IllegalArgumentException("data layer is greater than or less than the given measures");
            
        }//end else if
        
        return info;
    }//end dataGen
    
    public String dataCapture() {
        
        return dataGen(layer, length);
    }//end dataCapture;
}//end Data
