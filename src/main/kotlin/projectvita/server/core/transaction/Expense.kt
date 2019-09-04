package projectvita.server.core.transaction

import projectvita.server.core.Member
import java.math.BigDecimal
import java.time.LocalDate

/**
 * A transaction in which money is spent to purchase some products.
 */
interface Expense {
    /**
     * Returns the unique identifier of this expense.
     *
     * @return the unique identifier of this expense
     */
    fun getId(): String

    /**
     * Returns the [collection][Collection] of [payments][Payment] made in this
     * expense.
     *
     * @return the collection of payments made in this expense
     */
    fun getPayments(): Collection<Payment>

    /**
     * Returns the [date][LocalDate] when this expense incurred.
     *
     * @return the date when this expense incurred
     */
    fun getDate(): LocalDate

    /**
     * Returns the description of this expense.
     *
     * @return the description of this expense
     */
    fun getDescription(): String

    /**
     * An action in which money is being transferred from a payer's account to
     * the merchant.
     */
    interface Payment {
        /**
         * Returns the [member][Member] who made this payment.
         *
         * @return the member who made this payment
         */
        fun getPayer(): Member

        /**
         * Returns the amount paid in this payment.
         *
         * @return the amount paid in this payment
         */
        fun getAmount(): BigDecimal
    }
}
