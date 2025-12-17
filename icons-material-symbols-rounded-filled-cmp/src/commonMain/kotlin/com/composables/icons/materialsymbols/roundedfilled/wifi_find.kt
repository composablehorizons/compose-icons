package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wifi_find: ImageVector
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
                moveTo(423f, 783f)
                lineTo(61f, 421f)
                quadToRelative(-13f, -13f, -18.5f, -28.5f)
                reflectiveQuadTo(38f, 360f)
                quadToRelative(1f, -17f, 7.5f, -32f)
                reflectiveQuadTo(66f, 302f)
                quadToRelative(81f, -70f, 194.5f, -106f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(107f, 0f, 219.5f, 36.5f)
                reflectiveQuadTo(894f, 303f)
                quadToRelative(14f, 11f, 20.5f, 26.5f)
                reflectiveQuadTo(922f, 361f)
                quadToRelative(1f, 16f, -5f, 31.5f)
                reflectiveQuadTo(899f, 421f)
                lineToRelative(-14f, 14f)
                quadToRelative(-30f, -51f, -82.5f, -83f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 69f, 32.5f, 122.5f)
                reflectiveQuadTo(554f, 765f)
                lineToRelative(-17f, 18f)
                quadToRelative(-12f, 12f, -26.5f, 17.5f)
                reflectiveQuadTo(480f, 806f)
                quadToRelative(-16f, 0f, -30.5f, -5.5f)
                reflectiveQuadTo(423f, 783f)
                close()
                moveToRelative(413f, -11f)
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
            }
        }.build()
        
        return _Wifi_find!!
    }

private var _Wifi_find: ImageVector? = null

