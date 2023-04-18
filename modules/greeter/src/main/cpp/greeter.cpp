#include <jni.h>
#include <android/log.h>

extern "C"
JNIEXPORT void JNICALL
Java_org_kman_greeter_Greeter_init(JNIEnv *env, jobject thiz) {
    __android_log_print(ANDROID_LOG_INFO, "Greeter", "Inside init function");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_org_kman_greeter_Greeter_getMessage(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("Hello World! from C++");
}
