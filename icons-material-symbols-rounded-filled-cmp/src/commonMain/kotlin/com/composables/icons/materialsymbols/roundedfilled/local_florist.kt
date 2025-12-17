package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_florist: ImageVector
    get() {
        if (_Local_florist != null) return _Local_florist!!
        
        _Local_florist = ImageVector.Builder(
            name = "local_florist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 420f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(0f, 180f)
                quadToRelative(-39f, 0f, -70.5f, -21.5f)
                reflectiveQuadTo(364f, 522f)
                quadToRelative(-5f, 0f, -9f, 0.5f)
                reflectiveQuadToRelative(-9f, 0.5f)
                quadToRelative(-52f, 0f, -89f, -37f)
                reflectiveQuadToRelative(-37f, -89f)
                quadToRelative(0f, -21f, 7f, -40.5f)
                reflectiveQuadToRelative(21f, -36.5f)
                quadToRelative(-13f, -17f, -20f, -36.5f)
                reflectiveQuadToRelative(-7f, -40.5f)
                quadToRelative(0f, -52f, 36.5f, -89f)
                reflectiveQuadToRelative(88.5f, -37f)
                quadToRelative(5f, 0f, 9f, 0.5f)
                reflectiveQuadToRelative(9f, 0.5f)
                quadToRelative(14f, -35f, 45.5f, -56.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(39f, 0f, 70.5f, 21.5f)
                reflectiveQuadTo(596f, 118f)
                quadToRelative(5f, 0f, 9f, -0.5f)
                reflectiveQuadToRelative(9f, -0.5f)
                quadToRelative(52f, 0f, 88.5f, 37f)
                reflectiveQuadToRelative(36.5f, 89f)
                quadToRelative(0f, 21f, -6.5f, 40.5f)
                reflectiveQuadTo(712f, 320f)
                quadToRelative(13f, 17f, 20f, 36.5f)
                reflectiveQuadToRelative(7f, 40.5f)
                quadToRelative(0f, 52f, -36.5f, 89f)
                reflectiveQuadTo(614f, 523f)
                quadToRelative(-5f, 0f, -9f, -0.5f)
                reflectiveQuadToRelative(-9f, -0.5f)
                quadToRelative(-14f, 35f, -45.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(0f, 279f)
                quadToRelative(0f, -126f, 76f, -223f)
                reflectiveQuadToRelative(193f, -126f)
                quadToRelative(19f, -5f, 37.5f, -3.5f)
                reflectiveQuadTo(819f, 542f)
                quadToRelative(12f, 13f, 13.5f, 31f)
                reflectiveQuadToRelative(-3.5f, 35f)
                quadToRelative(-28f, 118f, -125.5f, 194.5f)
                reflectiveQuadTo(480f, 879f)
                close()
                moveToRelative(0f, 1f)
                quadToRelative(0f, -126f, -76f, -223f)
                reflectiveQuadTo(211f, 531f)
                quadToRelative(-19f, -5f, -37.5f, -3.5f)
                reflectiveQuadTo(141f, 543f)
                quadToRelative(-12f, 13f, -13.5f, 31f)
                reflectiveQuadToRelative(3.5f, 35f)
                quadToRelative(28f, 118f, 125.5f, 194.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Local_florist!!
    }

private var _Local_florist: ImageVector? = null

