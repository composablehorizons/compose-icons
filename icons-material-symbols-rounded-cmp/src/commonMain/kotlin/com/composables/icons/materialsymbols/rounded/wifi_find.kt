package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wifi_find: ImageVector
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
                moveTo(451f, 811f)
                lineTo(61f, 420f)
                quadToRelative(-12f, -12f, -18f, -28f)
                reflectiveQuadToRelative(-5f, -32f)
                quadToRelative(1f, -16f, 7f, -31f)
                reflectiveQuadToRelative(20f, -26f)
                quadToRelative(82f, -70f, 195f, -106.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(111f, 0f, 222.5f, 37f)
                reflectiveQuadTo(899f, 307f)
                quadToRelative(12f, 11f, 18.5f, 24.5f)
                reflectiveQuadTo(925f, 360f)
                quadToRelative(1f, 15f, -4.5f, 30f)
                reflectiveQuadTo(904f, 416f)
                quadToRelative(-81f, -81f, -190f, -128.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-103f, 0f, -195f, 32.5f)
                reflectiveQuadTo(117f, 363f)
                lineToRelative(391f, 392f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(508f, 811f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(451f, 811f)
                close()
                moveToRelative(385f, -39f)
                lineToRelative(-75f, -74f)
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
                lineToRelative(74f, 75f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(892f, 772f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
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

