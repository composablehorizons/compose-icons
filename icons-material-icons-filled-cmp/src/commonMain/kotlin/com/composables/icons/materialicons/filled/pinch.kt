package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pinch: ImageVector
    get() {
        if (_Pinch != null) return _Pinch!!
        
        _Pinch = ImageVector.Builder(
            name = "pinch",
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
                    moveTo(6f, 2.5f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(9.5f)
                    verticalLineTo(3.56f)
                    lineTo(3.56f, 9.5f)
                    horizontalLineTo(6f)
                    verticalLineTo(11f)
                    horizontalLineTo(1f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.44f)
                    lineTo(8.44f, 2.5f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(22.98f, 16.82f)
                    lineToRelative(-0.63f, 4.46f)
                    curveTo(22.21f, 22.27f, 21.36f, 23f, 20.37f, 23f)
                    horizontalLineToRelative(-6.16f)
                    curveToRelative(-0.53f, 0f, -1.29f, -0.21f, -1.66f, -0.59f)
                    lineTo(8f, 17.62f)
                    lineToRelative(0.83f, -0.84f)
                    curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f)
                    lineTo(13f, 17.24f)
                    verticalLineTo(6.5f)
                    curveTo(13f, 5.67f, 13.67f, 5f, 14.5f, 5f)
                    reflectiveCurveTo(16f, 5.67f, 16f, 6.5f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(0.91f)
                    curveToRelative(0.31f, 0f, 0.62f, 0.07f, 0.89f, 0.21f)
                    lineToRelative(4.09f, 2.04f)
                    curveTo(22.66f, 15.14f, 23.1f, 15.97f, 22.98f, 16.82f)
                    close()
                }
            }
        }.build()
        
        return _Pinch!!
    }

private var _Pinch: ImageVector? = null

