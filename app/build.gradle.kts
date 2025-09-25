plugins {
    id("chirp.spring-boot-app")
}

group = "com.uesar"
version = "0.0.1-SNAPSHOT"
description = "Chirp Backend"

dependencies {
    implementation(projects.chat)
    implementation(projects.common)
    implementation(projects.notification)
    implementation(projects.user)
}
