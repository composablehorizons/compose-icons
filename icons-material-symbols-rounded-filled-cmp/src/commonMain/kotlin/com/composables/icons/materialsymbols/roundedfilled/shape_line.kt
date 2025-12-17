package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shape_line: ImageVector
    get() {
        if (_Shape_line != null) return _Shape_line!!
        
        _Shape_line = ImageVector.Builder(
            name = "shape_line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 440f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 240f)
                quadToRelative(0f, -84f, 58.5f, -142f)
                reflectiveQuadTo(240f, 40f)
                quadToRelative(84f, 0f, 142f, 58f)
                reflectiveQuadToRelative(58f, 142f)
                quadToRelative(0f, 83f, -58f, 141.5f)
                reflectiveQuadTo(240f, 440f)
                close()
                moveTo(640f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 840f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 560f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 640f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(640f)
                close()
                moveToRelative(69f, -612f)
                lineTo(308f, 708f)
                quadToRelative(5f, 12f, 8.5f, 25f)
                reflectiveQuadToRelative(3.5f, 27f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(200f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(14f, 0f, 27f, 3.5f)
                reflectiveQuadToRelative(25f, 8.5f)
                lineToRelative(400f, -401f)
                quadToRelative(-5f, -12f, -8.5f, -24.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 200f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(-14f, 0f, -26.5f, -3.5f)
                reflectiveQuadTo(709f, 308f)
                close()
            }
        }.build()
        
        return _Shape_line!!
    }

private var _Shape_line: ImageVector? = null

