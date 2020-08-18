# clkProgress

## CircularProgress and ProgressDialog

Use the clkProgress library for a more stylish, useful and customizable progress tool in your Android projects. With the clkProgress library, you can have a customizable CircularProgress and a ProgressDialog where you can inform users.

### GetStarted

Step 1 : Add it in your root build.gradle at the end of repositories:<br/><br/>

    allprojects {
        repositories {
          maven { url 'https://jitpack.io' }
        } 
    }
  
Step 2. Add the dependency

    dependencies {
            implementation 'com.github.colakcode:clkProgress:v1.0'
    }

### CircularProgress
The CircularProgress screenshot is provided below.<br/><br/>

<img src="https://github.com/colakcode/clkProgress/blob/master/images/circular_progress.gif" width="360" height="740"/>

#### XML File

    <com.clk.progress.CircularProgress
        android:layout_width="45dp"
        android:layout_height="45dp"
        android:layout_centerInParent="true"
        android:id="@+id/circularProgress"/>
        
<br/>
When the XML file is called for the first time, CircularProgress returns at a default speed, following the default 4 colors.If you want to customize it, use the java code below.
        
#### JAVA Code

        CircularProgress circularProgress = findViewById(R.id.circularProgress);
        circularProgress.setColor(Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN);
        circularProgress.setBodyColor(Color.black);
        circularProgress.setRotationSpeeed(25);
        
<br/>
As seen in the code above, CircularProgress has 4 color options. You can change the default colors with the help of the above code.

### ProgressDialog
The screenshot of the ProgressDialog is given below.<br/>

![ProgressDialog](https://github.com/colakcode/clkProgress/blob/master/images/progress_dialog.png)

### JAVA Code
You can use the following java code to call the ProgressDialog window with its standard features.<br/>

    ProgressDialog.show(activity,"Please wait...");
    
You can also customize your ProgressDialog window.<br/>

    ProgressDialog.show(activity, "Loading...", circularProgress, backgroundColor, textColor, Gravity.CENTER);
    
You can use a customized CircularProgress in ProgresDialog. You can also assign integer color variables instead of **backgroundColor** and **textColor**, and change the vertical height **(etc. Gravity.TOP, Gravity.CENTER, Gravity.BOTTOM)** of the dialog window on the screen.
    
## Author
Kemal ÇOLAK [@colakcode](https://github.com/colakcode/) on GitHub

## License

The MIT License (MIT)

Copyright <2020> <Kemal ÇOLAK>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.



