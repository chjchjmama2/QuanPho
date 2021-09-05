/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goiClass;

/**
 *
 * @author Quang Truong
 */
public class User {
    private int iduser;
    private String hotenString;
    private String UserString;
    private String PassString;
    private String sdtString;

    public void setHotenString(String hotenString) {
        this.hotenString = hotenString;
    }

    public void setSdtString(String sdtString) {
        this.sdtString = sdtString;
    }

    public String getHotenString() {
        return hotenString;
    }

    public String getSdtString() {
        return sdtString;
    }
    
    public User() {
        
    }

    public String getUserString() {
        return UserString;
    }

    public String getPassString() {
        return PassString;
    }

    public void setUserString(String UserString) {
        this.UserString = UserString;
    }

    public void setPassString(String PassString) {
        this.PassString = PassString;
    }   
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIduser() {
        return iduser;
    }
}
