package accounting;

class TaxSystemIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calculateTax(int debit, int credit) {
        return Math.max(0, (int) ((debit - credit) * 0.15));
    }
}
