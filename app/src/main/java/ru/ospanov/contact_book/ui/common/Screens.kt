package ru.ospanov.contact_book.ui.common

import androidx.fragment.app.Fragment
import ru.ospanov.contact_book.ui.main.add.ContactAddFragment
import ru.ospanov.contact_book.ui.main.contacts.ContactsFragment
import ru.ospanov.contact_book.ui.main.detail.ContactDetailFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class Screens {

    class ContactsScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return ContactsFragment()
        }
    }

    class ContactAddScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return ContactAddFragment()
        }
    }

    class ContactDetailScreen(private val contactId: Long) : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return ContactDetailFragment.newInstance(contactId)
        }
    }
}