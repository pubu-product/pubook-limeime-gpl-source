# nuazure-limeime-oss-release

> Source code release of a modified fork of **[lime-ime/limeime](https://github.com/lime-ime/limeime)**, published under the **GNU General Public License v3.0 (or later)** to satisfy the corresponding-source obligations of GPLv3 §6 for Nuazure / Pubook e-reader devices.
>
> **This project is not affiliated with, endorsed by, or maintained by the original LIME / lime-ime authors.** It is an independent, unofficial derivative published solely for open-source license compliance.

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](LICENSE)

---

## 關於本專案（About）

本倉庫公開的是 **LIME 輸入法**（繁體中文注音輸入法）原始碼的**修改版本**，此版本隨附於部分 Nuazure Pubook 電子書閱讀器裝置中出貨／預先安裝。

由於 LIME 採用 **GNU GPL-3.0-or-later** 授權，依授權條款第 6 條規定，任何人若取得內含此軟體之裝置（二進位形式），即有權取得對應之完整原始碼。本倉庫即為履行此義務而公開發布。

**本專案與原始 [lime-ime/limeime](https://github.com/lime-ime/limeime) 專案及其作者、貢獻者無任何隸屬、代表或背書關係。若有 LIME 本體相關問題（非本次修改內容），請洽原始專案。**

This repository publishes a **modified version** of the source code for **LIME**, a Traditional Chinese Zhuyin (Bopomofo) input method editor for Android, as shipped/pre-installed on certain Nuazure Pubook e-reader devices.

Because LIME is licensed under **GNU GPL-3.0-or-later**, GPLv3 §6 requires that anyone who receives the binary form of this software be given access to the complete corresponding source code. This repository exists to fulfill that obligation.

---

## 上游專案原始說明（Original Upstream Project README）

> 以下內容逐字保留自原始 [lime-ime/limeime](https://github.com/lime-ime/limeime) 專案的 README，依 GPL 授權「保留原始聲明」之慣例原樣收錄於此，**不代表 Nuazure 之聲明，亦不保證其中連結、聯絡方式或功能敘述於現今仍然有效或適用於本 fork**。若內容與本 fork 實際行為不符（例如下方隱私權說明所述之權限用途），請以 Nuazure 於本 README 其他章節之聲明及實際程式碼為準。

> The following is reproduced verbatim from the original [lime-ime/limeime](https://github.com/lime-ime/limeime) project's README, preserved here per GPL notice-retention practice. **It does not represent a statement by Nuazure, and its links, contacts, or functional descriptions may no longer be current or may not apply to this fork.** Where it conflicts with Nuazure's statements elsewhere in this document or with the actual code, this fork's own statements and code govern.

<details>
<summary>點此展開原始 README 內容（Click to expand original README）</summary>

> LIME (Lightweight Input Method Editor) 程式碼採用開源GPL 的方式授權，目前專案網站分別放置在 Github 及 中研院 OpenFoundary 上對外開放。
>
> 我們歡迎您能夠加入 LIME IME 專案團隊，協助程式的開發與測試，讓更多 Android 的使用者享受到科技帶來的好處、推廣並延續繁體中文輸入的社群。
>
> Github Project 網址 http://github.com/lime-ime/　http://www.limeime.org/
>
> OpenFoundary http://www.openfoundry.org/of/projects/1920
>
> LIME中文輸入法Facebook粉絲專頁 http://facebook.com/limeime/
>
> LIME 使用與操作說明 http://netkidz.net/blog/　http://goo.gl/vtW1F
>
> **Core Development Team**
>
> jrywjwu@gmail.com - Jeremy Wu
> netkidz@gmail.com - Julian Chen
> hosoyu@gmail.com - Art Hung
>
> **隱私權與安全性**
>
> LIMEIME 提供 Google 空間雲端備份所以於應用程式中含有 android.permission.GET_ACCOUNTS 權限, 此為存取雲端空間的必要權限。本應用程式並不會搜集或分享使用者的個人資訊或應用為其他的目地。

</details>

**編按（Editorial Note）**：上述隱私權說明中提及之 `android.permission.GET_ACCOUNTS` 權限用途，係原始上游專案之聲明；本 fork 是否仍保留此權限與雲端備份功能、其實際資料處理行為是否與上述聲明一致，請以本 README「修改內容說明」章節及本 fork 實際 AndroidManifest／程式碼為準，Nuazure 對此另行負責確認與聲明。

---

## 適用機型與版本對照（Applicable Devices & Version Mapping）
本原始碼供以下 Pubook 裝置系列使用：**Pubook（封閉式）、PubookSE、PubookPro、Pubook2、PubookMobile、PubookMobileBW**。由於各機型韌體會持續更新，其上搭載的 LIME 版本可能隨韌體版本不同而有差異，本 README 本文不逐筆列出對照表（避免因韌體頻繁更新導致文件內容過時）。

---

## 修改內容說明（Modifications from Upstream）
本 fork 相對於上游 [lime-ime/limeime](https://github.com/lime-ime/limeime) 所做的修改包含：
- 調整建置設定（Gradle／AndroidManifest）以配合 Pubook 裝置環境
- UI／按鍵配置客製化
- 與裝置系統整合的相關調整

---

## 授權（License）

本專案（含所有修改內容）依循原專案授權條款，採用 **GNU General Public License v3.0 or later** 釋出。完整條文請見本倉庫 [`LICENSE`](LICENSE) 檔案，或參閱 <https://www.gnu.org/licenses/gpl-3.0.html>。

This project, including all modifications, is licensed under the **GNU General Public License v3.0 or later**, consistent with the upstream project. See [`LICENSE`](LICENSE) for the full text.

---

## 如何取得其他形式的原始碼（Alternative Ways to Obtain the Source）
本原始碼已透過本 GitHub 倉庫公開提供免費網路存取，依 GPLv3 第 6 條第 (b)(2) 項／(d) 項規定，此網路存取管道即已滿足對應原始碼之提供義務。
若您無法透過 GitHub 存取本倉庫，或有其他索取原始碼之需求，歡迎來信聯繫，我們將協助提供其他取得方式：

- Email：`pubu.pm@gmail.com`

此網路取得管道自本裝置型號最後一次對外散布之日起，至少持續維持 **3 年**，且只要本公司仍為該裝置型號提供備品或客戶支援服務，將持續維持。

The source code is already made publicly available for network download via this GitHub repository, which satisfies the corresponding-source obligation under GPLv3 §6(b)(2)/(d).

If you are unable to access this repository via GitHub, or have any other request regarding obtaining the source, please contact us and we will assist:

- Email: `pubu.pm@gmail.com`

This network-based access will be maintained for at least three (3) years from the date this product model was last distributed, and for as long as we provide spare parts or customer support for this product model.

---

## 建置方式（Build Instructions）

```bash
# 請依實際建置流程填寫
cd LimeStudio
./gradlew assembleRelease
```

## 聯絡方式（Contact）

如對本原始碼發布有任何疑問，請聯繫：`pubu.pm@gmail.com`
