package accounting;

public class Main {
    public static void main(String[] args) {

        Company companyA = new Company("ООО Ромашка", new TaxSystemIncome());
        Company companyB = new Company("ИП Васильев", new TaxSystemIncomeMinusExpenses());

        companyA.shiftMoney(100000);
        companyA.shiftMoney(-20000);
        companyA.payTaxes(); // УСН доходы

        companyB.shiftMoney(500000);
        companyB.shiftMoney(-400000);
        companyB.payTaxes(); // УСН доходы минус расходы
        
        companyA.setTaxSystem(new TaxSystemIncomeMinusExpenses());
        companyA.shiftMoney(200000);
        companyA.shiftMoney(-50000);
        companyA.payTaxes(); // УСН доходы минус расходы
    }
}
