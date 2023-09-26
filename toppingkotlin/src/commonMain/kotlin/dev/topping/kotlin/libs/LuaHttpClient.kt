package dev.topping.kotlin.libs

/**
 * Class that handles HTTP POST and GET requests
 */
expect open class LuaHttpClient {
    companion object {
        /**
         * Creates LuaHttpClient Object From Lua.
         * @param tag
         * @return LuaHttpClient
         */
        fun create(tag: String): LuaHttpClient
    }

    /**
     * Sets the content type of the connection
     * @param type type
     */
    fun setContentType(type: String)

    /**
     * Start Form data.
     * This is used to create multipart form data. After this use AppendPostData or AppendImageData.
     * To end form use EndForm.
     * return LuaObjectStore
     */
    fun startForm(): LuaObjectStore?

    /**
     * Add data to form.
     * @param formData Form data created by StartForm.
     * @param name id of the data.
     * @param value value of the data.
     */
    fun appendPostData(formData: Any?, name: String?, value: String?)

    /**
     * Add file to form.
     * @param formData Form data created by StartForm.
     * @param name id of the data.
     * @param file data of the file.
     */
    fun appendFileData(formData: Any?, name: String?, file: Any?)

    /**
     * Finishes the form data created.
     * @param formData Form data created by StartForm.
     */
    fun endForm(formData: Any?)

    /**
     * Start asynchronous load of form.
     * @param url url to send.
     * @param formData Form data finished by EndForm.
     * @param tag tag that is used to identify connection.
     */
    fun startAsyncLoadForm(url: String?, formData: Any?, tag: String?)

    /**
     * Start asynchronous load.
     * @param url url to send.
     * @param data post data string.
     * @param tag tag that is used to identify connection.
     */
    fun startAsyncLoad(url: String?, data: String?, tag: String?)

    /**
     * Start asynchronous load.
     * @param url url to send.
     * @param tag tag that is used to identify connection.
     */
    fun startAsyncLoadGet(url: String?, tag: String?)

    /**
     * Start synchronous load.
     * @param url url to send.
     * @param data post data string.
     * @return String value of returned data.
     */
    fun startLoad(url: String?, data: String?): String?

    /**
     * Start synchronous load.
     * @param url url to send.
     * @return String value of returned data.
     */
    fun startLoadGet(url: String?): String?

    /**
     * Set timeout of connection
     * @param timeout timeout value seconds
     */
    fun setTimeout(timeout: Int?)

    /**
     * Sets combo changed listener
     * @param lt +fun(client: LuaHttpClient, context: LuaContext, resultString: string):void
     */
    fun setOnFinishListener(func: ((LuaHttpClient, String) -> Unit)?)

    /**
     * Sets combo changed listener
     * @param lt +fun(client: LuaHttpClient, context: LuaContext, resultString: string, error: string):void
     */
    fun setOnFailListener(func: ((LuaHttpClient, String) -> Unit)?)
}