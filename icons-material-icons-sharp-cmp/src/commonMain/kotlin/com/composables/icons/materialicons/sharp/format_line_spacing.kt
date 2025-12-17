package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_line_spacing: ImageVector
    get() {
        if (_Format_line_spacing != null) return _Format_line_spacing!!
        
        _Format_line_spacing = ImageVector.Builder(
            name = "format_line_spacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 7f)
                horizontalLineToRelative(2.5f)
                lineTo(5f, 3.5f)
                lineTo(1.5f, 7f)
                horizontalLineTo(4f)
                verticalLineToRelative(10f)
                horizontalLineTo(1.5f)
                lineTo(5f, 20.5f)
                lineTo(8.5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                close()
                moveToRelative(4f, -2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(10f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(10f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Format_line_spacing!!
    }

private var _Format_line_spacing: ImageVector? = null

