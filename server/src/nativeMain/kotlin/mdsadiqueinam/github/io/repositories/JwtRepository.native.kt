package mdsadiqueinam.github.io.repositories

import mdsadiqueinam.github.io.models.User
import org.koin.core.annotation.Single

@Single
actual class JwtRepository {
    actual suspend fun validate(token: String): User? {
        TODO("Not yet implemented")
    }
}