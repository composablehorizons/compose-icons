package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Variable_remove: ImageVector
    get() {
        if (_Variable_remove != null) return _Variable_remove!!
        
        _Variable_remove = ImageVector.Builder(
            name = "variable_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(128f)
                quadToRelative(-14f, -4f, -29f, -6f)
                reflectiveQuadToRelative(-31f, -2f)
                quadToRelative(-91f, 0f, -155.5f, 64f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, 16f, 2f, 31f)
                reflectiveQuadToRelative(6f, 29f)
                horizontalLineTo(120f)
                close()
                moveToRelative(576f, 80f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
            }
        }.build()
        
        return _Variable_remove!!
    }

private var _Variable_remove: ImageVector? = null

