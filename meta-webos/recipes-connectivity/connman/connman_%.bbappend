# Copyright (c) 2018-2022 LG Electronics, Inc.

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

EXTENDPRAUTO:append = "webos22"
SYSTEMD_SERVICE:${PN}:remove = "connman.service"

WEBOS_VERSION = "1.41-7_0df19afb90f104bab2a94feccbf4ae52ac463b40"
WEBOS_REPO_NAME = "connman-webos"
SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions

do_install:append() {
    rm -vf ${D}${systemd_unitdir}/system/connman.service
}
