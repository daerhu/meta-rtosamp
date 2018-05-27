DESCRIPTION = "wlan0 startup script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

# SRC_URI specifies the files that are to be used as the scripts.
SRC_URI = "file://wlan0-init.sh"

do_install() {
    # Ensure directories are created
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc5.d

    # Put the script in init.d directory
    install -m 0755 ${WORKDIR}/wlan0-init.sh  ${D}${sysconfdir}/init.d/

    # Link to init script from rc5.d directory
    ln -sf ../init.d/wlan0-init.sh ${D}${sysconfdir}/rc5.d/S98wlan0-init
}
