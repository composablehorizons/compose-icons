package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wifi_password: ImageVector
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
                moveTo(85f, 444f)
                lineTo(0f, 359f)
                quadToRelative(93f, -93f, 215.5f, -146f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(142f, 0f, 264.5f, 53f)
                reflectiveQuadTo(960f, 359f)
                lineToRelative(-85f, 85f)
                quadToRelative(-76f, -77f, -177.5f, -120.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-116f, 0f, -217.5f, 43.5f)
                reflectiveQuadTo(85f, 444f)
                close()
                moveToRelative(169f, 170f)
                lineToRelative(-84f, -85f)
                quadToRelative(60f, -60f, 139.5f, -94.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(91f, 0f, 170.5f, 34.5f)
                reflectiveQuadTo(790f, 529f)
                lineToRelative(-84f, 85f)
                quadToRelative(-44f, -44f, -102f, -69f)
                reflectiveQuadToRelative(-124f, -25f)
                quadToRelative(-66f, 0f, -124f, 25f)
                reflectiveQuadToRelative(-102f, 69f)
                close()
                moveToRelative(226f, 226f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(760f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 920f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 760f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 720f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(960f, 800f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 960f)
                horizontalLineTo(760f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(840f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Wifi_password!!
    }

private var _Wifi_password: ImageVector? = null

