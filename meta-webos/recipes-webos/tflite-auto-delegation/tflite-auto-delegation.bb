# Copyright (c) 2022-2023 LG Electronics, Inc.

SUMMARY = "webOS AI Framework Auto Acceleration Library"
DESCRIPTION = "webOS AI Framework Auto Delegate Selector and Acceleration Policy Manager for TFLite"
AUTHOR = "Ki-Joong Lee <kijoong.lee@lge.com>"
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

WEBOS_VERSION = "1.0.0-27_8d2fc653fe4d0b0435c3995261c1ee268e53a438"
PR = "r1"

inherit webos_component
inherit webos_enhanced_submissions
inherit webos_cmake
inherit pkgconfig
inherit webos_filesystem_paths
inherit webos_test_provider
inherit webos_public_repo

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"

S = "${WORKDIR}/git"

DEPENDS = " \
    flatbuffers \
    tensorflow-lite \
    rapidjson \
    googletest \
    pmloglib \
"

AIF_INSTALL_DIR = "${datadir}/aif"
AIF_INSTALL_TEST_DIR = "${AIF_INSTALL_DIR}/test"

PACKAGECONFIG += "${@bb.utils.contains('DISTRO_FEATURES', 'gpu-delegate', 'gl-backend', '', d)}"
PACKAGECONFIG += "${@bb.utils.contains('DISTRO_FEATURES', 'edgetpu', 'edgetpu', '', d)}"

PACKAGECONFIG[edgetpu] = "-DWITH_EDGETPU:BOOL=TRUE,-DWITH_EDGETPU:BOOL=FALSE,libedgetpu"
PACKAGECONFIG[gl-backend] = "-DTFLITE_ENABLE_GPU_GL_ONLY=ON, -DTFLITE_ENABLE_GPU_GL_ONLY=OFF, virtual/egl virtual/libgles2"

EXTRA_OECMAKE += "-DAIF_INSTALL_DIR=${AIF_INSTALL_DIR}"
EXTRA_OECMAKE += "-DAIF_INSTALL_TEST_DIR=${AIF_INSTALL_TEST_DIR}"

PACKAGES =+ "${PN}-tests"
FILES:${PN}-tests += "${AIF_INSTALL_TEST_DIR}"

INSANE_SKIP:${PN} = "dev-so"

FILES_SOLIBSDEV = ""
FILES:${PN} += " \
    ${libdir}/*.so \
"