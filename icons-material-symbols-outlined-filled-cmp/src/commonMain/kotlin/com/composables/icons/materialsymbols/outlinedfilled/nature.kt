package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nature: ImageVector
    get() {
        if (_Nature != null) return _Nature!!
        
        _Nature = ImageVector.Builder(
            name = "nature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, -60f, 33f, -110.5f)
                reflectiveQuadToRelative(89f, -73.5f)
                quadToRelative(9f, -75f, 65.5f, -125.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(76f, 0f, 132.5f, 50.5f)
                reflectiveQuadTo(678f, 256f)
                quadToRelative(56f, 23f, 89f, 73.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(600f, 640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Nature!!
    }

private var _Nature: ImageVector? = null

