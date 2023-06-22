// PartsWorker subclass
public class PartsWorker extends Employee {
    private double paymentPerPiece;
    private int numberOfPiecesProduced;
    private double fixedBonusAmount;
    private int bonusThreshold;

    public PartsWorker(String firstName, String lastName, String socialSecurityNumber, double paymentPerPiece, int numberOfPiecesProduced, double fixedBonusAmount, int bonusThreshold) {
        super(firstName, lastName, socialSecurityNumber);
        this.paymentPerPiece = paymentPerPiece;
        this.numberOfPiecesProduced = numberOfPiecesProduced;
        this.fixedBonusAmount = fixedBonusAmount;
        this.bonusThreshold = bonusThreshold;
    }

    public double getPaymentPerPiece() {
        return paymentPerPiece;
    }

    public int getNumberOfPiecesProduced() {
        return numberOfPiecesProduced;
    }

    public double getFixedBonusAmount() {
        return fixedBonusAmount;
    }

    public int getBonusThreshold() {
        return bonusThreshold;
    }

    public void setPaymentPerPiece(double paymentPerPiece) {
        this.paymentPerPiece = paymentPerPiece;
    }

    public void setNumberOfPiecesProduced(int numberOfPiecesProduced) {
        this.numberOfPiecesProduced = numberOfPiecesProduced;
    }

    public void setFixedBonusAmount(double fixedBonusAmount) {
        this.fixedBonusAmount = fixedBonusAmount;
    }

    public void setBonusThreshold(int bonusThreshold) {
        this.bonusThreshold = bonusThreshold;
    }

    @Override
    public double earnings() {
        double earnings = paymentPerPiece * numberOfPiecesProduced;
        if (numberOfPiecesProduced > bonusThreshold) {
            earnings += fixedBonusAmount;
        }
        return earnings;
    }

    @Override
    public String toString() {
        return String.format("Parts Worker: %s%nPayment per Piece: €%.2f%nNumber of Pieces Produced: %d%nFixed Bonus Amount: €%.2f%nBonus Threshold: %d", super.toString(), paymentPerPiece, numberOfPiecesProduced, fixedBonusAmount, bonusThreshold);
    }
}


