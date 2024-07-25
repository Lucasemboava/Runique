plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.emboava.analytics.presentation"
}

dependencies {
    implementation(projects.analytics.domain)
}