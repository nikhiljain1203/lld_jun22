package adapter;

import adapter.thirdparty.YesBankApi;

public class YesBankAdapter implements BankApi{
    private YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double getBalance(String accountNumber) {
        return yesBankApi.checkBalance(Integer.parseInt(accountNumber));
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        try {
            yesBankApi.transfer(Integer.parseInt(fromAccount), Integer.parseInt(toAccount),(int)amount);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
