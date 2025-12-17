package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wifi_password: ImageVector
    get() {
        if (_Wifi_password != null) return _Wifi_password!!
        
        _Wifi_password = ImageVector.Builder(
            name = "wifi_password",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 960f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 720f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineTo(960f)
                horizontalLineTo(720f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(840f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                verticalLineToRelative(40f)
                close()
                moveTo(254f, 614f)
                lineToRelative(-84f, -86f)
                quadToRelative(62f, -62f, 142f, -95f)
                reflectiveQuadToRelative(168f, -33f)
                quadToRelative(88f, 0f, 168.5f, 33.5f)
                reflectiveQuadTo(790f, 530f)
                lineToRelative(-84f, 84f)
                quadToRelative(-45f, -45f, -103.5f, -69.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-64f, 0f, -122.5f, 24.5f)
                reflectiveQuadTo(254f, 614f)
                close()
                moveTo(84f, 444f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineToRelative(-84f, 84f)
                quadToRelative(-79f, -79f, -181.5f, -121.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-112f, 0f, -214.5f, 42.5f)
                reflectiveQuadTo(84f, 444f)
                close()
                moveToRelative(396f, 396f)
                lineTo(339f, 698f)
                quadToRelative(28f, -28f, 64.5f, -43f)
                reflectiveQuadToRelative(76.5f, -15f)
                quadToRelative(40f, 0f, 76.5f, 15f)
                reflectiveQuadToRelative(64.5f, 43f)
                lineTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Wifi_password!!
    }

private var _Wifi_password: ImageVector? = null

