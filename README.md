To run the Java Servlet program, you need JDK + Apache Tomcat + a Java IDE (such as Eclipse). Here’s the easiest way to run it using Eclipse and Tomcat.

## Step 1: Install the required software

- JDK: Install a Java Development Kit.
- Apache Tomcat: Install Tomcat 9
- Eclipse IDE for Enterprise Java and Web Developers: This makes it easier to create and run servlet projects.

## Step 2: Create a Dynamic Web Project

1. Open Eclipse.
2. Go to File → New → Dynamic Web Project.
3. Enter the project name: `ServletDemo`.
4. Select your installed Tomcat 9 runtime.
5. Click Finish.

If you don't see Dynamic Web Project, you may need the Eclipse Enterprise Java and Web Tools.

## Step 3: Create the servlet class

1. Expand your project in the Project Explorer.
2. Right-click `Java Resources → src → New → Package`.
3. Name the package `com.example`.
4. Right-click the package → New → Class.
5. Name it `LifeCycleServlet`.
6. Paste the Java code from my previous answer into the class.

Make sure the file is named `LifeCycleServlet.java`.

## Step 4: Run the program

1. Right-click your project.
2. Select Run As → Run on Server.
3. Choose Tomcat 9 Server and click Finish.
4. Open your browser and enter:

