package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sensors_krx: ImageVector
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
                moveTo(160f, 480f)
                quadToRelative(0f, 38f, 8.5f, 74.5f)
                reflectiveQuadTo(194f, 623f)
                quadToRelative(8f, 15f, 4f, 32f)
                reflectiveQuadToRelative(-17f, 26f)
                quadToRelative(-14f, 10f, -29.5f, 5.5f)
                reflectiveQuadTo(127f, 667f)
                quadToRelative(-23f, -43f, -35f, -89.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -51f, 12f, -98.5f)
                reflectiveQuadToRelative(35f, -89.5f)
                quadToRelative(9f, -15f, 24.5f, -19f)
                reflectiveQuadToRelative(29.5f, 6f)
                quadToRelative(13f, 9f, 17f, 26f)
                reflectiveQuadToRelative(-4f, 32f)
                quadToRelative(-17f, 32f, -25.5f, 68.5f)
                reflectiveQuadTo(160f, 480f)
                close()
                moveToRelative(320f, 240f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(320f, -240f)
                quadToRelative(0f, -38f, -8.5f, -74.5f)
                reflectiveQuadTo(766f, 337f)
                quadToRelative(-8f, -15f, -4.5f, -32f)
                reflectiveQuadToRelative(16.5f, -26f)
                quadToRelative(14f, -10f, 30f, -6f)
                reflectiveQuadToRelative(25f, 19f)
                quadToRelative(23f, 42f, 35f, 89.5f)
                reflectiveQuadToRelative(12f, 98.5f)
                quadToRelative(0f, 51f, -12f, 97.5f)
                reflectiveQuadTo(833f, 667f)
                quadToRelative(-9f, 15f, -25f, 19.5f)
                reflectiveQuadToRelative(-30f, -5.5f)
                quadToRelative(-13f, -9f, -16.5f, -26f)
                reflectiveQuadToRelative(4.5f, -32f)
                quadToRelative(17f, -32f, 25.5f, -68.5f)
                reflectiveQuadTo(800f, 480f)
                close()
            }
        }.build()
        
        return _Sensors_krx!!
    }

private var _Sensors_krx: ImageVector? = null

