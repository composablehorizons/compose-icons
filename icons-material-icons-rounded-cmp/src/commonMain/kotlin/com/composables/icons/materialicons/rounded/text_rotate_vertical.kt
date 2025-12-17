package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_rotate_vertical: ImageVector
    get() {
        if (_Text_rotate_vertical != null) return _Text_rotate_vertical!!
        
        _Text_rotate_vertical = ImageVector.Builder(
            name = "text_rotate_vertical",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 5f)
                curveToRelative(-0.46f, 0f, -0.87f, 0.27f, -1.05f, 0.69f)
                lineToRelative(-3.88f, 8.97f)
                curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f)
                curveToRelative(0.39f, 0f, 0.74f, -0.24f, 0.89f, -0.6f)
                lineToRelative(0.66f, -1.6f)
                horizontalLineToRelative(5f)
                lineToRelative(0.66f, 1.6f)
                curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f)
                curveToRelative(0.69f, 0f, 1.15f, -0.71f, 0.88f, -1.34f)
                lineToRelative(-3.88f, -8.97f)
                curveTo(15.87f, 5.27f, 15.46f, 5f, 15f, 5f)
                close()
                moveToRelative(-1.87f, 7f)
                lineTo(15f, 6.98f)
                lineTo(16.87f, 12f)
                horizontalLineToRelative(-3.74f)
                close()
                moveToRelative(-6.78f, 7.64f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.32f, -0.31f, 0.1f, -0.85f, -0.35f, -0.85f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.44f, -1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0f)
                close()
            }
        }.build()
        
        return _Text_rotate_vertical!!
    }

private var _Text_rotate_vertical: ImageVector? = null

