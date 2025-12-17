package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Policy: ImageVector
    get() {
        if (_Policy != null) return _Policy!!
        
        _Policy = ImageVector.Builder(
            name = "policy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 85f, -29f, 163.5f)
                reflectiveQuadTo(688f, 746f)
                lineTo(560f, 618f)
                quadToRelative(-18f, 11f, -38.5f, 16.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 22f, -5.5f, 42.5f)
                reflectiveQuadTo(618f, 562f)
                lineToRelative(60f, 60f)
                quadToRelative(20f, -41f, 31f, -86f)
                reflectiveQuadToRelative(11f, -92f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                quadToRelative(26f, -8f, 49.5f, -20.5f)
                reflectiveQuadTo(576f, 746f)
                lineToRelative(56f, 56f)
                quadToRelative(-33f, 27f, -71.5f, 47f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(8f, -77f)
                close()
            }
        }.build()
        
        return _Policy!!
    }

private var _Policy: ImageVector? = null

