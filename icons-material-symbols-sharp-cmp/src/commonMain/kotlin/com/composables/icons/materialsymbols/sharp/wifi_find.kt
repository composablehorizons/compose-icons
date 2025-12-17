package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wifi_find: ImageVector
    get() {
        if (_Wifi_find != null) return _Wifi_find!!
        
        _Wifi_find = ImageVector.Builder(
            name = "wifi_find",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(0f, 359f)
                quadToRelative(93f, -93f, 215.5f, -146f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(142f, 0f, 264.5f, 53f)
                reflectiveQuadTo(960f, 359f)
                lineToRelative(-56f, 57f)
                quadToRelative(-81f, -81f, -190f, -128.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-103f, 0f, -195f, 32.5f)
                reflectiveQuadTo(117f, 363f)
                lineToRelative(419f, 420f)
                lineToRelative(-56f, 57f)
                close()
                moveToRelative(384f, -40f)
                lineTo(761f, 698f)
                quadToRelative(-18f, 11f, -38f, 16.5f)
                reflectiveQuadToRelative(-43f, 5.5f)
                quadToRelative(-68f, 0f, -114f, -46f)
                reflectiveQuadToRelative(-46f, -114f)
                quadToRelative(0f, -68f, 46f, -114f)
                reflectiveQuadToRelative(114f, -46f)
                quadToRelative(68f, 0f, 114f, 46f)
                reflectiveQuadToRelative(46f, 114f)
                quadToRelative(0f, 23f, -5.5f, 43f)
                reflectiveQuadTo(818f, 641f)
                lineToRelative(102f, 103f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(680f, 640f)
                quadToRelative(34f, 0f, 57f, -23f)
                reflectiveQuadToRelative(23f, -57f)
                quadToRelative(0f, -34f, -23f, -57f)
                reflectiveQuadToRelative(-57f, -23f)
                quadToRelative(-34f, 0f, -57f, 23f)
                reflectiveQuadToRelative(-23f, 57f)
                quadToRelative(0f, 34f, 23f, 57f)
                reflectiveQuadToRelative(57f, 23f)
                close()
                moveTo(480f, 783f)
                close()
            }
        }.build()
        
        return _Wifi_find!!
    }

private var _Wifi_find: ImageVector? = null

