package offficeHour.Encapsulation;

public class UserInfo {
    private String userName,
                   passWord,
                   ssn;

    public UserInfo(){ //Default values
        setUserName("Unknown");
        setSsn("00000000");
        setPassWord("123456");
    }

    public String getuserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getSsn(){
        return ssn;
    }
    public void setSsn(String ssn){
        this.ssn= ssn;
    }

    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String passWord){
        this.passWord=passWord;
    }


}
