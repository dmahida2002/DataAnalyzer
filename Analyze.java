public class Analyze {
    
    protected static String analyzed(ArrayList<String> figures) {
        
        String information = "";
        String stringLengthInfo = "";
        String numberInfo = "";
        String letInfo = "";
        
        int stringLength = 0;
        int spaces = 0;
        
        for(int i = 0; i < figures.size(); i++) {
             
             String sample = figures.get(i);
                 
             char[] chars = sample.toCharArray();
                 
             StringBuilder build = new StringBuilder();
             StringBuilder buildLet = new StringBuilder();
             
             for(char c : chars) {
                 
                 if(Character.isDigit(c)) {
                     
                     build.append(c);
                 }//end if
                 
                 if(Character.isLetter(c)) {
                     
                     buildLet.append(c);
                 }//end if
             }//end inner for
             
             int size = build.length();
             int sizeLet = buildLet.length();
             int interval = 1;
             
             StringBuilder space = new StringBuilder(build);
             StringBuilder spaceLet = new StringBuilder(buildLet);
             
             for(int j = 0; j < build.length() / interval; j++) {
                 
                //  if((j + 1) == (build.length() / interval) - 1) {
                     
                //      space.insert(((j + 1) * interval) + j, " and ");
                //  }//end if
                 
                 if((j + 1) < (build.length() / interval)) {
                     
                     space.insert(((j + 1) * interval) + j, " ");
                 }//end else of
             }//end inner for
             
             for(int j = 0; j < buildLet.length() / interval; j++) {
                 
                //  if((j + 1) == (build.length() / interval) - 1) {
                     
                //      spaceLet.insert(((j + 1) * interval) + j, " and ");
                //  }//end if
                 
                 if((j + 1) < (buildLet.length() / interval)) {
                     
                     spaceLet.insert(((j + 1) * interval) + j, " ");
                 }//end else of
             }//end inner for
             
             String numWithCom = space.toString();
             String letWithCom = spaceLet.toString();
             
             if(size == 0) {
                 
                 stringLengthInfo = "This data has a length of " + stringLength + "\n";
                 stringLength = (figures.get(i).length());
                 spaces = ((Integer.toString((i + 1))).length() + 2);
                 
                 if((i + 1) < figures.size()) {
                     
                     letInfo = "There are a total of " + sizeLet + " letters is this data. The letters are: " + letWithCom +"\n\n";
                 }//end if
                 
                 else if((i + 1) == figures.size()) {
                     
                     letInfo = "There are a total of " + sizeLet + " letters is this data. The letters are: " + letWithCom;
                 }//end else if
                 
                 information = information + (i + 1) + ") This data contains Strings\n"
                 + String.format("%" + (spaces) + "s" + stringLengthInfo, "")
                 + String.format("%" + (spaces) + "s" + letInfo, "");
             }//end if
             
             else if(size >= 1 && size < figures.get(i).length()) {
                 
                 stringLength = (figures.get(i).length());
                 stringLengthInfo = "This data has a length of " + stringLength + "\n";
                 spaces = ((Integer.toString((i + 1))).length() + 2);
                 
                 if(size == 1) {
                     
                     numberInfo = "There is a total of " + size + " number in this data. The number is: " + numWithCom;
                     
                 }//end if
                 
                 if(sizeLet == 1) {
                     
                     letInfo = "There is a total of " + sizeLet + " letter is this data. The letter is: " + letWithCom;
                 }//end if
                 
                 if(size > 1) {
                     
                     numberInfo = "There are a total of " + size + " numbers in this data. The numbers are: " + numWithCom;
                 }//end else if
                 
                 if(sizeLet > 1) {
                     
                     letInfo = "There are a total of " + sizeLet + " letters is this data. The letters are: " + letWithCom;
                 }//end if
                 
                 if((i + 1) < figures.size()) {
                     
                     information = information + (i + 1) + ") This data contains Strings and integers\n"
                     + String.format("%" + (spaces) + "s" + stringLengthInfo, "")
                     + String.format("%" + (spaces) + "s" + numberInfo, "") + "\n"
                     + String.format("%" + (spaces) + "s" + letInfo, "") + "\n\n";
                 }//end if
                 
                 else if((i + 1) == figures.size()) {
                     
                     information = information + (i + 1) + ") This data contains Strings and integers\n"
                     + String.format("%" + (spaces) + "s" + stringLengthInfo, "")
                     + String.format("%" + (spaces) + "s" + numberInfo, "") + "\n"
                     + String.format("%" + (spaces) + "s" + letInfo, "");
                 }//end else if
             }//end else if
             
             else if(size == figures.get(i).length()) {
                 
                 stringLength = (figures.get(i).length());
                 stringLengthInfo = "This data has a length of " + stringLength + "\n";
                 numberInfo = "There are a total of " + size + " numbers in this data. The numbers are: " + numWithCom;
                 spaces = ((Integer.toString((i + 1))).length() + 2);
                 
                 if((i + 1) < figures.size()) {
                     
                     information = information + (i + 1) + ") This data contains integers\n"
                     + String.format("%" + (spaces) + "s" + stringLengthInfo, "")
                     + String.format("%" + (spaces) + "s" + numberInfo, "") + "\n\n";
                 }//end if
                 
                 else if((i + 1) == figures.size()) {
                     
                     information = information + (i + 1) + ") This data contains integers\n"
                     + String.format("%" + (spaces) + "s" + stringLengthInfo, "")
                     + String.format("%" + (spaces) + "s" + numberInfo, "");
                 }//end else if
             }//end else 
        }//end for
        
        return information;
    }//end analyzed
    
    protected static String findInList(ArrayList<String> figures, char let) {
        
        String result = "";
        String info = "";
        String indexMark = "";
        String elementMark = "";
        
        int counter = 0;
        
        for(int i = 0; i < figures.size(); i++) {
            
            counter = 0;
            indexMark = "";
            
            for(int j = 0; j < figures.get(i).length(); j++) {
                
                if(let == figures.get(i).charAt(j)) {
                    
                    counter = counter + 1;
                    indexMark = indexMark + (j + 1);
                }//end if
                
                if((j + 1) == figures.get(i).length() && counter >= 1) {
                    
                    elementMark = elementMark + (i + 1) + " ";
                    
                    StringBuilder indexCom = new StringBuilder(indexMark);
                    
                    for(int k = 0; k < (indexMark.length() / 1); k++) {
                        
                        if((k + 1) < (indexMark.length() / 1)) {
                            
                            indexCom.insert(((k + 1) * 1) + k, " ");
                        }//end inner if
                    }//end inner for
                    
                    String indexMarkCom = indexCom.toString();
                    
                    info = info + "\"" + let + "\"" + " was found x" + counter + " in element " + (i + 1) + " (String index " + indexMarkCom + ")\n";
                }//end if
            }//end inner for
        }//end for
        
        if(elementMark.length() == 1) {
            
            result = "The character \"" + let + "\"" + " was found in element " + elementMark + "\n"
            + info;
        }//end if
        
        else if(elementMark.length() > 1) {
            
            // StringBuilder elementCom = new StringBuilder(elementMark);
            
            // for(int k = 0; k < (elementMark.length() / 1); k++) {
                
            //     if((k + 1) < (elementMark.length() / 1)) {
                    
            //         elementCom.insert(((k + 1) * 1) + k, " ");
            //     }//end if
            // }//end for
            
            // String elementMarkCom = elementCom.toString();
            
            result = "The character \"" + let + "\"" + " was found in elements " + elementMark + "\n"
            + info;
        }//end else if
        
        else if(elementMark.length() == 0) {
            
            result = "The character \"" + let + "\"" + " was found not found in this data set";
        }//end else if
        
        return result;
    }//end findInList
}//end Analyze
