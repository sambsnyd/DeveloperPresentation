buildscript {
	repositories {
		jcenter()
		maven {
            url = java.net.URI("https://dl.bintray.com/kotlin/kotlin-eap")
        }
	}
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.41")
		classpath("org.jetbrains.kotlin:kotlin-frontend-plugin:0.0.30")
    }
}
project.plugins.apply("kotlin2js")
project.plugins.apply("org.jetbrains.kotlin.frontend")

val kotlinVersion = "1.2.41"

dependencies {
    "compile" ("org.jetbrains.kotlin:kotlin-stdlib-js:$kotlinVersion")
	"compile" ("org.jetbrains.kotlin:kotlin-test-js:$kotlinVersion")
	"compile" ("org.jetbrains.kotlinx:kotlinx-html-js:0.6.6")
}

