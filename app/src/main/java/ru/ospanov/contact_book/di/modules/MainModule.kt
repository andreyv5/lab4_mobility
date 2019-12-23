package ru.ospanov.contact_book.di.modules

import ru.ospanov.contact_book.ui.main.add.ContactAddInteractor
import ru.ospanov.contact_book.ui.main.add.IContactAddInteractor
import ru.ospanov.contact_book.ui.main.contacts.ContactsInteractor
import ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor
import ru.ospanov.contact_book.ui.main.detail.ContactDetailInteractor
import ru.ospanov.contact_book.ui.main.detail.IContactDetailInteractor
import toothpick.config.Module
import toothpick.ktp.binding.bind
import toothpick.ktp.binding.toClass

class MainModule : Module() {

    init {
        bind<IContactsInteractor>().toClass<ContactsInteractor>().singleton()
        bind<IContactAddInteractor>().toClass<ContactAddInteractor>().singleton()
        bind<IContactDetailInteractor>().toClass<ContactDetailInteractor>().singleton()
    }
}