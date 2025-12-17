package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sports_martial_arts: ImageVector
    get() {
        if (_Sports_martial_arts != null) return _Sports_martial_arts!!
        
        _Sports_martial_arts = ImageVector.Builder(
            name = "sports_martial_arts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                lineToRelative(-20f, -360f)
                lineToRelative(-127f, -73f)
                lineToRelative(-14f, 52f)
                lineToRelative(81f, 141f)
                lineToRelative(-69f, 40f)
                lineToRelative(-99f, -170f)
                lineToRelative(48f, -172f)
                lineToRelative(230f, -132f)
                lineToRelative(-110f, -110f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                lineToRelative(-144f, 83f)
                lineToRelative(48f, 42f)
                lineToRelative(328f, -268f)
                lineToRelative(48f, 56f)
                lineToRelative(-340f, 344f)
                lineToRelative(-20f, 400f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 280f)
                close()
            }
        }.build()
        
        return _Sports_martial_arts!!
    }

private var _Sports_martial_arts: ImageVector? = null

