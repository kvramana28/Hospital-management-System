# Hospital-Appointment-System
A Small Project For Booking an Appointment Online

# Overview

This is a simple Java-based hospital appointment system that collects patient details, identifies the reason for the visit, and schedules appointments with the appropriate doctor based on the patient's symptoms. The program guides the user through various steps including entering personal details, selecting symptoms, and confirming an appointment time.


# Features

Patient Details Collection: Captures the patient's name, age, gender, address, and phone number.

Age Verification: Ensures that patients are between 18 and 95 years old.

Gender Selection: Prompts the user to select their gender or opt for "Prefer Not To Say".

Reason for Hospital Visit: The user can select from a list of 11 reasons for the visit.

Days of Suffering: Based on the number of days the patient has been suffering from the symptoms, they are advised to consult the doctor sooner.

Doctor Assignment: Based on the selected symptom, the system assigns a doctor and room number.

Appointment Scheduling: The system allows the user to choose an appointment day and provides doctor timings.

Final Confirmation: After collecting all the information, the system confirms the appointment and displays relevant details.


# Prerequisites

Java JDK (Java 8 or higher) installed on your machine.

Basic understanding of Java programming concepts.


# Code Structure

# Main Class

Contains the main method which drives the entire program.

Uses a Scanner object to get user inputs for personal details, symptoms, appointment timing, etc.

Performs validation on user inputs (e.g., age validation, phone number validation, reason selection).

Based on the user’s selection, it displays appropriate doctor details, consultation times, and confirms the appointment.


# Detailed Functionality

1. Personal Details Collection

User is prompted to input their name, age, address, and phone number.

Age Validation: The program checks if the age is within the acceptable range (between 19 and 95 years old).

Phone Number Validation: The phone number is validated to ensure it is exactly 10 digits and consists only of numeric values.


2. Reason for Hospital Visit

The program presents 11 different reasons for visiting the hospital, such as fever, viral infections, bacterial infections, etc.

The user selects one reason, and the system displays the corresponding doctor and room number.


3. Days of Suffering

The user is asked how many days they’ve been suffering from the selected problem (e.g., "today", "more than one day", or "more than 5 days").

Based on the selection, the user is advised to see the doctor as soon as possible.


4. Doctor Assignment and Appointment Confirmation

The system assigns a doctor based on the selected reason for the visit, and provides the corresponding room number.

The user then selects the day of the week they would like to book an appointment (from Monday to Saturday).

The system provides the available doctor timings for the selected day and confirms the appointment.


5. Final Confirmation

The system confirms the appointment and informs the user that all the details will be sent via SMS.

The user is reminded to pay the appointment fee and collect the report.


6.Topic Used:

1]Basic Input/Output (I/O)

2] Conditionals (if-else statements)

3] Switch-Case Statement

4]String Handling

5]Control Flow

6]Exit Strategy
