# Copyright (c) 2017-2024 LG Electronics, Inc.

EXTENDPRAUTO:append = "webos15"
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI:append:webos = " \
    file://0001-webos-disable-predictable-network-interface-naming.patch \
"

