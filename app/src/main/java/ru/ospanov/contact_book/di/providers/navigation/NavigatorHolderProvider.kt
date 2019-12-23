package ru.ospanov.contact_book.di.providers.navigation

import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import toothpick.InjectConstructor
import javax.inject.Provider

@InjectConstructor
class NavigatorHolderProvider(
    private val cicerone: Cicerone<Router>
) : Provider<NavigatorHolder> {

    override fun get(): NavigatorHolder {
        return cicerone.navigatorHolder
    }
}