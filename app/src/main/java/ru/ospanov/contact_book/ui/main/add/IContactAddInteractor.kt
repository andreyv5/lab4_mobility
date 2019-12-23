package ru.ospanov.contact_book.ui.main.add

import io.reactivex.Completable
import ru.ospanov.contact_book.data.db.model.Contact

interface IContactAddInteractor {

    fun addContact(contact: Contact): Completable

}