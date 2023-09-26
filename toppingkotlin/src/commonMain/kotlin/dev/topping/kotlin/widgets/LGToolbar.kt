package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaRef

/**
 * Toolbar
 */
expect open class LGToolbar : LGView {
    /**
     * Sets the toolbar menu
     * @param ref
     */
    fun setMenu(ref: LuaRef?)

    /**
     * Sets the toolbar logo
     * @param logo
     */
    fun setLogo(logo: LuaRef?)

    /**
     * Sets the toolbar navigation icon
     * @param icon
     */
    fun setNavigationIcon(icon: LuaRef?)

    /**
     * Sets the toolbar overflow icon
     * @param icon
     */
    fun setOverflowIcon(icon: LuaRef?)

    /**
     * Gets the toolbar title
     * @return String
     */
    fun getTitle(): String?

    /**
     * Sets the toolbar title
     * @param text
     */
    fun setTitleInternal(text: String?)

    /**
     * Sets the toolbar title
     * @param ref
     */
    fun setTitle(ref: LuaRef?)

    /**
     * Sets the toolbar title text color
     * @param ref
     */
    fun setTitleTextColor(ref: LuaRef?)

    /**
     * Sets the toolbar title text appearance
     * @param ref
     */
    fun setTitleTextApperance(ref: LuaRef?)

    /**
     * Get subtitle
     * @return subtitle
     */
    fun getSubtitle(): String?

    /**
     * Set subtitle
     * @param text
     */
    fun setSubtitleInternal(text: String?)

    /**
     * Set subtitle
     * @param ref
     */
    fun setSubtitle(ref: LuaRef?)

    /**
     * Set subtitle text color
     * @param ref
     */
    fun setSubtitleTextColor(ref: LuaRef?)

    /**
     * Set subtitle text appearance
     * @param ref
     */
    fun setSubtitleTextApperance(ref: LuaRef?)

    /**
     * Sets the toolbar navigation listener
     * @param lt +fun(toolbar: LGToolbar):void
     */
    fun setNavigationOnClickListener(func: ((LGToolbar) -> Unit)?)

    /**
     * Sets the toolbar menu item listener
     * @param lt +fun(toolbar: LGToolbar):void
     */
    fun setMenuItemClickListener(func: ((LGToolbar) -> Unit)?)

}