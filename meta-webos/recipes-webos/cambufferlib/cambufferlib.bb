# Copyright (c) 2022-2023 LG Electronics, Inc.

SUMMARY = "Camera Shared Memory library for webOS"
AUTHOR  = "Moorthy B S <moorthy.bs@lge.com>"
SECTION = "webos/libs"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=89aea4e17d99a7cacdbeed46a0096b10 \
    file://oss-pkg-info.yaml;md5=2bdfe040dcf81b4038370ae96036c519 \
"
inherit webos_component
inherit webos_cmake
inherit webos_system_bus
inherit webos_enhanced_submissions
inherit webos_public_repo
inherit webos_machine_impl_dep
inherit webos_machine_dep
inherit webos_pkgconfig

WEBOS_VERSION = "1.0.0-6_74badce83b364f135e982164779c4877d8b5701b"
PR = "r0"

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"

S = "${WORKDIR}/git"

PACKAGECONFIG[testapp] = "-DTEST_APP=ON, -DTEST_APP=OFF, opencv, "

INSANE_SKIP:${PN} = "dev-so"

FILES_SOLIBSDEV = ""
FILES:${PN} += "${libdir}/*.so"
