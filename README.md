LearnFpJava
===========

Learn Functional Programming in Java (8)

Download Java 8:
https://jdk8.java.net/download.html

I like to put it in /usr/lib/jvm/
```bash
cd /usr/lib/jvm
sudo tar -xzf /home/gpeterso/Downloads/java/jdk-8-fcs-bin-b132-linux-i586-04_mar_2014.tar.gz 
sudo ln -s /usr/lib/jvm/jdk1.8.0/ latest
```

Then in ~/.profile
```bash
export JDK_HOME=/usr/lib/jvm/latest
```

Finally, source from your profile
```bash
. ~/.profile
```

Download Maven 3.2:
http://maven.apache.org/download.cgi

Use whatever IDE you like.  The Community Edition of IntelliJ is available for free:
http://www.jetbrains.com/idea/download/

If you use IDEA, make sure you have File: Settings: Plugins: Maven Integration turned on.  Also, File: Project Structure: Project, set Project SDK and Project Language Level to 1.8.
