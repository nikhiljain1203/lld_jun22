package adapter;

import adapter.thirdparty.IciciBankApi;

public class IciciBankAdapter implements BankApi {
    private IciciBankApi iciciBankApi= new IciciBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
