package projectvita.server.core.product

import java.math.BigDecimal

/**
 * A purchased item, usually represented by an entry on the receipt. Examples of
 * a `Product` include, but are not limited to, a box of lemon tea, an entree in
 * a restaurant, and a month of cellphone service.
 */
interface Product {
    /**
     * Returns the [item number][ItemNumber] of this product. The item number
     * can be used to identify this product's specific type.
     *
     * @return the item number of this product
     */
    fun getItemNumber(): ItemNumber

    /**
     * Returns the unique identifier of this product.
     *
     * @return the unique identifier of this product
     */
    fun getId(): String

    /**
     * Returns the price of this product.
     *
     * @return the price of this product
     */
    fun getPrice(): BigDecimal
}
