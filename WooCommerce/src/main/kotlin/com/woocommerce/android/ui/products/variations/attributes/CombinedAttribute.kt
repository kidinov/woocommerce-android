package com.woocommerce.android.ui.products.variations.attributes

import com.woocommerce.android.model.Product
import com.woocommerce.android.model.ProductGlobalAttribute

/**
 * A "combined" product attribute is one that can be created from either a local (product-based) attribute
 * or a global (store-based) attribute
 */
class ProductCombinedAttribute(
    val id: Long,
    val name: String,
    val isGlobalAttribute: Boolean
) {
    companion object {
        fun fromLocalAttribute(attribute: Product.Attribute): ProductCombinedAttribute {
            return ProductCombinedAttribute(
                id = attribute.id,
                name = attribute.name,
                isGlobalAttribute = false
            )
        }

        fun fromGlobalAttribute(attribute: ProductGlobalAttribute): ProductCombinedAttribute {
            return ProductCombinedAttribute(
                id = attribute.id.toLong(),
                name = attribute.name,
                isGlobalAttribute = true
            )
        }
    }
    override fun equals(other: Any?): Boolean {
        return (other as? ProductCombinedAttribute)?.let {
            id == it.id &&
                name == it.name &&
                isGlobalAttribute == it.isGlobalAttribute
        } ?: false
    }
}
