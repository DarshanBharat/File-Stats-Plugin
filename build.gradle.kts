plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.0.1"
}

group = "com.darshan"
version = "1.0.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        pycharmCommunity("2024.2.3")
        bundledPlugin("com.intellij.modules.platform")
    }
    compileOnly("org.jetbrains:annotations:24.1.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

intellijPlatform {
    pluginConfiguration {
        id = "com.darshan.filestats"
        name = "File Stats"
        version = "1.0.0"
        vendor {
            name = "Darshan"
        }
    }
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}
