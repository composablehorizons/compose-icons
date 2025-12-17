package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sensors_krx: ImageVector
    get() {
        if (_Sensors_krx != null) return _Sensors_krx!!
        
        _Sensors_krx = ImageVector.Builder(
            name = "sensors_krx",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(148f, 703f)
                quadToRelative(-32f, -48f, -50f, -104.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -63f, 18f, -119f)
                reflectiveQuadToRelative(50f, -104f)
                lineToRelative(67f, 44f)
                quadToRelative(-26f, 38f, -40.5f, 83.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 50f, 14.5f, 95f)
                reflectiveQuadToRelative(40.5f, 83f)
                lineToRelative(-67f, 45f)
                close()
                moveToRelative(332f, 17f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(331f, 63f)
                lineToRelative(-66f, -45f)
                quadToRelative(26f, -38f, 40.5f, -83f)
                reflectiveQuadToRelative(14.5f, -95f)
                quadToRelative(0f, -50f, -14.5f, -95.5f)
                reflectiveQuadTo(745f, 301f)
                lineToRelative(66f, -44f)
                quadToRelative(32f, 48f, 50.5f, 104f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 62f, -18.5f, 118.5f)
                reflectiveQuadTo(811f, 703f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Sensors_krx!!
    }

private var _Sensors_krx: ImageVector? = null

