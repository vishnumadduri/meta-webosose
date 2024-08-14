# Copyright (c) 2020-2024 LG Electronics, Inc.

#The gallium-llvm is recommended as software 3D graphics renderer
GALLIUM_LLVM = "gallium-llvm"
PACKAGECONFIG:append:qemux86 = " gallium ${GALLIUM_LLVM}"
PACKAGECONFIG:append:qemux86-64 = " gallium ${GALLIUM_LLVM}"
PACKAGECONFIG:append:intel-corei7-64 = " gallium ${GALLIUM_LLVM}"

