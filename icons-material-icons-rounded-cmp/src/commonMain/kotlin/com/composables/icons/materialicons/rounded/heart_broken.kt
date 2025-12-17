package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Heart_broken: ImageVector
    get() {
        if (_Heart_broken != null) return _Heart_broken!!
        
        _Heart_broken = ImageVector.Builder(
            name = "heart_broken",
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
                    moveTo(19.57f, 3.95f)
                    curveToRelative(-1.92f, -1.29f, -4.08f, -1.17f, -5.8f, -0.26f)
                    lineTo(12f, 9f)
                    horizontalLineToRelative(1.66f)
                    curveToRelative(0.67f, 0f, 1.15f, 0.65f, 0.96f, 1.29f)
                    lineToRelative(-1.82f, 6.07f)
                    curveToRelative(-0.09f, 0.29f, -0.52f, 0.2f, -0.49f, -0.1f)
                    lineTo(13f, 10f)
                    horizontalLineToRelative(-1.67f)
                    curveToRelative(-0.66f, 0f, -1.14f, -0.64f, -0.96f, -1.27f)
                    lineToRelative(1.18f, -4.11f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    curveTo(9.7f, 2.89f, 6.71f, 2.32f, 4.27f, 4.04f)
                    curveTo(2.82f, 5.07f, 2f, 6.7f, 2f, 8.49f)
                    curveToRelative(-0.01f, 3.81f, 3.53f, 6.71f, 8.66f, 11.3f)
                    curveToRelative(0.76f, 0.68f, 1.92f, 0.69f, 2.69f, 0.01f)
                    curveToRelative(4.98f, -4.42f, 8.87f, -7.58f, 8.64f, -11.62f)
                    curveTo(21.9f, 6.45f, 21f, 4.92f, 19.57f, 3.95f)
                    close()
                }
            }
        }.build()
        
        return _Heart_broken!!
    }

private var _Heart_broken: ImageVector? = null

