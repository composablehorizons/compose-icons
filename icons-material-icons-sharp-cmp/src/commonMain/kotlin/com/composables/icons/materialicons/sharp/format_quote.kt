package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_quote: ImageVector
    get() {
        if (_Format_quote != null) return _Format_quote!!
        
        _Format_quote = ImageVector.Builder(
            name = "format_quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 17f)
                horizontalLineToRelative(3f)
                lineToRelative(2f, -4f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineToRelative(-2f, 4f)
                close()
                moveToRelative(10f, 0f)
                horizontalLineToRelative(3f)
                lineToRelative(2f, -4f)
                verticalLineTo(7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineToRelative(-2f, 4f)
                close()
            }
        }.build()
        
        return _Format_quote!!
    }

private var _Format_quote: ImageVector? = null

