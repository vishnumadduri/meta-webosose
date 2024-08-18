FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI:append:intel-corei7-64 = " \
    file://0001-for-emulator-with-kvm-enable-xrgb8888.patch \
"

