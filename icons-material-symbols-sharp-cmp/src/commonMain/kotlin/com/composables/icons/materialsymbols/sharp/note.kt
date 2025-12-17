package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Note: ImageVector
    get() {
        if (_Note != null) return _Note!!
        
        _Note = ImageVector.Builder(
            name = "note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 22f)
                verticalLineTo(2f)
                horizontalLineToRelative(10f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(9f, -13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(12f)
                verticalLineTo(9f)
                close()
                moveTo(6f, 4f)
                verticalLineToRelative(5f)
                verticalLineToRelative(-5f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Note!!
    }

private var _Note: ImageVector? = null

