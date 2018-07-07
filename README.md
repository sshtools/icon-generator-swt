# icon-generator-swt
An add-on for the [icon-generator](https://github.com/sshtools/icon-generator) library for generating icons in Java and SWT.

This is made available as an add-on due to there being no reliable Maven artifacts in 
Maven Central, so we used 3rd party SWT libraries and make this add-on available
from our own repository.


## Configuring your project

This add-on is available in SSHTools own Maven repository, as it cannot be deployed
to Maven Central due to SWT dependencies. So add the repository as appropriate
for your build system first. E.g for Maven :-

```xml
<repositories>
	<repository>
		<id>opensource-releases</id>
		<url>http://artifactory.javassh.com/opensource-releases</url>
		<name>SSHTOOLS Open Source Releases</name>
	</repository>
</repositories>
```

Then add the dependency itself. This will pull in the core icon-generator library
from central too.

```xml
<dependencies>
	<dependency>
		<groupId>com.sshtools</groupId>
		<artifactId>icon-generator-swt</artifactId>
		<version>1.0.0</version>
	</dependency>
</dependencies>
```
# Generating an Icon

See the [icon-generator](https://github.com/sshtools/icon-generator) for general information on building an icon.
Then when you have an IconBuilder instance, use the following to generate
an SWT image. 

```java
// You need to pass in an instance of Display as an argument for SWT 
Image swtImage  = builder.build(Image.class, Display.getDefault());
// Do something with swtImage 

```