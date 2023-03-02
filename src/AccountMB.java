public class AccountMB {
    String user;
    String password;
    public void accountRegister(){
    AccountVerification verification = new AccountVerification(getUser(), getPassword());
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
