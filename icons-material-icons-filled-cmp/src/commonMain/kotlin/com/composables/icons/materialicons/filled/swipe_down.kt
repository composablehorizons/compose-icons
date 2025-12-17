package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Swipe_down: ImageVector
    get() {
        if (_Swipe_down != null) return _Swipe_down!!
        
        _Swipe_down = ImageVector.Builder(
            name = "swipe_down",
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
                    moveTo(3.8f, 12.18f)
                    curveToRelative(-0.2f, -0.86f, -0.3f, -1.76f, -0.3f, -2.68f)
                    curveToRelative(0f, -2.84f, 0.99f, -5.45f, 2.63f, -7.5f)
                    lineTo(7.2f, 3.07f)
                    curveTo(5.82f, 4.85f, 5f, 7.08f, 5f, 9.5f)
                    curveToRelative(0f, 0.88f, 0.11f, 1.74f, 0.32f, 2.56f)
                    lineToRelative(1.62f, -1.62f)
                    lineTo(8f, 11.5f)
                    lineTo(4.5f, 15f)
                    lineTo(1f, 11.5f)
                    lineToRelative(1.06f, -1.06f)
                    lineTo(3.8f, 12.18f)
                    close()
                    moveTo(13.85f, 11.62f)
                    lineToRelative(-2.68f, -5.37f)
                    curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f)
                    curveTo(8.41f, 5.96f, 8.11f, 6.86f, 8.48f, 7.6f)
                    lineToRelative(4.81f, 9.6f)
                    lineTo(10.05f, 18f)
                    curveToRelative(-0.33f, 0.09f, -0.59f, 0.33f, -0.7f, 0.66f)
                    lineTo(9f, 19.78f)
                    lineToRelative(6.19f, 2.25f)
                    curveToRelative(0.5f, 0.17f, 1.28f, 0.02f, 1.75f, -0.22f)
                    lineToRelative(5.51f, -2.75f)
                    curveToRelative(0.89f, -0.45f, 1.32f, -1.48f, 1f, -2.42f)
                    lineToRelative(-1.43f, -4.27f)
                    curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                    horizontalLineToRelative(-4.56f)
                    curveToRelative(-0.31f, 0f, -0.62f, 0.07f, -0.89f, 0.21f)
                    lineTo(13.85f, 11.62f)
                }
            }
        }.build()
        
        return _Swipe_down!!
    }

private var _Swipe_down: ImageVector? = null

