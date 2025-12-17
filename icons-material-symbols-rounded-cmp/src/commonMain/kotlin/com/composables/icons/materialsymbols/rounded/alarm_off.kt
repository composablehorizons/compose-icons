package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Alarm_off: ImageVector
    get() {
        if (_Alarm_off != null) return _Alarm_off!!
        
        _Alarm_off = ImageVector.Builder(
            name = "alarm_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(770f, 661f)
                quadToRelative(-16f, -5f, -23f, -19.5f)
                reflectiveQuadToRelative(-2f, -29.5f)
                quadToRelative(8f, -23f, 11.5f, -44.5f)
                reflectiveQuadTo(760f, 524f)
                quadToRelative(0f, -118f, -81.5f, -201f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-26f, 0f, -47.5f, 3f)
                reflectiveQuadTo(392f, 253f)
                quadToRelative(-14f, 5f, -27.5f, -2.5f)
                reflectiveQuadTo(346f, 227f)
                quadToRelative(-5f, -16f, 3f, -31f)
                reflectiveQuadToRelative(25f, -20f)
                quadToRelative(25f, -8f, 51.5f, -12f)
                reflectiveQuadToRelative(54.5f, -4f)
                quadToRelative(76f, 0f, 141.5f, 28.5f)
                reflectiveQuadToRelative(114f, 78f)
                quadTo(784f, 316f, 812f, 382.5f)
                reflectiveQuadTo(840f, 524f)
                quadToRelative(0f, 26f, -4.5f, 53f)
                reflectiveQuadTo(822f, 632f)
                quadToRelative(-5f, 17f, -20.5f, 25.5f)
                reflectiveQuadTo(770f, 661f)
                close()
                moveToRelative(-62f, -483f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(114f, 114f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(708f, 178f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-74f, 0f, -139.5f, -28f)
                reflectiveQuadTo(226f, 776f)
                quadToRelative(-49f, -48f, -77.5f, -113f)
                reflectiveQuadTo(120f, 524f)
                quadToRelative(0f, -62f, 18.5f, -116.5f)
                reflectiveQuadTo(192f, 308f)
                lineToRelative(-34f, -34f)
                lineToRelative(-20f, 20f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(20f, -20f)
                lineToRelative(-46f, -46f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-98f, -98f)
                quadToRelative(-45f, 33f, -99.5f, 51.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -79f)
                quadToRelative(42f, 0f, 82f, -13f)
                reflectiveQuadToRelative(74f, -36f)
                lineTo(248f, 366f)
                quadToRelative(-23f, 35f, -35.5f, 75.5f)
                reflectiveQuadTo(200f, 524f)
                quadToRelative(0f, 116f, 82f, 196.5f)
                reflectiveQuadTo(480f, 801f)
                close()
                moveToRelative(-38f, -242f)
                close()
                moveToRelative(114f, -114f)
                close()
            }
        }.build()
        
        return _Alarm_off!!
    }

private var _Alarm_off: ImageVector? = null

