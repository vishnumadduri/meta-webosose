EXTRA_OECMAKE:append:class-target = " -DWEBOS_CONFIG_BUILD_TESTS:BOOL=FALSE  -DUSE_PMLOG:BOOL=TRUE  -DBUILD_LS2:BOOL=TRUE -DWANT_PROFILING:BOOL=${@ 'true' if '${WEBOS_DISTRO_PRERELEASE}' != '' else 'false'}"