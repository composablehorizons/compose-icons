package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Key_vertical: ImageVector
    get() {
        if (_Key_vertical != null) return _Key_vertical!!
        
        _Key_vertical = ImageVector.Builder(
            name = "key_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(1f, 505f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadTo(453f, 895f)
                lineToRelative(-103f, -90f)
                quadToRelative(-6f, -5f, -9.5f, -11.5f)
                reflectiveQuadTo(336f, 779f)
                quadToRelative(-1f, -8f, 1.5f, -15.5f)
                reflectiveQuadTo(345f, 750f)
                lineToRelative(55f, -70f)
                lineToRelative(-52f, -52f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(52f, -52f)
                verticalLineToRelative(-14f)
                quadToRelative(-72f, -25f, -116f, -87f)
                reflectiveQuadToRelative(-44f, -139f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 81f, -46f, 141.5f)
                reflectiveQuadTo(560f, 506f)
                verticalLineToRelative(318f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-9f, 13.5f)
                lineToRelative(-41f, 41f)
                quadToRelative(-5f, 5f, -11.5f, 8f)
                reflectiveQuadTo(481f, 905f)
                close()
            }
        }.build()
        
        return _Key_vertical!!
    }

private var _Key_vertical: ImageVector? = null

