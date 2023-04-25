# Copyright (c) 2020-2023 LG Electronics, Inc.

SUMMARY = "Intent Manager"
AUTHOR = "Sangwoo Kang <sangwoo82.kang@lge.com>"
SECTION = "webos/base"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=89aea4e17d99a7cacdbeed46a0096b10 \
    file://oss-pkg-info.yaml;md5=2bdfe040dcf81b4038370ae96036c519 \
"

DEPENDS = "glib-2.0 luna-service2 libpbnjson"

WEBOS_VERSION = "1.0.0-17_ea416580431307921b4846e9421af5d22a8d62d5"
PR = "r2"

inherit webos_component
inherit webos_cmake
inherit webos_enhanced_submissions
inherit webos_daemon
inherit webos_system_bus
inherit webos_distro_dep
inherit webos_distro_variant_dep
inherit webos_public_repo

# [http://gpro.lge.com/c/webosose/com.webos.service.intent/+/348184 Fix luna-service2 usage]
SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE} \
    file://0001-Fix-luna-service2-usage.patch \
"
S = "${WORKDIR}/git"
