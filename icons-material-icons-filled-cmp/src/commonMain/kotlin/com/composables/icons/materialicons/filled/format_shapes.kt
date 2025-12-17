package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Format_shapes: ImageVector
    get() {
        if (_Format_shapes != null) return _Format_shapes!!
        
        _Format_shapes = ImageVector.Builder(
            name = "format_shapes",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 7f)
                verticalLineTo(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineTo(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineTo(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
                moveToRelative(2f, 18f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(12f, -2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 5f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-5.27f, 9f)
                horizontalLineToRelative(-3.49f)
                lineToRelative(-0.73f, 2f)
                horizontalLineTo(7.89f)
                lineToRelative(3.4f, -9f)
                horizontalLineToRelative(1.4f)
                lineToRelative(3.41f, 9f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(-0.74f, -2f)
                close()
                moveToRelative(-3.04f, -1.26f)
                horizontalLineToRelative(2.61f)
                lineTo(12f, 8.91f)
                lineToRelative(-1.31f, 3.83f)
                close()
            }
        }.build()
        
        return _Format_shapes!!
    }

private var _Format_shapes: ImageVector? = null

