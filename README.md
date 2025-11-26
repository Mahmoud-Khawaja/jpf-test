# JPF-Test Extension

A minimal Java PathFinder (JPF) extension for diagnosing and testing model class loading issues. This extension demonstrates how to create custom model classes and native peers in JPF.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- [JPF-core](https://github.com/javapathfinder/jpf-core) installed and built
- Gradle (included via wrapper)

## Installation

### 1. Clone the Repository
```bash
git clone https://github.com/Mahmoud-Khawaja/jpf-test.git
cd jpf-test
```

### 2. Configure Site Properties

Create or modify `~/.jpf/site.properties` with the following content:
```properties
jpf-core = /path/to/your/jpf-core
jpf-test = /path/to/your/jpf-test
extensions = ${jpf-core}
```

**Replace the paths with your actual installation directories.**

### 3. Build the Extension
```bash
./gradlew buildJars
```

## Running the Tests

### Test Math Peer
```bash
java -jar /path/to/jpf-core/build/RunJPF.jar TestMath.jpf
```

## Contributing

This is a diagnostic extension. For contributions to JPF core, see the main [JPF-core repository](https://github.com/javapathfinder/jpf-core).
