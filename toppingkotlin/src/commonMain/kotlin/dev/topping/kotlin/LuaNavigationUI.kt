package dev.topping.kotlin

/**
 * Navigation UI
 */
expect open class LuaNavigationUI {
    companion object {
        /**
         * Navigate Up
         */
        fun navigateUp(navController: LuaNavController, configuration: LuaAppBarConfiguration)

        /**
         * Navigate Up
         * @param luaNavController
         * @param openableLayout
         */
        fun navigateUp(navController: LuaNavController, openableLayout: LGView)

        /**
         * Setup with action bar
         * @param luaForm
         * @param luaNavController
         */
        fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController)

        /**
         * Setup with action bar
         * @param luaForm
         * @param luaNavController
         * @param openableLayout
         */
        fun setupActionBarWithNavController(
            form: LuaForm,
            navController: LuaNavController,
            openableLayout: LGView
        )

        /**
         * Setup with action bar
         * @param luaForm
         * @param luaAppBarConfiguration
         */
        fun setupActionBarWithNavController(
            form: LuaForm,
            navController: LuaNavController,
            configuration: LuaAppBarConfiguration
        )

        /**
         * Setup with toolbar
         * @param lgToolbar
         * @param luaNavController
         */
        fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController)

        /**
         * Setup with toolbar
         * @param lgToolbar
         * @param luaNavController
         * @param openableLayout
         */
        fun setupWithNavController(
            toolbar: LGToolbar,
            navController: LuaNavController,
            openableLayout: LGView
        )

        /**
         * Setup with toolbar
         * @param lgToolbar
         * @param luaNavController
         * @param luaAppBarConfiguration
         */

        fun setupWithNavController(
            toolbar: LGToolbar,
            navController: LuaNavController,
            configuration: LuaAppBarConfiguration
        )
    }
}