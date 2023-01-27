package dev.topping.kotlin

import cocoapods.Topping.NavigationUI

actual open class LuaNavigationUI : KTInterface
{
   var luaNavigationUI: NavigationUI? = null

    actual companion object {
        actual fun navigateUp(navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.navigateUpWithNavController(navController.luaNavController!!, configuration.luaAppBarConfiguration!!)
        }
        actual fun navigateUp(navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.navigateUpWithNavController(navController.luaNavController!!, openableLayout.lgView!!)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController) {
            NavigationUI.setupActionBarWithNavControllerWithForm(form.luaForm!!, navController.luaNavController!!)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.setupActionBarWithNavControllerWithForm(form.luaForm!!, navController.luaNavController!!, openableLayout.lgView!!)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.setupActionBarWithNavControllerWithForm(form.luaForm!!, navController.luaNavController!!, configuration.luaAppBarConfiguration!!)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController) {
            NavigationUI.setupWithNavControllerWithToolbar(toolbar.lgToolbar!!, navController.luaNavController!!)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.setupWithNavControllerWithToolbar(toolbar.lgToolbar!!, navController.luaNavController!!, openableLayout.lgView!!)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.setupWithNavControllerWithToolbar(toolbar.lgToolbar!!, navController.luaNavController!!, configuration.luaAppBarConfiguration!!)
        }
    }

    open override fun GetNativeObject(): Any?
    {
        return luaNavigationUI
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaNavigationUI = par as NavigationUI?
    }
}