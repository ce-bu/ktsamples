import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.kotlinGradlePlugin)
    implementation(libs.kotlinJvm)
}

gradlePlugin {
    plugins {
        register("kotlinApplication") {
            id = "ktsamples.kotlin.application"
            implementationClass = "KotlinApplicationPlugin"
        }
    }
}