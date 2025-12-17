package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Key_off: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.91f, 14.09f)
                    lineTo(17f, 14f)
                    lineToRelative(2f, 2f)
                    lineToRelative(4f, -4.04f)
                    lineTo(21f, 10f)
                    horizontalLineToRelative(-8.17f)
                    lineTo(16.91f, 14.09f)
                    close()
                    moveTo(3.98f, 6.81f)
                    curveTo(2.2f, 7.85f, 1f, 9.79f, 1f, 12f)
                    curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                    curveToRelative(2.21f, 0f, 4.15f, -1.2f, 5.18f, -2.99f)
                    lineToRelative(7.59f, 7.59f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(3.98f, 6.81f)
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

