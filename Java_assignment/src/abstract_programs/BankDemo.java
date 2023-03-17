package abstract_programs;
class Bank {
    public void getInterestRate() {
        System.out.println("The interest rate is 4%");
    }
}

class SBI extends Bank {
    public void getInterestRate() {
        System.out.println("The interest rate is 3.5%");
    }
}

class HDFC extends Bank {
    public void getInterestRate() {
        System.out.println("The interest rate is 5%");
    }
}

class ICICI extends Bank {
    public void getInterestRate() {
        System.out.println("The interest rate is 4.5%");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        ICICI icici = new ICICI();

        bank.getInterestRate(); // The interest rate is 4%
        sbi.getInterestRate(); // The interest rate is 3.5%
        hdfc.getInterestRate(); // The interest rate is 5%
        icici.getInterestRate(); // The interest rate is 4.5%
    }
}
