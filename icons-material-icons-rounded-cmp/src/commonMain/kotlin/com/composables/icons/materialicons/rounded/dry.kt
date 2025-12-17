package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dry: ImageVector
    get() {
        if (_Dry != null) return _Dry!!
        
        _Dry = ImageVector.Builder(
            name = "dry",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(1.94f, 11.79f)
                    curveTo(1.34f, 12.36f, 1f, 13.14f, 1f, 13.97f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    lineToRelative(13.68f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(12.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(7.18f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(12.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(8.18f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(12.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(6.18f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(8.86f)
                    lineToRelative(1.49f, -2.61f)
                    curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f)
                    curveToRelative(0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f)
                    lineTo(9.81f, 5.71f)
                    curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f)
                    lineTo(1.94f, 11.79f)
                    close()
                    moveTo(16.99f, 8.07f)
                    curveToRelative(0f, 0.52f, -0.42f, 0.93f, -0.93f, 0.93f)
                    curveToRelative(-0.52f, 0f, -0.93f, -0.42f, -0.93f, -0.93f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f)
                    lineToRelative(-0.07f, -0.06f)
                    curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f)
                    lineToRelative(0f, 0f)
                    curveTo(13f, 2.42f, 13.42f, 2f, 13.93f, 2f)
                    curveToRelative(0.51f, 0f, 0.93f, 0.42f, 0.93f, 0.93f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f)
                    lineToRelative(0.07f, 0.07f)
                    curveTo(16.55f, 5.74f, 17.03f, 6.88f, 16.99f, 8.07f)
                    lineTo(16.99f, 8.07f)
                    close()
                    moveTo(21f, 8.07f)
                    curveTo(21f, 8.58f, 20.58f, 9f, 20.06f, 9f)
                    reflectiveCurveToRelative(-0.93f, -0.42f, -0.93f, -0.93f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f)
                    lineToRelative(-0.07f, -0.06f)
                    curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0f, -0.51f, 0.42f, -0.93f, 0.93f, -0.93f)
                    reflectiveCurveToRelative(0.93f, 0.42f, 0.93f, 0.93f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f)
                    lineToRelative(0.07f, 0.07f)
                    curveTo(20.55f, 5.74f, 21.03f, 6.88f, 21f, 8.07f)
                    lineTo(21f, 8.07f)
                    close()
                }
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

