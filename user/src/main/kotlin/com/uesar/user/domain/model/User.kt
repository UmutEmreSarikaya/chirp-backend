package com.uesar.user.domain.model

import java.util.UUID

typealias UserID = UUID

data class User(
    val id: UserID,
    val username: String,
    val email: String,
    val hasEmailVerified: Boolean
)
