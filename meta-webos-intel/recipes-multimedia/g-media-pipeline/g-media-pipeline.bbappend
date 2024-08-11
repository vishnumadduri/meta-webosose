FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI:append:intel-corei7-64 = " \
    file://001-webos-for-intel-change-as-qemu-for-now.patch \
"
COMPATIBLE_MACHINE = "^qemux86$|^qemux86-64$|^raspberrypi3$|^raspberrypi3-64$|^raspberrypi4$|^raspberrypi4-64$|^intel-corei7-64$"
