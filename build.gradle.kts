import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // The Kotlin JVM Plugin
    id("org.jetbrains.kotlin.jvm").version("1.3.41")
    // The documentation engine for Kotlin
    id("org.jetbrains.dokka").version("0.9.18")
}

repositories {
    jcenter()
}

group = "projectvita.server.core"
version = "0.0.1"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.1")
}

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
