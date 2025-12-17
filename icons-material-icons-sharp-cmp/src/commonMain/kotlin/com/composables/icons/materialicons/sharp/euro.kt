package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Euro: ImageVector
    get() {
        if (_Euro != null) return _Euro!!
        
        _Euro = ImageVector.Builder(
            name = "euro",
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
                group {
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15f, 18.5f)
                    curveToRelative(-2.51f, 0f, -4.68f, -1.42f, -5.76f, -3.5f)
                    horizontalLineTo(15f)
                    lineToRelative(1f, -2f)
                    horizontalLineTo(8.58f)
                    curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1f)
                    reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1f)
                    horizontalLineTo(15f)
                    lineToRelative(1f, -2f)
                    horizontalLineTo(9.24f)
                    curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15f, 5.5f)
                    curveToRelative(1.61f, 0f, 3.09f, 0.59f, 4.23f, 1.57f)
                    lineTo(21f, 5.3f)
                    curveTo(19.41f, 3.87f, 17.3f, 3f, 15f, 3f)
                    curveToRelative(-3.92f, 0f, -7.24f, 2.51f, -8.48f, 6f)
                    horizontalLineTo(3f)
                    lineToRelative(-1f, 2f)
                    horizontalLineToRelative(4.06f)
                    curveTo(6.02f, 11.33f, 6f, 11.66f, 6f, 12f)
                    reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1f)
                    horizontalLineTo(3f)
                    lineToRelative(-1f, 2f)
                    horizontalLineToRelative(4.52f)
                    curveToRelative(1.24f, 3.49f, 4.56f, 6f, 8.48f, 6f)
                    curveToRelative(2.31f, 0f, 4.41f, -0.87f, 6f, -2.3f)
                    lineToRelative(-1.78f, -1.77f)
                    curveTo(18.09f, 17.91f, 16.62f, 18.5f, 15f, 18.5f)
                    close()
                }
            }
        }.build()
        
        return _Euro!!
    }

private var _Euro: ImageVector? = null

