package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Format_shapes: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(16f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, -16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.29f, 7f)
                lineToRelative(-3.4f, 9f)
                horizontalLineToRelative(1.62f)
                lineToRelative(0.73f, -2f)
                horizontalLineToRelative(3.49f)
                lineToRelative(0.74f, 2f)
                horizontalLineToRelative(1.63f)
                lineToRelative(-3.41f, -9f)
                horizontalLineToRelative(-1.4f)
                close()
                moveToRelative(-0.6f, 5.74f)
                lineTo(12f, 8.91f)
                lineToRelative(1.3f, 3.83f)
                horizontalLineToRelative(-2.61f)
                close()
                moveTo(17f, 3f)
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
                verticalLineTo(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
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
                moveToRelative(16f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
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
                close()
            }
        }.build()
        
        return _Format_shapes!!
    }

private var _Format_shapes: ImageVector? = null

