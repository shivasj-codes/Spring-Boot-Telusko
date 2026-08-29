These are **3 different ways to install the JDK on Windows**. All three contain essentially the same JDK; the difference is **how it is packaged and installed**.

| Option                     | What it is                       | Installation                    | Uninstall from Windows? | Recommended? |
| -------------------------- | -------------------------------- | ------------------------------- | ----------------------- | ------------ |
| **x64 Compressed Archive** | `.zip` file                      | Manual — extract files yourself | ❌ No                    | ⭐⭐           |
| **x64 Installer**          | `.exe` installer                 | Normal Windows setup wizard     | ✅ Usually yes           | ⭐⭐⭐⭐⭐        |
| **x64 MSI Installer**      | `.msi` Windows Installer package | Windows Installer               | ✅ Yes                   | ⭐⭐⭐⭐         |

### 1. x64 Compressed Archive

This is usually a **ZIP archive**.

Example:

```text
jdk-25
 ├── bin
 ├── conf
 ├── include
 ├── jmods
 └── lib
```

You download → extract it → configure `JAVA_HOME` and `PATH` yourself.

**Good for:**

* Developers who want complete control
* Multiple JDK versions
* Portable installations
* Servers/automation

**For a beginner:** ❌ Not the easiest.

---

### 2. x64 Installer ⭐ Recommended for you

This is an **`.exe` installer**.

You simply:

```text
Download
   ↓
Run .exe
   ↓
Next → Next → Install
   ↓
JDK installed
```

It is the easiest option if you're learning **Java + Spring Boot**.

After installation, you can check:

```cmd
java -version
```

and:

```cmd
javac -version
```

**I recommend this one for you.**

---

### 3. x64 MSI Installer

MSI means **Microsoft Installer** (`.msi`).

It is also an installer, but it is designed more for **Windows Installer / enterprise deployment**.

For example, companies can use MSI packages to deploy JDKs across many computers using management tools.

For a normal personal development computer:

**You don't need MSI unless you specifically need Windows/enterprise deployment.**

---

### Which one should you download?

Since you are **learning Spring Boot**, choose:

> 🟢 **x64 Installer (.exe)**

You don't need to worry about the compressed archive or MSI right now.

After installing it, I can also show you **exactly how JDK → JAVA_HOME → PATH → Maven → Spring Boot are connected**, which is important when starting Spring Boot.

# In My Machine

JDK 25 is the latest Long-Term Support (LTS) release of the Java SE Platform.

https://www.oracle.com/in/java/technologies/downloads/#jdk25-windows

x64 Installer: https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe