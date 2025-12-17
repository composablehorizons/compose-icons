package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Swipe_right: ImageVector
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
                    moveTo(19.98f, 16.82f)
                    lineToRelative(-0.63f, 4.46f)
                    curveTo(19.21f, 22.27f, 18.36f, 23f, 17.37f, 23f)
                    horizontalLineToRelative(-6.16f)
                    curveToRelative(-0.53f, 0f, -1.29f, -0.21f, -1.66f, -0.59f)
                    lineTo(5f, 17.62f)
                    lineToRelative(0.83f, -0.84f)
                    curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f)
                    lineTo(10f, 17.24f)
                    verticalLineTo(6.5f)
                    curveTo(10f, 5.67f, 10.67f, 5f, 11.5f, 5f)
                    reflectiveCurveTo(13f, 5.67f, 13f, 6.5f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(0.91f)
                    curveToRelative(0.31f, 0f, 0.62f, 0.07f, 0.89f, 0.21f)
                    lineToRelative(4.09f, 2.04f)
                    curveTo(19.66f, 15.14f, 20.1f, 15.97f, 19.98f, 16.82f)
                    close()
                    moveTo(19.91f, 5.5f)
                    horizontalLineTo(17f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(2.02f)
                    curveTo(18.18f, 2.13f, 15.22f, 1f, 12f, 1f)
                    curveTo(6.51f, 1f, 2.73f, 4.12f, 2f, 7f)
                    horizontalLineToRelative(1.57f)
                    curveTo(4.33f, 5.02f, 7.26f, 2.5f, 12f, 2.5f)
                    curveTo(15.03f, 2.5f, 17.79f, 3.64f, 19.91f, 5.5f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_right!!
    }

private var _Swipe_right: ImageVector? = null

