package projectvita.server.core

import projectvita.server.core.transaction.Consumption
import projectvita.server.core.transaction.Expense
import projectvita.server.core.transaction.Transfer
import java.math.BigDecimal
import java.time.LocalDate

/**
 * The utility for tracking transactions and accounts receivables of members in
 * a ledger.
 */
interface Ledger {
    // Query Operations

    /**
     * Returns the accounts receivable of a member.
     *
     * @param member the member whose accounts receivable is queried
     * @return the accounts receivable of the member
     */
    fun getAccountsReceivableOf(member: Member): BigDecimal

    // Modification Operations

    /**
     * Adds an expense transaction to this ledger.
     *
     * @param payments a [map][Map] that maps members who made a payment in this
     *         expense to the amount each of them paid
     * @param date the [date][LocalDate] when this expense incurred (default
     *         value: the current date, as returned by [LocalDate.now])
     * @param description the description of this expense (default value: an
     *         empty string)
     * @return the [Expense] instance added to the ledger
     */
    fun addExpense(payments: Map<Member, BigDecimal>,
                   date: LocalDate = LocalDate.now(),
                   description: String = "")
            : Expense

    /**
     * Adds a consumption transaction to this ledger.
     *
     * @param consumer the [member][Member] who made this consumption
     * @param amount the price of products involved in this consumption
     * @param date the [date][LocalDate] when this consumption incurred (default
     *         value: the current date, as returned by [LocalDate.now])
     * @param description the description of this consumption (default value: an
     *         empty string)
     * @return the [Consumption] instance added to the ledger
     */
    fun addConsumption(consumer: Member, amount: BigDecimal,
                       date: LocalDate = LocalDate.now(),
                       description: String = "")
            : Consumption

    /**
     * Adds a transfer transaction to this ledger.
     *
     * @param sender the [member][Member] who sent the money in this transfer
     * @param recipient the [member][Member] who received the money in this
     *         transfer
     * @param amount the amount of money involved in this transfer
     * @param date the [date][LocalDate] when this transfer incurred (default
     *         value: the current date, as returned by [LocalDate.now])
     * @param description the description of this transfer (default value: an
     *         empty string)
     * @return the [Transfer] instance added to the ledger
     */
    fun addTransfer(sender: Member, recipient: Member, amount: BigDecimal,
                    date: LocalDate = LocalDate.now(),
                    description: String = "")
            : Transfer
}
