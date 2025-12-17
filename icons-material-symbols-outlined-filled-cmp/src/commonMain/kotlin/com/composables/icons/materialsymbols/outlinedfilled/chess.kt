package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chess: ImageVector
    get() {
        if (_Chess != null) return _Chess!!
        
        _Chess = ImageVector.Builder(
            name = "chess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(52f)
                lineToRelative(22f, -160f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(686f)
                lineToRelative(22f, 160f)
                horizontalLineToRelative(52f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(138f, -540f)
                lineToRelative(-58f, -260f)
                quadToRelative(33f, 25f, 68f, 47f)
                reflectiveQuadToRelative(77f, 22f)
                quadToRelative(40f, 0f, 73.5f, -20.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(28f, 28f, 61.5f, 48.5f)
                reflectiveQuadTo(615f, 149f)
                quadToRelative(42f, 0f, 77f, -22f)
                reflectiveQuadToRelative(68f, -47f)
                lineToRelative(-57f, 260f)
                horizontalLineTo(258f)
                close()
            }
        }.build()
        
        return _Chess!!
    }

private var _Chess: ImageVector? = null

