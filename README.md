# **Real-Time Location Tracking System Using Kafka**

This project is a backend application built to demonstrate real-time location tracking with **Apache Kafka**. It is structured to represent different components of a delivery-tracking system, specifically the **delivery person (Deliveryboy)** and the **end user**. Dummy location data is generated and streamed using Kafka to simulate real-time tracking.

## 📂 **Project Structure**

```plaintext
.
├── Deliveryboy/         # Module handling delivery person's location tracking
│   └── [Java files and configurations]
├── enduser/             # Module handling end user interaction and data consumption
│   └── [Java files and configurations]
└── README.md            # Project documentation


## **Features**

- **Real-Time Location Tracking**: Simulates live location tracking using dummy hardcoded data.
- **Apache Kafka Integration**: Demonstrates Kafka producers and consumers for efficient data streaming.
- **Modular Design**: Separated into `Deliveryboy` and `enduser` modules for clear responsibilities.

## 🛠️ **Tech Stack**

- **Programming Language**: Java  
- **Framework**: Spring Boot  
- **Message Broker**: Apache Kafka  
- **Build Tool**: Maven  

## 🏗️ **How It Works**

### **Deliveryboy Module**
The `Deliveryboy` module simulates the real-time location of a delivery person. It generates location data and publishes it to a Kafka topic.

### **Enduser Module**
The `enduser` module consumes the location data from the Kafka topic and processes it to simulate tracking from the end user's perspective.

## 🚶 **Getting Started**

### **Prerequisites**

- Java 17+  
- Apache Kafka installed and running  
- Maven installed  

### **Setup Steps**

1. **Clone the repository**:
   ```bash
   git clone https://github.com/jayi40/Real-Time-Location-Tracking-Using-Kafka.git
   cd Real-Time-Location-Tracking-Using-Kafka

