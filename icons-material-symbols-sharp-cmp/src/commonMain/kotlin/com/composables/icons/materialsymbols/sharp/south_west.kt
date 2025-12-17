package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.South_west: ImageVector
    get() {
        if (_South_west != null) return _South_west!!
        
        _South_west = ImageVector.Builder(
            name = "south_west",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(264f)
                lineToRelative(464f, -464f)
                lineToRelative(56f, 56f)
                lineToRelative(-464f, 464f)
                horizontalLineToRelative(264f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _South_west!!
    }

private var _South_west: ImageVector? = null

