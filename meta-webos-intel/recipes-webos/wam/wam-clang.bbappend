install_units:append:intel-corei7-64() {

  if [ -f "$script" ]; then
     sed -i '/export WAM_COMMON_SWITCHES=\" \\/a\    --use-gpu-in-tests \\' $script
  fi
}

