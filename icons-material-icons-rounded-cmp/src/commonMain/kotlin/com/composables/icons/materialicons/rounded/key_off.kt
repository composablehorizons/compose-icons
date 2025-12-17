package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Key_off: ImageVector
    get() {
        if (_Key_off != null) return _Key_off!!
        
        _Key_off = ImageVector.Builder(
            name = "key_off",
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
                    moveTo(12.83f, 10f)
                    lineToRelative(4.09f, 4.09f)
                    lineTo(17f, 14f)
                    lineToRelative(1.29f, 1.29f)
                    curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                    lineToRelative(2.59f, -2.61f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f)
                    lineToRelative(-0.99f, -0.97f)
                    curveTo(21.1f, 10.1f, 20.85f, 10f, 20.59f, 10f)
                    horizontalLineTo(12.83f)
                    close()
                    moveTo(19.07f, 21.9f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(1.88f, 1.88f)
                    curveTo(2.2f, 7.85f, 1f, 9.79f, 1f, 12f)
                    curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                    curveToRelative(2.21f, 0f, 4.15f, -1.2f, 5.18f, -2.99f)
                    lineTo(19.07f, 21.9f)
                    close()
                    moveTo(9.91f, 12.74f)
                    curveTo(9.58f, 14.03f, 8.4f, 15f, 7f, 15f)
                    curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                    curveToRelative(0f, -1.4f, 0.97f, -2.58f, 2.26f, -2.91f)
                    lineTo(9.91f, 12.74f)
                    close()
                }
            }
        }.build()
        
        return _Key_off!!
    }

private var _Key_off: ImageVector? = null

