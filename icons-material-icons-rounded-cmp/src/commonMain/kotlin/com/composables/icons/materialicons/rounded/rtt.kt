package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rtt: ImageVector
    get() {
        if (_Rtt != null) return _Rtt!!
        
        _Rtt = ImageVector.Builder(
            name = "rtt",
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
                    moveTo(8.76f, 4.69f)
                    lineTo(8.15f, 8.58f)
                    curveToRelative(-0.12f, 0.78f, 0.48f, 1.49f, 1.28f, 1.49f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.64f, 0f, 1.18f, -0.46f, 1.28f, -1.09f)
                    lineToRelative(0.53f, -3.41f)
                    horizontalLineToRelative(2.58f)
                    lineTo(11.8f, 18.43f)
                    horizontalLineToRelative(-1.24f)
                    curveToRelative(-0.63f, 0f, -1.16f, 0.46f, -1.26f, 1.08f)
                    lineToRelative(0f, 0.01f)
                    curveTo(9.17f, 20.3f, 9.77f, 21f, 10.56f, 21f)
                    horizontalLineToRelative(4.67f)
                    curveToRelative(0.63f, 0f, 1.17f, -0.46f, 1.26f, -1.08f)
                    lineToRelative(0f, -0.01f)
                    curveToRelative(0.12f, -0.78f, -0.48f, -1.48f, -1.26f, -1.48f)
                    horizontalLineToRelative(-0.86f)
                    lineToRelative(2f, -12.86f)
                    horizontalLineToRelative(2.58f)
                    lineToRelative(-0.47f, 3.01f)
                    curveToRelative(-0.12f, 0.78f, 0.48f, 1.49f, 1.28f, 1.49f)
                    horizontalLineToRelative(0.03f)
                    curveToRelative(0.64f, 0f, 1.18f, -0.46f, 1.28f, -1.09f)
                    lineToRelative(0.57f, -3.67f)
                    curveTo(21.83f, 4.09f, 20.89f, 3f, 19.66f, 3f)
                    horizontalLineToRelative(-8.92f)
                    curveTo(9.76f, 3f, 8.92f, 3.72f, 8.76f, 4.69f)
                    close()
                    moveTo(8f, 5f)
                    horizontalLineTo(4.86f)
                    curveTo(4.36f, 5f, 3.94f, 5.36f, 3.87f, 5.85f)
                    lineToRelative(0f, 0f)
                    curveTo(3.77f, 6.45f, 4.24f, 7f, 4.86f, 7f)
                    horizontalLineToRelative(2.83f)
                    lineTo(8f, 5f)
                    close()
                    moveTo(7.39f, 9f)
                    horizontalLineTo(4.25f)
                    curveTo(3.75f, 9f, 3.33f, 9.36f, 3.26f, 9.85f)
                    lineToRelative(0f, 0f)
                    curveTo(3.16f, 10.45f, 3.63f, 11f, 4.25f, 11f)
                    horizontalLineToRelative(2.83f)
                    lineTo(7.39f, 9f)
                    close()
                    moveTo(8.31f, 17f)
                    horizontalLineTo(3.17f)
                    curveToRelative(-0.49f, 0f, -0.91f, 0.36f, -0.99f, 0.85f)
                    lineToRelative(0f, 0f)
                    curveTo(2.08f, 18.45f, 2.55f, 19f, 3.17f, 19f)
                    horizontalLineTo(8f)
                    lineTo(8.31f, 17f)
                    close()
                    moveTo(8.93f, 13f)
                    horizontalLineTo(3.79f)
                    curveToRelative(-0.49f, 0f, -0.91f, 0.36f, -0.99f, 0.85f)
                    lineToRelative(0f, 0f)
                    curveTo(2.7f, 14.45f, 3.17f, 15f, 3.79f, 15f)
                    horizontalLineToRelative(4.84f)
                    lineTo(8.93f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Rtt!!
    }

private var _Rtt: ImageVector? = null

