package services

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val servicesModule = module {
    singleOf(::AuthenticationService)
}