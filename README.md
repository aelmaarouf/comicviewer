# Description 
This Android app is based on the sample poject *tutorial-2-mixedprocessing* available in the Opencv [website](www.opencv.org).
The purpose of this app is to detect using computer vision and specifically square detection the squares of a comic page (in image format of course).

# The app in details
At first this app shows the phone directories and after selecting the image wanted, a C++ code is executed to detect the squares in the image (the detection is a set of Points (pixel X and Y) corresponding to the four corners of the square). These informations are afterward transmitted to the JAVA application to create a Gallery with these squares detected.

# TODOs

The TODO list is still long, very long:

1. The square detection algorithm is not accurate yet
2. I'm using a file system to communicate between C++ and JAVA we can use jniexports instead
3. minor imperfections
4. UI (very important and very neglected)

# LICENSE

This project is (as i said erlier) a tutorial based code, and is a free code not to use for commercial purposes
