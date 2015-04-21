/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteencode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlexandruG
 */
public class ByteEncode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = 1<<25;
        
        List<ObjValuesEnum> rez = new ArrayList<>();
        
        List<ObjValuesEnum> list = new ArrayList<>();
        list.add(ObjValuesEnum.E);
        list.add(ObjValuesEnum.B);
        list.add(ObjValuesEnum.A);
        list.add(ObjValuesEnum.F);        
        
        for(ObjValuesEnum o : ObjValuesEnum.values()){            
            result = (result << 1) | (list.contains(o)? 1 : 0);
        }
        System.out.println(Long.toBinaryString(result));
        
        for(ObjValuesEnum o : ObjValuesEnum.values()){
            if ((result & o.getBit()) != 0) {
                System.out.println(o.name());
            }
        }
        
        
    }
    
}
