package ru.ospanov.contact_book.di.modules

import ru.ospanov.contact_book.data.content_provider.ContentProviderRepository
import ru.ospanov.contact_book.data.content_provider.IContentProviderRepository
import toothpick.config.Module
import toothpick.ktp.binding.bind
import toothpick.ktp.binding.toClass

class ContentProviderModule : Module() {

    init {
        bind<IContentProviderRepository>().toClass<ContentProviderRepository>().singleton()
    }

}