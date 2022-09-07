//Q1) Write the difference between JRE, JDK and JVM?
//
//        ans: JDK(Java Development Kit)-It is a software development kit that helps in the development of applications in Java.
//        Along with JRE, the JDK includes other various development tools.
//        JDK is platform-dependent. For each OS platform (Linux, Windows, Mac, etc.)
//        users are required to install a different JDK.
//        JRE(Java Runtime Environment)-It is a kind of software package that provides class libraries of Java with JVM.
//        Moreover, it includes other components for running the Java applications.
//        JRE is also platform-dependent like JDK.
//        JVM(Java Virtual Machine)-It is a platform-independent abstract machine that includes a loader, runtime data,
//        and execution engine. It is also known as a Java interpreter.Unlike JDK and JRE, JVM is platform-independent,
//        which means users won’t require different JVM for each OS platform.
//
//        Q2) Write the difference between JSE, JEE and JME?
//        ans: JSE – Java Standard Edition
//        Java Platform, Standard Edition or Java SE is a widely used platform for programming in the Java language.
//        It is the Java Platform used to deploy portable applications for general use. In practical terms, Java SE consists of a virtual machine,
//        which must be used to run Java programs, together with a set of libraries (or "packages") needed to allow the use of file systems, networks,
//        graphical interfaces, and so on, from within those programs.
//        JME – Java Micro Edition
//        Java Platform, Micro Edition, or Java ME, is a Java platform designed for embedded systems (mobile devices are one kind of such systems) .
//        Target devices range from industrial controls to mobile phones (especially feature phones) and set-top boxes.
//        JEE – Java Enterprise Edition
//        The Java platform Enterprise Edition differs from the Java Standard Edition Platform (JSE) in that it adds libraries which provide
//        functionality to deploy fault-tolerant, distributed, multi-tier Java software, based largely on modular components running on an application server.
//
//
//        Q3) How does java achieve platform independency?
//        Java is a platform independent language because of the magic of java which is bytecode.
//        In java, when we execute the source code,it generates the .class file which contains the bytecodes.
//        Bytecodes are interpreted by JVM which is available with every type of OS we install.
//        On the other side the source code written in C or C++ gets converted into an object code
//        which is machine and OS dependent and hence are termed as Platform dependent.
//
//
//        Q4) What are features of Java and explain them?
//        Ans: Simple:- Java is easy to learn and its syntax is quite simple, clean and easy to
//        understand.
//        Object-Oriented:- Java is object-oriented, it supports all the OOPS
//        characteristics. This makes java applications easy to develop and maintain,
//        compared to structured programming language.
//        Portable and Platform Independent:- Java source code is compiled and
//        converted into bytecode. this bytecode can run on multiple platforms i.e. Write Once
//        and Run Anywhere(WORA), we can compile the java code in one Operating
//        System and execute it on another Operating System.
//        Secure:- JAVA has provided an implicit component inside JVM in the form of a
//        “Security Manager”  to provide implicit security against malicious code. Java has
//        provided very good predefined implementations for almost all well-known network
//        security. JAVA has provided a separate middleware service in JAAS [Java
//        Authentication and Authorization Service], which provides web security. Auth, SSO.
//        Robust:- Robust means strong. Java is having a very good memory management
//        system in the form of a heap memory management system, it is a dynamic memory
//        management system, it allocates and deallocates memory for the objects at
//        runtime. JAVA is having very good Exception Handling mechanisms, because, Java
//        has provided a very good predefined library to represent and handle almost all the
//        frequently generated exceptions in java applications.
//        Multithreaded:- Java supports multithreading to enhance performance. by using
//        this we can execute multiple functionalities simultaneously.
//
//        Q5) Write a Java Application which prints your details?
//        Example OutputName : XYZ
//        Father’s Name : XYZ
//        Mother‘s Name : XYZ
//        Age : XYZ
//        Gender : XYZ
//        Address : XYZ
//        Mobile No. : XYZ



public class Main
{
    public static void main(String args[]) {
        System.out.println("Name:Pallavi Bobale");
        System.out.println("Father’s Name: Arvind Bobale");
        System.out.println("Mothers Name : Rekha Bobale");
        System.out.println("Age: 23");
        System.out.println("Gender: Female");
        System.out.println("Address: At. Ralegoan, Tah.Samudrapur, Dist-wardha");
        System.out.println("Mobile No.: 9370024118");
    }
}