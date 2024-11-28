import tkinter as tk
from tkinter import messagebox

def display_prediction(prediction):
    root = tk.Tk()
    root.title("Pattern Prediction")
    root.geometry("300x200")

    label = tk.Label(root, text="Predicted Color: " + prediction, font=("Arial", 16))
    label.pack(pady=20)

    button = tk.Button(root, text="Close", command=root.destroy)
    button.pack(pady=10)

    root.mainloop()

# Example usage
if __name__ == "__main__":
    prediction = "red"  # Replace with the Java output in the future
    display_prediction(prediction)
