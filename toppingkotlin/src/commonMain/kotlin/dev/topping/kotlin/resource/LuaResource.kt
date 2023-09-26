package dev.topping.kotlin.resource

import dev.topping.kotlin.LuaRef

/**
 * Lua resource class.
 * This class is used to fetch resources from lua.
 */
expect open class LuaResource {
    companion object {
        /**
         * This function gets resource from package, if can not it gets from other data location.
         * @param path root path to search.
         * @param resName resource name to search
         * @return LuaStream of resource
         */
        fun getResourceAssetSd(path: String, resName: String): LuaStream?

        /**
         * This function gets resource from other data location, if can not it gets from package.
         * @param path root path to search.
         * @param resName resource name to search
         * @return LuaStream of resource
         */
        fun getResourceSdAsset(path: String, resName: String): LuaStream?

        /**
         * This function gets resource from package.
         * @param path root path to search.
         * @param resName resource name to search
         * @return LuaStream of resource
         */
        fun getResourceAsset(path: String, resName: String): LuaStream?

        /**
         * This function gets resource from other data location.
         * @param path root path to search.
         * @param resName resource name to search
         * @return LuaStream of resource
         */
        fun getResourceSd(path: String, resName: String): LuaStream?

        /**
         * This function gets resource based on defines.lua config
         * @param path root path to search.
         * @param resName resource name to search
         * @return LuaStream of resource
         */
        fun getResource(path: String, resName: String): LuaStream?

        /**
         * This function gets resource based on defines.lua config
         * @param ref LuaRef
         * @return LuaStream of resource
         */
        fun getResourceRef(ref: LuaRef): LuaStream?
    }
}