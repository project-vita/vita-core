package projectvita.server.core

import java.math.BigDecimal

/**
 * A member in the ledger. This interface is called `Member` rather than `User`
 * because a `User` instance should represent a registered user account in this
 * program, which has a password, a user profile, and other additional
 * information. Instead, a `Member` instance merely represents an entity whose
 * expenses and payments are recorded in the ledger.
 */
interface Member {
    /**
     * Returns the user name of this member. The user name is used to identify
     * this member internally in this program.
     *
     * @return the user name of this member
     */
    fun getUserName(): String

    /**
     * Returns the first name of this member.
     *
     * @return the first name of this member
     */
    fun getFirstName(): String

    /**
     * Returns the last name of this member.
     *
     * @return the last name of this member
     */
    fun getLastName(): String

    /**
     * Returns the full name of this member.
     *
     * @return the full name of this member
     */
    fun getFullName(): String
}
