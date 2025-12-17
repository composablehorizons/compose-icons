package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wifi_tethering: ImageVector
    get() {
        if (_Wifi_tethering != null) return _Wifi_tethering!!
        
        _Wifi_tethering = ImageVector.Builder(
            name = "wifi_tethering",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(204f, 810f)
                quadToRelative(-57f, -55f, -90.5f, -129.5f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 237f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 237f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 520f)
                quadToRelative(0f, 86f, -33.5f, 161f)
                reflectiveQuadTo(756f, 810f)
                lineToRelative(-56f, -56f)
                quadToRelative(46f, -44f, 73f, -104.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 69f, 27f, 129f)
                reflectiveQuadToRelative(74f, 104f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(113f, -113f)
                quadToRelative(-35f, -33f, -56f, -78.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 53f, -21f, 99f)
                reflectiveQuadToRelative(-56f, 78f)
                lineToRelative(-57f, -57f)
                quadToRelative(25f, -23f, 39.5f, -54f)
                reflectiveQuadToRelative(14.5f, -66f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 36f, 14.5f, 66.5f)
                reflectiveQuadTo(374f, 640f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(163f, -97f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Wifi_tethering!!
    }

private var _Wifi_tethering: ImageVector? = null

