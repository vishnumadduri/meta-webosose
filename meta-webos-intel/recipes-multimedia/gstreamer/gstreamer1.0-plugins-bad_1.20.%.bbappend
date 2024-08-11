# Copyright (c) 2018-2024 LG Electronics, Inc.

SRC_URI:append:intel-corei7-64 = " \
    file://0004-waylandsink-remove-unsupported-subcompositor.patch;striplevel=3 \
    file://0005-h264parse-resolution-changed-event-support.patch;striplevel=3 \
"
