# clkProgress

## CircularProgress and ProgressDialog

Use the clkPorgress library for a more stylish, useful and customizable progress tool in your Android projects. With the clkProgress library, you can have a customizable CircularProgress and a ProgressDialog where you can inform users.

### GetStarted

Step 1 : Add it in your root build.gradle at the end of repositories:<br/><br/>

    allprojects {
        repositories {
          maven { url 'https://jitpack.io' }
        } 
    }
  
Step 2. Add the dependency**

    dependencies {
            implementation 'com.github.colakcode:clkProgress:v1.0'
    }

### CircularProgress
The CircularProgress screenshot is provided below.<br/>
![CircularProgress](https://github.com/colakcode/clkProgress/blob/master/images/circular_progress.png)

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

    ProgressDialog.show(activity,circularProgress,backgroundColor, textColor, Gravity.CENTER);
    
## Author
Kemal ÇOLAK [@colakcode](https://github.com/colakcode/) on GitHub


