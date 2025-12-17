package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Numbers: ImageVector
    get() {
        if (_Numbers != null) return _Numbers!!
        
        _Numbers = ImageVector.Builder(
            name = "numbers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20.68f, 9.27f)
                    lineToRelative(0.01f, -0.06f)
                    curveTo(20.85f, 8.59f, 20.39f, 8f, 19.76f, 8f)
                    horizontalLineTo(17f)
                    lineToRelative(0.7f, -2.79f)
                    curveTo(17.85f, 4.59f, 17.39f, 4f, 16.76f, 4f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.45f, 0f, -0.83f, 0.3f, -0.94f, 0.73f)
                    lineTo(15f, 8f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(0.7f, -2.79f)
                    curveTo(11.85f, 4.59f, 11.39f, 4f, 10.76f, 4f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.45f, 0f, -0.83f, 0.3f, -0.94f, 0.73f)
                    lineTo(9f, 8f)
                    horizontalLineTo(5.76f)
                    curveTo(5.31f, 8f, 4.92f, 8.3f, 4.82f, 8.73f)
                    lineTo(4.8f, 8.79f)
                    curveTo(4.65f, 9.41f, 5.11f, 10f, 5.74f, 10f)
                    horizontalLineTo(8.5f)
                    lineToRelative(-1f, 4f)
                    horizontalLineTo(4.26f)
                    curveToRelative(-0.45f, 0f, -0.83f, 0.3f, -0.94f, 0.73f)
                    lineTo(3.3f, 14.79f)
                    curveTo(3.15f, 15.41f, 3.61f, 16f, 4.24f, 16f)
                    horizontalLineTo(7f)
                    lineToRelative(-0.7f, 2.79f)
                    curveTo(6.15f, 19.41f, 6.61f, 20f, 7.24f, 20f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.45f, 0f, 0.83f, -0.3f, 0.94f, -0.73f)
                    lineTo(9f, 16f)
                    horizontalLineToRelative(4f)
                    lineToRelative(-0.7f, 2.79f)
                    curveTo(12.15f, 19.41f, 12.61f, 20f, 13.24f, 20f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.45f, 0f, 0.83f, -0.3f, 0.94f, -0.73f)
                    lineTo(15f, 16f)
                    horizontalLineToRelative(3.24f)
                    curveToRelative(0.45f, 0f, 0.83f, -0.3f, 0.94f, -0.73f)
                    lineToRelative(0.01f, -0.06f)
                    curveToRelative(0.15f, -0.61f, -0.31f, -1.21f, -0.94f, -1.21f)
                    horizontalLineTo(15.5f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(3.24f)
                    curveTo(20.19f, 10f, 20.58f, 9.7f, 20.68f, 9.27f)
                    close()
                    moveTo(13.5f, 14f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(4f)
                    lineTo(13.5f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Numbers!!
    }

private var _Numbers: ImageVector? = null

