package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_indent_decrease: ImageVector
    get() {
        if (_Format_indent_decrease != null) return _Format_indent_decrease!!
        
        _Format_indent_decrease = ImageVector.Builder(
            name = "format_indent_decrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 17f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-8f, -5f)
                lineToRelative(4f, 4f)
                verticalLineTo(8f)
                lineToRelative(-4f, 4f)
                close()
                moveToRelative(0f, 9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
                moveToRelative(8f, 6f)
                horizontalLineToRelative(10f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Format_indent_decrease!!
    }

private var _Format_indent_decrease: ImageVector? = null

