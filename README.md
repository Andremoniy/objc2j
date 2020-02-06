# objc2j
Original author's ObjC2J's repo (previously hosted on code.google.com): Objective-C to Java converter 


= Downloading files =

Latest build you will found in this Google-Drive shared folder:

[https://drive.google.com/folderview?id=0BygybWBe4h7pZkZ0M0NTN1piZk0&usp=sharing ObjC2J]

You have to unzip this zip. Inside you will found several .csv files, and all needed jar-s including ObjC2J converter itself, and the folder named "jcocoa". Last one contains java files, which must be included into your project (src folder content) in order to compile converted project. 

_Actually *jcocoa* project is on early starting stage, so huge number of classes aren't yet implemented_

= Examples =

All examples from [http://www.otierney.net/objective-c.html Objective-C Beginner's Guide] till chapter "Dynamic types" must work like a charm.

= Converting =
To start converter use:

java -jar objc2j.jar <path_to_your_obj-c_project_sources>

While parsing converter can print a lot of parse-warnings. Don't worry about them: converter isn't able to properly read some Obj-c files - we are working about this issue.
Newly created Java files will be placed inside your project directory, near to their Obj-c original files.

If any questions, do not hesitate to ask me through email.