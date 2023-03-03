package BackEnd.MB;

import BackEnd.BO.AccountBO;
import BackEnd.Objects.Register;

public class AccountMB implements BackEnd.MB.IntefaceMB.AccountMB {
    String user;
    String password;
    @Override
    public boolean accountRegister(){
        try{
            Register verification = new Register(getUser(), getPassword());
            AccountBO accountBO = new AccountBO();
            if(accountBO.AccountFilter(verification.getUser(), verification.getPassword())){
                return true;
            } else {
                return false;
            }
        }catch(Exception exception){
            return false;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
