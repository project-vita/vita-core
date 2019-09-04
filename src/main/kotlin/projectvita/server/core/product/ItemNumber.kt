package projectvita.server.core.product

/**
 * A number used to identify trade items. Most tangible products would have a
 * [Global Trade Item Number (GTIN)](https://en.wikipedia.org/wiki/Global_Trade_Item_Number)
 * for the purpose of identification; tangible products which do not have such
 * GTIN or intangible products could have a unique identifier assigned
 * internally in this program.
 */
interface ItemNumber {
    /**
     * Returns a string representation of this item number. For an
     * implementation of this interface, the exact format of the string
     * representation should not vary between versions.
     *
     * @return a string representation of this item number
     */
    override fun toString(): String

    /**
     * Indicates whether some other object is "equal to" this item number.
     *
     * In addition to the general contract defined by [Any.equals], the
     * implementor of this interface should also ensure that this function
     * returns `true` if and only if the other object is also an implementation
     * of this interface that represents the same category of item number as
     * this one does, and the item number is exactly the same as the number this
     * object represents.
     *
     * @param other the other object for equality comparison
     * @return whether the other object is "equal to" this one
     */
    override fun equals(other: Any?): Boolean
}
