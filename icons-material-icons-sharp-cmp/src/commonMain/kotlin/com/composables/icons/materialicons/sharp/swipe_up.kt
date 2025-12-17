package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Swipe_up: ImageVector
    get() {
        if (_Swipe_up != null) return _Swipe_up!!
        
        _Swipe_up = ImageVector.Builder(
            name = "swipe_up",
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
                    moveTo(2.06f, 5.56f)
                    lineTo(1f, 4.5f)
                    lineTo(4.5f, 1f)
                    lineTo(8f, 4.5f)
                    lineTo(6.94f, 5.56f)
                    lineTo(5.32f, 3.94f)
                    curveTo(5.11f, 4.76f, 5f, 5.62f, 5f, 6.5f)
                    curveToRelative(0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f)
                    lineTo(6.13f, 14f)
                    curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f)
                    curveToRelative(0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f)
                    lineTo(2.06f, 5.56f)
                    close()
                    moveTo(21.71f, 11.18f)
                    lineToRelative(2.09f, 7.39f)
                    lineToRelative(-8.23f, 3.65f)
                    lineToRelative(-6.84f, -2.85f)
                    lineToRelative(0.61f, -1.62f)
                    lineToRelative(3.8f, -0.75f)
                    lineTo(8.79f, 7.17f)
                    curveToRelative(-0.34f, -0.76f, 0f, -1.64f, 0.76f, -1.98f)
                    curveToRelative(0.76f, -0.34f, 1.64f, 0f, 1.98f, 0.76f)
                    lineToRelative(2.43f, 5.49f)
                    lineToRelative(1.26f, -0.56f)
                    lineTo(21.71f, 11.18f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_up!!
    }

private var _Swipe_up: ImageVector? = null

