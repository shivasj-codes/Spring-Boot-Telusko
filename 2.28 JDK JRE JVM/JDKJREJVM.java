/**
 * 
 * ============================================================
 * JDK, JRE AND JVM
 * ============================================================
 *
 * To understand how Java works behind the scenes, we need to
 * understand three important terms:
 *
 * JDK -> Java Development Kit
 * JRE -> Java Runtime Environment
 * JVM -> Java Virtual Machine
 *
 *
 * ============================================================
 * JDK (JAVA DEVELOPMENT KIT)
 * ============================================================
 *
 * JDK is mainly used by Java developers to develop and compile
 * Java programs.
 *
 * Java Code
 * ```
 * ↓
 * ```
 * Compilation using JDK
 * ```
 * ↓
 * ```
 * Bytecode
 *
 * When we install the JDK, we also get the required Java
 * runtime components.
 *
 *
 * ============================================================
 * JVM (JAVA VIRTUAL MACHINE)
 * ============================================================
 *
 * JVM is responsible for running Java bytecode.
 *
 * JVM provides a virtual layer that helps Java programs run
 * on different machines.
 *
 * IMPORTANT:
 *
 * Java code is compiled into bytecode, and the JVM executes
 * that bytecode.
 *
 *
 * ============================================================
 * JRE (JAVA RUNTIME ENVIRONMENT)
 * ============================================================
 *
 * JRE provides the environment required to run Java programs.
 *
 * It provides the required runtime support and extra classes
 * and libraries needed while running Java applications.
 *
 * JVM is part of the JRE.
 *
 *
 * ============================================================
 * RELATIONSHIP BETWEEN JDK, JRE AND JVM
 * ============================================================
 *
 * JDK
 * └── JRE
 * ```
 * └── JVM
 * ```
 *
 * Simple meaning:
 *
 * JDK -> Used for developing Java programs
 * JRE -> Provides the environment to run Java programs
 * JVM -> Executes the Java bytecode
 *
 *
 * ============================================================
 * HOW A JAVA PROGRAM WORKS
 * ============================================================
 *
 * Java Source Code (.java)
 * ```
 * ↓
 * ```
 * ```
 * JDK compiles
 * ```
 * ```
 * ↓
 * ```
 * Bytecode (.class)
 * ```
 * ↓
 * ```
 * ```
 * JRE provides runtime environment
 * ```
 * ```
 * ↓
 * ```
 * ```
 * JVM executes the bytecode
 * ```
 * ```
 * ↓
 * ```
 * ```
 * Program runs
 * ```
 *
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * JDK is installed by developers for Java development.
 *
 * JRE is required to provide the runtime environment.
 *
 * JVM is where the Java bytecode is executed.
 *
 * Java uses a virtual layer to help support different machines.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. JDK -> Java Development Kit.
 *
 * 2. JRE -> Java Runtime Environment.
 *
 * 3. JVM -> Java Virtual Machine.
 *
 * 4. JDK is used to develop and compile Java programs.
 *
 * 5. JRE provides the environment required to run Java programs.
 *
 * 6. JVM executes Java bytecode.
 *
 * 7. Relationship:
 *
 * JDK -> JRE -> JVM
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * Java Code -> Written by the programmer
 *
 * JDK -> Compiles Java code
 *
 * Bytecode -> Generated after compilation
 *
 * JRE -> Provides the runtime environment
 *
 * JVM -> Executes the bytecode
 *
 * ============================================================
 */
