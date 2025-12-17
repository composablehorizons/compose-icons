package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_rotation_down: ImageVector
    get() {
        if (_Text_rotation_down != null) return _Text_rotation_down!!
        
        _Text_rotation_down = ImageVector.Builder(
            name = "text_rotation_down",
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
                moveTo(6.35f, 19.65f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.32f, -0.32f, 0.1f, -0.86f, -0.35f, -0.86f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f)
                close()
                moveTo(12.2f, 8.5f)
                verticalLineToRelative(5f)
                lineToRelative(-1.6f, 0.66f)
                curveToRelative(-0.36f, 0.15f, -0.6f, 0.5f, -0.6f, 0.89f)
                curveToRelative(0f, 0.69f, 0.71f, 1.15f, 1.34f, 0.88f)
                lineToRelative(8.97f, -3.88f)
                curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.05f)
                curveToRelative(0f, -0.46f, -0.27f, -0.87f, -0.69f, -1.05f)
                lineToRelative(-8.97f, -3.88f)
                curveToRelative(-0.63f, -0.27f, -1.34f, 0.2f, -1.34f, 0.89f)
                curveToRelative(0f, 0.39f, 0.24f, 0.74f, 0.6f, 0.89f)
                lineToRelative(1.6f, 0.65f)
                close()
                moveToRelative(6.82f, 2.5f)
                lineTo(14f, 12.87f)
                verticalLineTo(9.13f)
                lineTo(19.02f, 11f)
                close()
            }
        }.build()
        
        return _Text_rotation_down!!
    }

private var _Text_rotation_down: ImageVector? = null

