package projectvita.server.core.transaction

import projectvita.server.core.Member
import java.math.BigDecimal
import java.time.LocalDate

/**
 * A transaction in which a member sends money to another one.
 */
interface Transfer {
    /**
     * Returns the unique identifier of this transfer.
     *
     * @return the unique identifier of this transfer
     */
    fun getId(): String

    /**
     * Returns the [member][Member] who sent the money in this transfer.
     *
     * @return the member who sent the money in this transfer
     */
    fun getSender(): Member

    /**
     * Returns the [member][Member] who received the money in this transfer.
     *
     * @return the member who received the money in this transfer
     */
    fun getRecipient(): Member

    /**
     * Returns the amount of money involved in this transfer.
     *
     * @return the amount of money involved in this transfer
     */
    fun getAmount(): BigDecimal

    /**
     * Returns the [date][LocalDate] when this transfer was made.
     *
     * @return the date when this transfer was made
     */
    fun getDate(): LocalDate

    /**
     * Returns the description of this transfer.
     *
     * @return the description of this transfer
     */
    fun getDescription(): String
}
