package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Two_wheeler: ImageVector
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
                    horizontalLineTo(19f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(7.62f)
                    curveToRelative(0f, -0.74f, -0.78f, -1.23f, -1.45f, -0.89f)
                    lineToRelative(-2.28f, 1.14f)
                    lineToRelative(-2.57f, -2.57f)
                    curveTo(13.52f, 5.11f, 13.26f, 5f, 13f, 5f)
                    horizontalLineToRelative(-3f)
                    curveTo(9.45f, 5f, 9f, 5.45f, 9f, 6f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.17f)
                    curveToRelative(0.27f, 0f, 0.52f, 0.11f, 0.71f, 0.29f)
                    lineTo(14.59f, 9f)
                    horizontalLineToRelative(-3.35f)
                    curveToRelative(-0.16f, 0f, -0.31f, 0.04f, -0.45f, 0.11f)
                    lineToRelative(-3.14f, 1.57f)
                    curveToRelative(-0.38f, 0.19f, -0.85f, 0.12f, -1.15f, -0.19f)
                    lineToRelative(-1.2f, -1.2f)
                    curveTo(5.11f, 9.11f, 4.85f, 9f, 4.59f, 9f)
                    horizontalLineTo(1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(-2.52f, 0f, -4.49f, 2.32f, -3.89f, 4.94f)
                    curveToRelative(0.33f, 1.45f, 1.5f, 2.62f, 2.95f, 2.95f)
                    curveTo(5.68f, 19.49f, 8f, 17.52f, 8f, 15f)
                    lineToRelative(1.41f, 1.41f)
                    curveTo(9.79f, 16.79f, 10.3f, 17f, 10.83f, 17f)
                    horizontalLineToRelative(1.01f)
                    curveToRelative(0.72f, 0f, 1.38f, -0.38f, 1.74f, -1.01f)
                    lineToRelative(2.91f, -5.09f)
                    lineToRelative(1.01f, 1.01f)
                    curveToRelative(-1.13f, 0.91f, -1.76f, 2.41f, -1.38f, 4.05f)
                    curveToRelative(0.34f, 1.44f, 1.51f, 2.61f, 2.95f, 2.94f)
                    curveTo(21.68f, 19.49f, 24f, 17.51f, 24f, 15f)
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

