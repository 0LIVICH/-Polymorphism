package accounting;

class TaxSystemIncome extends TaxSystem {
    @Override
    public int calculateTax(int debit, int credit) {
        return Math.max(0, (int) (debit * 0.06));
    }
}
