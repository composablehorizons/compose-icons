package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Format_line_spacing: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(10f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(10f)
                close()
                moveToRelative(-8.5f, 0f)
                lineTo(5f, 20.5f)
                lineTo(8.5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineToRelative(2.5f)
                lineTo(5f, 3.5f)
                lineTo(1.5f, 7f)
                horizontalLineTo(4f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(8.5f, -6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(10f)
                close()
            }
        }.build()
        
        return _Format_line_spacing!!
    }

private var _Format_line_spacing: ImageVector? = null

