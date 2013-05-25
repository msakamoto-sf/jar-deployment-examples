hello.jar build step:

1. build depjar1.jar, depjar2.jar

cd depjars-src/
javac depjar1/Lib1.java
javac depjar2/Lib2.java
cd ../depjars-lib/
jar cf depjar1.jar -C ../depjars-src depjar1/Lib1.class
jar cf depjar2.jar -C ../depjars-src depjar2/Lib2.class
cd ../

2. build hello.jar

javac -cp .:depjars-src Hello.java
jar cmf hello.mf hello.jar Hello.class

3. run
java -jar hello.jar

