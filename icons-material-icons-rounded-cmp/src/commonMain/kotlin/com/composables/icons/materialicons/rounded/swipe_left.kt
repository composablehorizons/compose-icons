package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Swipe_left: ImageVector
    get() {
        if (_Swipe_left != null) return _Swipe_left!!
        
        _Swipe_left = ImageVector.Builder(
            name = "swipe_left",
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
                    moveTo(3.5f, 4.02f)
                    verticalLineTo(2.75f)
                    curveTo(3.5f, 2.34f, 3.16f, 2f, 2.75f, 2f)
                    reflectiveCurveTo(2f, 2.34f, 2f, 2.75f)
                    verticalLineTo(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3.25f)
                    curveTo(6.66f, 7f, 7f, 6.66f, 7f, 6.25f)
                    reflectiveCurveTo(6.66f, 5.5f, 6.25f, 5.5f)
                    horizontalLineTo(4.09f)
                    curveToRelative(2.11f, -1.86f, 4.88f, -3f, 7.91f, -3f)
                    curveToRelative(4.42f, 0f, 7.27f, 2.19f, 8.25f, 4.1f)
                    curveTo(20.37f, 6.85f, 20.63f, 7f, 20.91f, 7f)
                    curveToRelative(0.56f, 0f, 0.93f, -0.59f, 0.67f, -1.08f)
                    curveTo(20.3f, 3.39f, 16.81f, 1f, 12f, 1f)
                    curveTo(8.78f, 1f, 5.82f, 2.13f, 3.5f, 4.02f)
                    close()
                    moveTo(5.2f, 17.43f)
                    curveToRelative(0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f)
                    lineTo(10f, 17.24f)
                    verticalLineTo(6.5f)
                    curveTo(10f, 5.67f, 10.67f, 5f, 11.5f, 5f)
                    reflectiveCurveTo(13f, 5.67f, 13f, 6.5f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(0.91f)
                    curveToRelative(0.31f, 0f, 0.62f, 0.07f, 0.89f, 0.21f)
                    lineToRelative(4.09f, 2.04f)
                    curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f)
                    lineToRelative(-0.63f, 4.46f)
                    curveTo(19.21f, 22.27f, 18.36f, 23f, 17.37f, 23f)
                    horizontalLineToRelative(-6.16f)
                    curveToRelative(-0.53f, 0f, -1.29f, -0.21f, -1.66f, -0.59f)
                    lineToRelative(-4.07f, -4.29f)
                    curveTo(5.3f, 17.94f, 5.2f, 17.69f, 5.2f, 17.43f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_left!!
    }

private var _Swipe_left: ImageVector? = null

