# Java Accelerator Week 5 Labs

This repository contains several advanced Java labs focused on cloud-native development, big data, machine learning, and secure coding/cryptography. Each section below details the purpose, structure, and usage of each lab.

---

## 1. Cloud-Native: Real-Time Sentiment Analysis

**Path:** `cloud-native/realtime-sentiment-analysis`

### Overview

A Spring Boot application that performs real-time sentiment analysis on text data. It integrates with Apache Spark for scalable, bulk sentiment analysis jobs.

### Key Features

- REST API for submitting text for sentiment analysis (`/api/sentiment/analyze`).
- Triggers Spark jobs for bulk sentiment analysis (`/api/sentiment/bulkAnalyze`).
- Simple rule-based and Spark-based sentiment classification.

### Technologies

- Java 21, Spring Boot, Apache Spark, Maven

### Structure

- `controller/SentimentController.java`: REST endpoints for analysis and Spark job triggering.
- `services/SentimentAnalyzer.java`: Simple rule-based sentiment logic.
- `services/SentimentService.java`: Spark-based sentiment analysis logic.
- `pom.xml`: Dependencies for Spring Boot and Spark.

### Usage

1. Build with Maven: `mvn clean install`
2. Run: `mvn spring-boot:run`
3. Use the API endpoints to analyze text or trigger Spark jobs.

---

## 2. Big Data: Recommendation Engine

**Path:** `java-al-w5-bigData`

### Overview

Implements collaborative filtering recommendation systems using Apache Spark's ALS (Alternating Least Squares) algorithm. Includes both movie and e-commerce product recommendation examples.

### Key Features

- Loads user-item ratings or purchase data from CSV.
- Trains ALS models and generates recommendations for users and items.
- Evaluates model performance (RMSE).

### Technologies

- Java, Apache Spark (MLlib), Maven

### Structure

- `RecommendationEngine.java`: Movie recommendation with ALS and cross-validation.
- `EcommerceRecommendation.java`: Product recommendation for e-commerce data.
- `pom.xml`: Spark and test dependencies.

### Usage

1. Place your dataset in `src/main/resources/ml-latest-small/` (e.g., `ratings.csv`, `purchases.csv`).
2. Build with Maven: `mvn clean install`
3. Run: `java -cp target/Java-AL-W5-BigData-1.0-SNAPSHOT.jar com.amalitech.RecommendationEngine`

---

## 3. Machine Learning: Email Spam Detection & Sentiment Analysis

**Path:** `machine-learning`

### Overview

Applies deep learning (DL4J) to classify emails as spam or not, and to perform sentiment analysis. Includes model training, evaluation, and inference.

### Key Features

- Preprocessing and vectorization of email text.
- Deep learning models for spam detection and sentiment analysis.
- Model persistence and loading.

### Technologies

- Java, Deeplearning4j (DL4J), ND4J, Maven

### Structure

- `SpamDetection.java`: Loads emails, trains a spam classifier, and predicts new samples.
- `SentimentAnalysis.java`: Trains or loads a sentiment model and predicts sentiment.
- `ClassifyEmail.java`: Example of classifying a single email.
- `model/ModelConfiguration.java`: Defines the neural network architecture.
- `model/SentimentModel.java`: Model logic, training, saving, and loading.
- `resources/emails.csv`: Example dataset.
- `pom.xml`: DL4J and related dependencies.

### Usage

1. Place your labeled email data in `src/main/resources/emails.csv`.
2. Build with Maven: `mvn clean install`
3. Run: `java -cp target/JAVA-AL-ML-1.0-SNAPSHOT.jar com.amalitech.SpamDetection`

---

## 4. Secure Coding & Cryptography

**Path:** `securecoding-and-cryptography`

### Overview

Demonstrates secure coding practices and cryptography in Java, including SQL injection prevention, XSS mitigation, hashing, and symmetric encryption.

### Key Features

- Safe SQL queries using prepared statements.
- Input sanitization for XSS prevention.
- Hashing sensitive data (SHA-256).
- Symmetric encryption/decryption (AES).

### Technologies

- Java, BouncyCastle, OWASP Encoder, Maven

### Structure

- `securecoding/SecureDatabase.java`: Example of safe SQL queries.
- `securecoding/XSSPrevention.java`: HTML input sanitization.
- `cryptography/HashingExample.java`: SHA-256 hashing.
- `cryptography/CryptographyExample.java`: AES encryption/decryption.
- `pom.xml`: Security and cryptography dependencies.

### Usage

1. Build with Maven: `mvn clean install`
2. Run the examples as Java applications (e.g., `java -cp target/JAVA-AL-W5-SecureCodingAndCryptoGraphy-1.0-SNAPSHOT.jar cryptography.HashingExample`)

---

## General Notes

- All projects use Maven for dependency management and builds.
- Java 21 or compatible version is recommended.
- See each subdirectory for more details and source code.

---

Happy coding!
