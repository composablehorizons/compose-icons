package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ssid_chart: ImageVector
    get() {
        if (_Ssid_chart != null) return _Ssid_chart!!
        
        _Ssid_chart = ImageVector.Builder(
            name = "ssid_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 602f)
                quadToRelative(0f, -10f, 4.5f, -18.5f)
                reflectiveQuadTo(137f, 570f)
                lineToRelative(49f, -35f)
                quadToRelative(23f, -17f, 52f, -14.5f)
                reflectiveQuadToRelative(50f, 22.5f)
                lineToRelative(197f, 191f)
                lineToRelative(145f, -116f)
                quadToRelative(11f, -8f, 23.5f, -13f)
                reflectiveQuadToRelative(26.5f, -5f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(680f)
                lineTo(535f, 796f)
                quadToRelative(-23f, 19f, -53.5f, 17.5f)
                reflectiveQuadTo(429f, 791f)
                lineTo(232f, 600f)
                lineToRelative(-49f, 35f)
                quadToRelative(-20f, 14f, -41.5f, 3f)
                reflectiveQuadTo(120f, 602f)
                close()
                moveToRelative(0f, -241f)
                quadToRelative(0f, -10f, 4f, -18f)
                reflectiveQuadToRelative(12f, -14f)
                lineToRelative(122f, -89f)
                quadToRelative(24f, -17f, 53f, -15f)
                reflectiveQuadToRelative(50f, 23f)
                lineToRelative(127f, 127f)
                lineToRelative(289f, -209f)
                quadToRelative(20f, -14f, 41.5f, -3f)
                reflectiveQuadToRelative(21.5f, 36f)
                quadToRelative(0f, 10f, -4.5f, 18f)
                reflectiveQuadTo(823f, 231f)
                lineTo(535f, 440f)
                quadToRelative(-24f, 17f, -53f, 15f)
                reflectiveQuadToRelative(-50f, -23f)
                lineTo(305f, 305f)
                lineToRelative(-122f, 89f)
                quadToRelative(-20f, 14f, -41.5f, 3f)
                reflectiveQuadTo(120f, 361f)
                close()
            }
        }.build()
        
        return _Ssid_chart!!
    }

private var _Ssid_chart: ImageVector? = null

