/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteencode;

/**
 *
 * @author AlexandruG
 */
public enum ObjValuesEnum {
    A(1<<5),B(1<<4),C(1<<3),D(1<<2),E(1<<1),F(1<<0);
    
    private long bit;

    private ObjValuesEnum(long bit) {
        this.bit = bit;
    }

    public long getBit() {
        return bit;
    }

    public void setBit(long bit) {
        this.bit = bit;
    }
}
