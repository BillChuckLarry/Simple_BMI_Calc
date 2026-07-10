# Java BMI Calculator

A command-line Body Mass Index (BMI) calculator built in Java that supports both **Imperial** (pounds/inches) and **Metric** (kilograms/meters) measurement systems. The application calculates a user's BMI and classifies it into a standard weight category based on the calculated value.

---

## Features

* Supports two measurement systems:

  * Imperial (pounds and inches)
  * Metric (kilograms and meters)
* Calculates Body Mass Index (BMI)
* Displays the user's BMI value
* Classifies BMI into weight categories
* Uses a `switch` statement to select the measurement system
* Uses conditional (`if-else`) statements to determine BMI classification

---

## Technologies

* **Language:** Java
* **IDE:** Eclipse (or any Java IDE)
* **Libraries:** `java.util.Scanner`

---

## Concepts Demonstrated

* Console input using the `Scanner` class
* Variables and primitive data types
* Mathematical calculations
* `switch` statements
* Nested `if-else` decision making
* User interaction through the command line

---

## BMI Formulas

### Imperial Units

```text
BMI = (Weight × 703) / (Height²)
```

### Metric Units

```text
BMI = Weight / (Height²)
```

---

## BMI Categories

|      BMI Range | Classification         |
| -------------: | ---------------------- |
|     Below 16.0 | Severely Underweight   |
|    16.0 – 16.9 | Moderately Underweight |
|    17.0 – 18.5 | Slightly Underweight   |
|    18.5 – 24.9 | Normal Weight          |
|    25.0 – 29.9 | Overweight             |
|    30.0 – 34.9 | Slightly Obese         |
|    35.0 – 39.9 | Moderately Obese       |
| 40.0 and above | Severely Obese         |

---

## Program Flow

1. Prompt the user to select a measurement system.
2. Read the user's selection.
3. Request weight and height based on the selected units.
4. Calculate the Body Mass Index (BMI).
5. Display the BMI value.
6. Determine and display the corresponding BMI category.

---

## Example Output

```text
Please select Imperial (pounds/inches) measurements by entering '1'
or Metric (meters/kilograms) units by entering '2'

2

Using Metric units for BMI Calculations

Enter your weight in kilograms
72

Enter your height in meters
1.75

Your BMI is = 23.51

You are considered Normal Weight
```

---

## Project Structure

```text
day3/
└── BMICalculator.java
```

---

## Future Enhancements

* Validate user input to prevent invalid or negative values.
* Round BMI results to two decimal places for improved readability.
* Refactor duplicated BMI classification logic into a reusable method.
* Allow users to perform multiple calculations without restarting the application.
* Add support for additional health metrics such as Basal Metabolic Rate (BMR) or daily calorie recommendations.
* Create a graphical user interface (GUI) using JavaFX or Swing.

---

## Skills Demonstrated

* Java fundamentals
* Console application development
* Mathematical programming
* User input handling
* Decision making with `switch` and `if-else`
* Code organization and problem solving

---

## Author

**William Lawrence**

This project was developed as part of my Java programming portfolio to demonstrate proficiency with user input, conditional logic, mathematical calculations, and console-based application development.

