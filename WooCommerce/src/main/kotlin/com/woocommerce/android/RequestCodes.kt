package com.woocommerce.android

/**
 * Global intent identifiers
 */
object RequestCodes {
    private const val BASE_REQUEST_CODE = 100

    const val ADD_ACCOUNT = BASE_REQUEST_CODE + 0
    const val SETTINGS = BASE_REQUEST_CODE + 1
    const val SITE_PICKER = BASE_REQUEST_CODE + 2
    const val IN_APP_UPDATE = BASE_REQUEST_CODE + 3

    const val CAMERA_PERMISSION = BASE_REQUEST_CODE + 10

    const val PRODUCT_IMAGE_VIEWER = BASE_REQUEST_CODE + 100
    const val CHOOSE_PHOTO = BASE_REQUEST_CODE + 101
    const val CAPTURE_PHOTO = BASE_REQUEST_CODE + 102

    const val ORDER_REFUND = BASE_REQUEST_CODE + 200

    const val PRODUCT_INVENTORY = BASE_REQUEST_CODE + 300
    const val PRODUCT_INVENTORY_BACKORDERS = BASE_REQUEST_CODE + 301
    const val PRODUCT_INVENTORY_STOCK_STATUS = BASE_REQUEST_CODE + 302
    const val PRODUCT_SHIPPING_CLASS = BASE_REQUEST_CODE + 303
    const val PRODUCT_TAX_STATUS = BASE_REQUEST_CODE + 304
    const val PRODUCT_TAX_CLASS = BASE_REQUEST_CODE + 305

    const val PRODUCT_SETTINGS_STATUS = BASE_REQUEST_CODE + 350
    const val PRODUCT_SETTINGS_VISIBLITY = BASE_REQUEST_CODE + 351
    const val PRODUCT_SETTINGS_SLUG = BASE_REQUEST_CODE + 352
    const val PRODUCT_SETTINGS_PURCHASE_NOTE = BASE_REQUEST_CODE + 353
    const val PRODUCT_SETTINGS_MENU_ORDER = BASE_REQUEST_CODE + 354

    const val AZTEC_EDITOR_PRODUCT_DESCRIPTION = BASE_REQUEST_CODE + 400
    const val AZTEC_EDITOR_PRODUCT_SHORT_DESCRIPTION = BASE_REQUEST_CODE + 401
}
