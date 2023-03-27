package dev.topping.kotlin

/**
 * WebView
 */
expect open class LGWebView : LGView {
    companion object {
        /**
         * Creates LGWebView Object From Lua.
         * @param lc
         * @return LGWebView
         */
        fun create(lc: LuaContext): LGWebView
    }

    /**
     * Set webview configuration
     * @param enableJavascript
     * @param enableDomStorage
     */
    fun setConfiguration(enableJavascript: Boolean, enableDomStorage: Boolean)

    /**
     * Load url
     * @param url
     */
    fun load(url: String)

    /**
     * Load data
     * @param data
     * @param mimeType
     * @param encoding
     * @param baseUrl
     */
    fun loadData(data: String, mimeType: String, encoding: String, baseUrl: String)

    /**
     * Stops loading
     */
    fun stopLoading()

    /**
     * Check is loading
     * @return boolean
     */
    fun isLoading(): Boolean

    /**
     * Can go back
     * @return boolean
     */
    fun canGoBack(): Boolean

    /**
     * Can go forward
     * @return boolean
     */
    fun canGoForward(): Boolean

    /**
     * Go back
     */
    fun goBack()

    /**
     * Go forward
     */
    fun goForward()

    /**
     * Set request action before loading
     * @param lt +fun(webView: LGWebView, url: string):boolean
     */
    fun setReqestAction(func: ((LGWebView, String) -> Boolean)?)
}