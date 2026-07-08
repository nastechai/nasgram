# 🐾 nasgram
[![Crowdin](https://badges.crowdin.net/e/a094217ac83905ae1625526d59bba8dc/localized.svg)](https://neko.crowdin.com/nasgram)  
nasgram is a third-party Telegram client with not many but useful modifications.

- Website: https://nasgram.app
- Telegram channel: https://t.me/nekoupdates
- Downloads: https://nasgram.app/download
- Feedback: https://github.com/nasgram/nasgram/issues

## API, Protocol documentation

Telegram API manuals: https://core.telegram.org/api

MTProto protocol manuals: https://core.telegram.org/mtproto

## Compilation Guide

1. Download the nasgram source code ( `git clone https://github.com/nastechai/nasgram` )
1. Fill out storeFile, storePassword, keyAlias, keyPassword in local.properties to access your release.keystore
1. Go to https://console.firebase.google.com/, create two android apps with application IDs tw.nekomimi.nasgram and tw.nekomimi.nasgram.beta, turn on firebase messaging and download `google-services.json`, which should be copied into `TMessagesProj` folder.
1. Open the project in the Studio (note that it should be opened, NOT imported).
1. Fill out values in `TMessagesProj/src/main/java/tw/nekomimi/nasgram/Extra.java` – there’s a link for each of the variables showing where and which data to obtain.
1. You are ready to compile nasgram.

## Localization

nasgram is forked from Telegram, thus most locales follows the translations of Telegram for Android, checkout https://translations.telegram.org/en/android/.

As for the nasgram specialized strings, we use Crowdin to translate nasgram. Join project at https://neko.crowdin.com/nasgram. Help us bring nasgram to the world!
