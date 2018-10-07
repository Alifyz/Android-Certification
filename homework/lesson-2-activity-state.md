## 9. Homework

### This section lists possible homework assignments for students who are working through this codelab as part of a course led by an instructor. It's up to the instructor to do the following:

    Assign homework if required.
    Communicate to students how to submit homework assignments.
    Grade the homework assignments.

Instructors can use these suggestions as little or as much as they want, and should feel free to assign any other homework they feel is appropriate.

### If you're working through this codelab on your own, feel free to use these homework assignments to test your knowledge.
Build and run an app

    Create an app with a layout that holds a counter TextView, a Button to increment the counter, and an EditText. See the screenshot below as an example. You don't have to precisely duplicate the layout.
    Add a click handler for the Button that increments the counter.
    Run the app and increment the counter. Enter some text into the EditText.
    Rotate the device. Note that the counter is reset, but the EditText is not.
    Implement onSaveInstanceState() to save the current state of the app.
    Update onCreate() to restore the state of the app.
    Make sure that when you rotate the device, the app state is preserved.

Answer these questions

## Question 1

### If you run the homework app before implementing onSaveInstanceState(), what happens if you rotate the device? Choose one:

    The EditText no longer contains the text you entered, but the counter is preserved.
    The counter is reset to 0, and the EditText no longer contains the text you entered.
    The counter is reset to 0, but the contents of the EditText is preserved.
    The counter and the contents of the EditText are preserved.

## Question 2

### What Activity lifecycle methods are called when a device-configuration change (such as rotation) occurs? Choose one:

    Android immediately shuts down your Activity by calling onStop(). Your code must restart the Activity.
    Android shuts down your Activity by calling onPause(), onStop(), and onDestroy(). Your code must restart the Activity.
    Android shuts down your Activity by calling onPause(), onStop(), and onDestroy(), and then starts it over again, calling onCreate(), onStart(), and onResume().
    Android immediately calls onResume().

## Question 3

### When in the Activity lifecycle is onSaveInstanceState() called? Choose one:

    onSaveInstanceState() is called before the onStop() method.
    onSaveInstanceState() is called before the onResume() method.
    onSaveInstanceState() is called before the onCreate() method.
    onSaveInstanceState() is called before the onDestroy() method.

## Question 4

### Which Activity lifecycle methods are best to use for saving data before the Activity is finished or destroyed? Choose one:

    onPause() or onStop()
    onResume() or onCreate()
    onDestroy()
    onStart() or onRestart()


### Submit your app for grading
Guidance for graders

Check that the app has the following features:

    It displays a counter, a Button to increment that counter, and an EditText.
    Clicking the Button increments the counter by 1.
    When the device is rotated, both the counter and EditText states are retained.
    The implementation of MainActivity.java uses the onSaveInstanceState() method to store the counter value.
    The implementation of onCreate() tests for the existence of the outState Bundle. If that Bundle exists, the counter value is restored and saved to the TextView.

