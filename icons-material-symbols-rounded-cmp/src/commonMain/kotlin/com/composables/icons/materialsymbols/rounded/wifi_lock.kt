package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wifi_lock: ImageVector
    get() {
        if (_Wifi_lock != null) return _Wifi_lock!!
        
        _Wifi_lock = ImageVector.Builder(
            name = "wifi_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
                moveTo(480f, 160f)
                quadToRelative(113f, 0f, 218.5f, 35.5f)
                reflectiveQuadTo(892f, 300f)
                quadToRelative(14f, 11f, 21.5f, 26.5f)
                reflectiveQuadTo(922f, 359f)
                quadToRelative(1f, 17f, -5.5f, 33.5f)
                reflectiveQuadTo(896f, 423f)
                lineToRelative(-45f, 46f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(794f, 469f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(50f, -50f)
                quadToRelative(-79f, -60f, -172f, -91f)
                reflectiveQuadToRelative(-192f, -31f)
                quadToRelative(-99f, 0f, -192f, 31f)
                reflectiveQuadToRelative(-172f, 91f)
                lineToRelative(364f, 364f)
                lineToRelative(11f, -11f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(548f, 772f)
                lineToRelative(-11f, 11f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                lineTo(63f, 423f)
                quadToRelative(-13f, -13f, -19.5f, -29.5f)
                reflectiveQuadTo(38f, 360f)
                quadToRelative(1f, -17f, 8f, -32.5f)
                reflectiveQuadTo(67f, 300f)
                quadToRelative(88f, -69f, 194f, -104.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveToRelative(0f, 323f)
                close()
            }
        }.build()
        
        return _Wifi_lock!!
    }

private var _Wifi_lock: ImageVector? = null

