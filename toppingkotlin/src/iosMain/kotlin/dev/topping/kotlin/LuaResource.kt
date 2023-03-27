package dev.topping.kotlin

actual open class LuaResource : KTInterface
{
   var luaResource: cocoapods.Topping.LuaResource? = null
   actual companion object {
        actual fun getResourceAssetSd(path: String, resName: String): LuaStream?
        {
            return KTWrap.Wrap(cocoapods.Topping.LuaResource.getResourceAssetSd(path, resName)) as LuaStream?
        }
        actual fun getResourceSdAsset(path: String, resName: String): LuaStream?
        {
            return KTWrap.Wrap(cocoapods.Topping.LuaResource.getResourceSdAsset(path, resName)) as LuaStream?
        }
        actual fun getResourceAsset(path: String, resName: String): LuaStream?
        {
            return KTWrap.Wrap(cocoapods.Topping.LuaResource.getResourceAsset(path, resName)) as LuaStream?
        }
        actual fun getResourceSd(path: String, resName: String): LuaStream?
        {
            return KTWrap.Wrap(cocoapods.Topping.LuaResource.getResourceSd(path, resName)) as LuaStream?
        }
        actual fun getResource(path: String, resName: String): LuaStream?
        {
            return KTWrap.Wrap(cocoapods.Topping.LuaResource.getResource(path, resName)) as LuaStream?
        }
       actual fun getResourceRef(ref: LuaRef): LuaStream?
       {
           return KTWrap.Wrap(cocoapods.Topping.LuaResource.getResourceRef(ref.luaRef)) as LuaStream?
       }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaResource
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaResource = par as cocoapods.Topping.LuaResource?
   }
}