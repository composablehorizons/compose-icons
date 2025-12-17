package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Alarm_off: ImageVector
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
                moveTo(748f, 640f)
                lineTo(364f, 250f)
                quadToRelative(-18f, -19f, -13f, -43.5f)
                reflectiveQuadToRelative(29f, -32.5f)
                quadToRelative(23f, -8f, 48.5f, -11f)
                reflectiveQuadToRelative(51.5f, -3f)
                quadToRelative(74f, 0f, 139.5f, 28f)
                reflectiveQuadTo(734f, 265.5f)
                quadTo(783f, 315f, 811.5f, 381f)
                reflectiveQuadTo(840f, 524f)
                quadToRelative(0f, 26f, -3.5f, 51f)
                reflectiveQuadTo(825f, 624f)
                quadToRelative(-8f, 24f, -33f, 29.5f)
                reflectiveQuadTo(748f, 640f)
                close()
                moveToRelative(-40f, -462f)
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
            }
        }.build()
        
        return _Alarm_off!!
    }

private var _Alarm_off: ImageVector? = null

