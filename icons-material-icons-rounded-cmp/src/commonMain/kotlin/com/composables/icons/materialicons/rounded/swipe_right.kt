package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Swipe_right: ImageVector
    get() {
        if (_Swipe_right != null) return _Swipe_right!!
        
        _Swipe_right = ImageVector.Builder(
            name = "swipe_right",
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
                    moveTo(12f, 1f)
                    curveTo(7.19f, 1f, 3.7f, 3.39f, 2.41f, 5.92f)
                    curveTo(2.16f, 6.41f, 2.53f, 7f, 3.09f, 7f)
                    curveToRelative(0.28f, 0f, 0.54f, -0.15f, 0.66f, -0.4f)
                    curveTo(4.73f, 4.69f, 7.58f, 2.5f, 12f, 2.5f)
                    curveToRelative(3.03f, 0f, 5.79f, 1.14f, 7.91f, 3f)
                    horizontalLineToRelative(-2.16f)
                    curveTo(17.34f, 5.5f, 17f, 5.84f, 17f, 6.25f)
                    reflectiveCurveTo(17.34f, 7f, 17.75f, 7f)
                    horizontalLineTo(21f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(2.75f)
                    curveTo(22f, 2.34f, 21.66f, 2f, 21.25f, 2f)
                    reflectiveCurveTo(20.5f, 2.34f, 20.5f, 2.75f)
                    verticalLineToRelative(1.27f)
                    curveTo(18.18f, 2.13f, 15.22f, 1f, 12f, 1f)
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
        
        return _Swipe_right!!
    }

private var _Swipe_right: ImageVector? = null

