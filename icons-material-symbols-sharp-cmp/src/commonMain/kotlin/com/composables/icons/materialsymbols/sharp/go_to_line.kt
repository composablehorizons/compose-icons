package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Go_to_line: ImageVector
    get() {
        if (_Go_to_line != null) return _Go_to_line!!
        
        _Go_to_line = ImageVector.Builder(
            name = "go_to_line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(420f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(420f)
                close()
            }
        }.build()
        
        return _Go_to_line!!
    }

private var _Go_to_line: ImageVector? = null

