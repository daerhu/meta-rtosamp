SUMMARY = "Custom image for snickerdoodle"

IMAGE_INSTALL = "packagegroup-core-boot \
                 ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
                 ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL_append = " wl18xx-firmware iw wpa-supplicant \
                         dhcp-client wlan0-startup"
IMAGE_LINGUAS = " "

LICENSE = "MIT"
inherit core-image
IMAGE_ROOTFS_SIZE ?= "8192"
