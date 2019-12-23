package ru.ospanov.contact_book.data.db

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import ru.ospanov.contact_book.data.db.model.Contact
import ru.ospanov.contact_book.data.db.model.Contact.Companion.DELETE_BY_ID
import ru.ospanov.contact_book.data.db.model.Contact.Companion.QUERY_ALL
import ru.ospanov.contact_book.data.db.model.Contact.Companion.QUERY_BY_ID

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(contacts: Contact): Completable

    @Update
    fun update(contact: Contact): Completable

    @Query(DELETE_BY_ID)
    fun deleteContactById(id: Long): Maybe<Int>

    @Query(QUERY_BY_ID)
    fun getContactById(id: Long): Single<Contact>

    @Query(QUERY_ALL)
    fun observeAll(): Observable<List<Contact>>

}