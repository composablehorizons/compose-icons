package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_indent_increase: ImageVector
    get() {
        if (_Format_indent_increase != null) return _Format_indent_increase!!
        
        _Format_indent_increase = ImageVector.Builder(
            name = "format_indent_increase",
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
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 8f)
                verticalLineToRelative(8f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                close()
                moveToRelative(8f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11f)
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
        
        return _Format_indent_increase!!
    }

private var _Format_indent_increase: ImageVector? = null

