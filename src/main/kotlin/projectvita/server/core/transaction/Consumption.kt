package projectvita.server.core.transaction

import projectvita.server.core.Member
import java.math.BigDecimal
import java.time.LocalDate

/**
 * A transaction in which some purchased products are consumed by a member.
 */
interface Consumption {
    /**
     * Returns the [member][Member] who made this consumption.
     *
     * @return the member who made this consumption
     */
    fun getConsumer(): Member

    /**
     * Returns the price of products involved in this consumption.
     *
     * @return the price of products involved in this consumption
     */
    fun getAmount(): BigDecimal

    /**
     * Returns the [date][LocalDate] when this consumption occurred.
     *
     * @return the date when this consumption occurred
     */
    fun getDate(): LocalDate

    /**
     * Returns the description of this consumption.
     *
     * @return the description of this consumption
     */
    fun getDescription(): String
}
