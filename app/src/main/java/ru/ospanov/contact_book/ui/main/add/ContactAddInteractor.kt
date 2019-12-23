package ru.ospanov.contact_book.ui.main.add

import io.reactivex.Completable
import ru.ospanov.contact_book.data.db.model.Contact
import ru.ospanov.contact_book.data.db.repository.IContactRepository
import toothpick.InjectConstructor

@InjectConstructor
class ContactAddInteractor(
    private val contactsRepository: IContactRepository
) : IContactAddInteractor {

    override fun addContact(contact: Contact): Completable {
        return contactsRepository.insertContact(contact)
    }

}