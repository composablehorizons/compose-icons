package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Kitesurfing: ImageVector
    get() {
        if (_Kitesurfing != null) return _Kitesurfing!!
        
        _Kitesurfing = ImageVector.Builder(
            name = "kitesurfing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(6f, 4.1f, 6f, 3f)
                    close()
                    moveTo(16.03f, 3.97f)
                    curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                    lineTo(20.06f, 1f)
                    horizontalLineToRelative(-2.12f)
                    lineToRelative(-1.91f, 1.91f)
                    curveTo(15.74f, 3.2f, 15.74f, 3.68f, 16.03f, 3.97f)
                    close()
                    moveTo(19.15f, 12f)
                    curveToRelative(-1.29f, 0f, -3.11f, 0.53f, -5.06f, 1.38f)
                    lineTo(13f, 12.16f)
                    curveToRelative(-0.38f, -0.42f, -0.92f, -0.66f, -1.49f, -0.66f)
                    horizontalLineTo(9.6f)
                    lineToRelative(0f, -3.5f)
                    horizontalLineTo(11f)
                    curveToRelative(1.52f, 0f, 2.94f, -0.49f, 4.09f, -1.32f)
                    curveToRelative(0.49f, -0.35f, 0.52f, -1.07f, 0.09f, -1.5f)
                    curveToRelative(-0.35f, -0.35f, -0.9f, -0.38f, -1.3f, -0.09f)
                    curveTo(13.06f, 5.66f, 12.07f, 6f, 11f, 6f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 6f, 6f, 6.9f, 6f, 8f)
                    verticalLineToRelative(4.04f)
                    curveToRelative(0f, 0.64f, 0.15f, 1.27f, 0.45f, 1.83f)
                    lineTo(8f, 16.84f)
                    curveToRelative(-0.53f, 0.38f, -1.03f, 0.78f, -1.49f, 1.17f)
                    curveTo(7.19f, 18.59f, 8.06f, 19f, 9f, 19f)
                    curveToRelative(1.2f, 0f, 2.27f, -0.66f, 3f, -1.5f)
                    curveToRelative(0.73f, 0.84f, 1.8f, 1.5f, 3f, 1.5f)
                    curveToRelative(0.33f, 0f, 0.65f, -0.05f, 0.96f, -0.14f)
                    curveTo(18.81f, 16.9f, 21f, 14.72f, 21f, 13.28f)
                    curveTo(21f, 12.25f, 19.99f, 12f, 19.15f, 12f)
                    close()
                    moveTo(9.83f, 15.61f)
                    lineTo(9f, 13.6f)
                    lineToRelative(2.5f, -0.1f)
                    lineToRelative(0.7f, 0.77f)
                    curveTo(11.64f, 14.55f, 10.42f, 15.23f, 9.83f, 15.61f)
                    close()
                    moveTo(22f, 22f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.87f, 0f, -1.73f, -0.24f, -2.53f, -0.7f)
                    curveToRelative(-0.29f, -0.16f, -0.65f, -0.17f, -0.94f, 0f)
                    curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0f)
                    curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0f)
                    curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0f)
                    curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0f)
                    curveTo(4.73f, 20.76f, 3.87f, 21f, 3f, 21f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(1.15f, 0f, 2.3f, -0.31f, 3.33f, -0.94f)
                    curveToRelative(1.66f, 1.11f, 3.78f, 1.01f, 5.58f, 0.14f)
                    curveToRelative(1.91f, 1.05f, 4.17f, 1.07f, 6.09f, 0.05f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3f, 0.75f)
                    horizontalLineToRelative(0f)
                    curveTo(21.55f, 23f, 22f, 22.55f, 22f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Kitesurfing!!
    }

private var _Kitesurfing: ImageVector? = null

