package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wifi_tethering_error: ImageVector
    get() {
        if (_Wifi_tethering_error != null) return _Wifi_tethering_error!!
        
        _Wifi_tethering_error = ImageVector.Builder(
            name = "wifi_tethering_error",
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
                quadToRelative(112f, 0f, 203f, 54.5f)
                reflectiveQuadTo(827f, 320f)
                horizontalLineToRelative(-97f)
                quadToRelative(-45f, -55f, -109.5f, -87.5f)
                reflectiveQuadTo(480f, 200f)
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
                moveToRelative(360f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                close()
                moveToRelative(-40f, -160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Wifi_tethering_error!!
    }

private var _Wifi_tethering_error: ImageVector? = null

