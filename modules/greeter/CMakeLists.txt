# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.22.1)

project(Greeter)

link_libraries(
        log)

add_library(
        # Specifies the name of the library.
        greeter

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        src/main/cpp/greeter.cpp)
