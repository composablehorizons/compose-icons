package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
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
                    moveTo(20.59f, 10f)
                    horizontalLineToRelative(-7.94f)
                    curveTo(11.7f, 7.31f, 8.89f, 5.5f, 5.77f, 6.12f)
                    curveToRelative(-2.29f, 0.46f, -4.15f, 2.3f, -4.63f, 4.58f)
                    curveTo(0.32f, 14.58f, 3.26f, 18f, 7f, 18f)
                    curveToRelative(2.61f, 0f, 4.83f, -1.67f, 5.65f, -4f)
                    horizontalLineTo(13f)
                    lineToRelative(1.29f, 1.29f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineTo(17f, 14f)
                    lineToRelative(1.29f, 1.29f)
                    curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                    lineToRelative(2.59f, -2.61f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f)
                    lineToRelative(-0.99f, -0.97f)
                    curveTo(21.1f, 10.1f, 20.85f, 10f, 20.59f, 10f)
                    close()
                    moveTo(7f, 15f)
                    curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                    curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                    curveTo(10f, 13.65f, 8.65f, 15f, 7f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

