# try-with-resources

In Java, the **try-with-resources** statement is a try statement that declares one or more resources. The resource is as an object that must be closed after finishing the program. The **try-with-resources** statement ensures that each resource is closed at the end of the statement execution.

You can pass any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.
