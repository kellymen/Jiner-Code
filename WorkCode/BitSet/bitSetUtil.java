
public static void bitSetToFile(BitSet bitSet, String path) {  
  
        Writer w = null;  
        try {    
            w = new FileWriter(new File(path));    
            w.write(DatatypeConverter.printHexBinary(bitSet.toByteArray()));   
        } catch (IOException e) {  
            
        } finally {  
            if (w != null)  
                try {  
                    w.close();  
                } catch (IOException e) {  
                    // code....  
                    throw new RuntimeException("<bitSetToFile>io流关闭失败");  
                }  
        }  
} 
    
public static BitSet fileToBitset(String path) {  
  
        FileInputStream fs = null;  
        try {
            File file  new File(path);
            Long fileLength = file.length();
            byte[] fileContent = new byte[fileLength.intValue()];
            fs = new FileInputStream(file);    
            fs.read(fileContent);
            return BitSet.valueOf(DatatypeConverter.parseHexBinary(new String(fileContent)));
        } catch (IOException e) {  
            
        } finally {  
            if (fs != null)  
                try {  
                    fs.close();  
                } catch (IOException e) {  
                    // code....  
                    throw new RuntimeException("<fileToBitset>io流关闭失败");  
                }  
        }  
        return null;
    } 
