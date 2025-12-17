package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Square_foot: ImageVector
    get() {
        if (_Square_foot != null) return _Square_foot!!
        
        _Square_foot = ImageVector.Builder(
            name = "square_foot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-742f)
                lineToRelative(164f, 164f)
                lineToRelative(-54f, 54f)
                lineToRelative(28f, 28f)
                lineToRelative(54f, -54f)
                lineToRelative(104f, 104f)
                lineToRelative(-54f, 54f)
                lineToRelative(28f, 28f)
                lineToRelative(54f, -54f)
                lineToRelative(104f, 104f)
                lineToRelative(-54f, 54f)
                lineToRelative(28f, 28f)
                lineToRelative(54f, -54f)
                lineToRelative(104f, 104f)
                lineToRelative(-54f, 54f)
                lineToRelative(28f, 28f)
                lineToRelative(54f, -54f)
                lineToRelative(154f, 154f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineToRelative(332f)
                lineTo(240f, 388f)
                verticalLineToRelative(332f)
                close()
            }
        }.build()
        
        return _Square_foot!!
    }

private var _Square_foot: ImageVector? = null

