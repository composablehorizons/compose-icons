package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Two_wheeler: ImageVector
    get() {
        if (_Two_wheeler != null) return _Two_wheeler!!
        
        _Two_wheeler = ImageVector.Builder(
            name = "two_wheeler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 11f)
                    curveToRelative(-0.18f, 0f, -0.36f, 0.03f, -0.53f, 0.05f)
                    lineTo(17.41f, 9f)
                    horizontalLineTo(20f)
                    verticalLineTo(6f)
                    lineToRelative(-3.72f, 1.86f)
                    lineTo(13.41f, 5f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3.59f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(11f)
                    lineToRelative(-4f, 2f)
                    lineTo(5f, 9f)
                    horizontalLineTo(0f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    lineToRelative(2f, 2f)
                    horizontalLineToRelative(3f)
                    lineToRelative(3.49f, -6.1f)
                    lineToRelative(1.01f, 1.01f)
                    curveTo(16.59f, 12.64f, 16f, 13.75f, 16f, 15f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    curveTo(24f, 12.79f, 22.21f, 11f, 20f, 11f)
                    close()
                    moveTo(4f, 17f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    curveTo(6f, 16.1f, 5.1f, 17f, 4f, 17f)
                    close()
                    moveTo(20f, 17f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    curveTo(22f, 16.1f, 21.1f, 17f, 20f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Two_wheeler!!
    }

private var _Two_wheeler: ImageVector? = null

