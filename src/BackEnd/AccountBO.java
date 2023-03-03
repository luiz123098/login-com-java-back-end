package BackEnd;

public class AccountBO {

    public boolean AccountFilter(String user, String password) {
        try {
            AccountMB accountMB = new AccountMB();
            if (user.equals(accountMB.getUser()) || password.equals(accountMB.getPassword())) {
                AccountDAO accountDAO = new AccountDAO();
                accountDAO.UserRegisterConfirmation();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }


}
