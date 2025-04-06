plugins {
    id("java")
}

group = "projetonovoentrega"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.liquibase:liquibase-core:4.29.1")
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")


//acusa uma insconsistencia nas versoes do java nesse processo.

}

tasks.test {
    useJUnitPlatform()
}