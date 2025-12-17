package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_underlined: ImageVector
    get() {
        if (_Format_underlined != null) return _Format_underlined!!
        
        _Format_underlined = ImageVector.Builder(
            name = "format_underlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(-101f, 0f, -157f, -63f)
                reflectiveQuadToRelative(-56f, -167f)
                verticalLineToRelative(-330f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(336f)
                quadToRelative(0f, 56f, 28f, 91f)
                reflectiveQuadToRelative(82f, 35f)
                quadToRelative(54f, 0f, 82f, -35f)
                reflectiveQuadToRelative(28f, -91f)
                verticalLineToRelative(-336f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(330f)
                quadToRelative(0f, 104f, -56f, 167f)
                reflectiveQuadToRelative(-157f, 63f)
                close()
            }
        }.build()
        
        return _Format_underlined!!
    }

private var _Format_underlined: ImageVector? = null

