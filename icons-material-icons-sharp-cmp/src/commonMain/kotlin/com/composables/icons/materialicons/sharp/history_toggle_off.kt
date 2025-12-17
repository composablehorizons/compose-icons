package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.History_toggle_off: ImageVector
    get() {
        if (_History_toggle_off != null) return _History_toggle_off!!
        
        _History_toggle_off = ImageVector.Builder(
            name = "history_toggle_off",
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
                    moveTo(15.1f, 19.37f)
                    lineToRelative(1f, 1.74f)
                    curveToRelative(-0.96f, 0.44f, -2.01f, 0.73f, -3.1f, 0.84f)
                    verticalLineToRelative(-2.02f)
                    curveTo(13.74f, 19.84f, 14.44f, 19.65f, 15.1f, 19.37f)
                    close()
                    moveTo(4.07f, 13f)
                    horizontalLineTo(2.05f)
                    curveToRelative(0.11f, 1.1f, 0.4f, 2.14f, 0.84f, 3.1f)
                    lineToRelative(1.74f, -1f)
                    curveTo(4.35f, 14.44f, 4.16f, 13.74f, 4.07f, 13f)
                    close()
                    moveTo(15.1f, 4.63f)
                    lineToRelative(1f, -1.74f)
                    curveTo(15.14f, 2.45f, 14.1f, 2.16f, 13f, 2.05f)
                    verticalLineToRelative(2.02f)
                    curveTo(13.74f, 4.16f, 14.44f, 4.35f, 15.1f, 4.63f)
                    close()
                    moveTo(19.93f, 11f)
                    horizontalLineToRelative(2.02f)
                    curveToRelative(-0.11f, -1.1f, -0.4f, -2.14f, -0.84f, -3.1f)
                    lineToRelative(-1.74f, 1f)
                    curveTo(19.65f, 9.56f, 19.84f, 10.26f, 19.93f, 11f)
                    close()
                    moveTo(8.9f, 19.37f)
                    lineToRelative(-1f, 1.74f)
                    curveToRelative(0.96f, 0.44f, 2.01f, 0.73f, 3.1f, 0.84f)
                    verticalLineToRelative(-2.02f)
                    curveTo(10.26f, 19.84f, 9.56f, 19.65f, 8.9f, 19.37f)
                    close()
                    moveTo(11f, 4.07f)
                    verticalLineTo(2.05f)
                    curveToRelative(-1.1f, 0.11f, -2.14f, 0.4f, -3.1f, 0.84f)
                    lineToRelative(1f, 1.74f)
                    curveTo(9.56f, 4.35f, 10.26f, 4.16f, 11f, 4.07f)
                    close()
                    moveTo(18.36f, 7.17f)
                    lineToRelative(1.74f, -1.01f)
                    curveToRelative(-0.63f, -0.87f, -1.4f, -1.64f, -2.27f, -2.27f)
                    lineToRelative(-1.01f, 1.74f)
                    curveTo(17.41f, 6.08f, 17.92f, 6.59f, 18.36f, 7.17f)
                    close()
                    moveTo(4.63f, 8.9f)
                    lineToRelative(-1.74f, -1f)
                    curveTo(2.45f, 8.86f, 2.16f, 9.9f, 2.05f, 11f)
                    horizontalLineToRelative(2.02f)
                    curveTo(4.16f, 10.26f, 4.35f, 9.56f, 4.63f, 8.9f)
                    close()
                    moveTo(19.93f, 13f)
                    curveToRelative(-0.09f, 0.74f, -0.28f, 1.44f, -0.56f, 2.1f)
                    lineToRelative(1.74f, 1f)
                    curveToRelative(0.44f, -0.96f, 0.73f, -2.01f, 0.84f, -3.1f)
                    horizontalLineTo(19.93f)
                    close()
                    moveTo(16.83f, 18.36f)
                    lineToRelative(1.01f, 1.74f)
                    curveToRelative(0.87f, -0.63f, 1.64f, -1.4f, 2.27f, -2.27f)
                    lineToRelative(-1.74f, -1.01f)
                    curveTo(17.92f, 17.41f, 17.41f, 17.92f, 16.83f, 18.36f)
                    close()
                    moveTo(7.17f, 5.64f)
                    lineTo(6.17f, 3.89f)
                    curveTo(5.29f, 4.53f, 4.53f, 5.29f, 3.9f, 6.17f)
                    lineToRelative(1.74f, 1.01f)
                    curveTo(6.08f, 6.59f, 6.59f, 6.08f, 7.17f, 5.64f)
                    close()
                    moveTo(5.64f, 16.83f)
                    lineTo(3.9f, 17.83f)
                    curveToRelative(0.63f, 0.87f, 1.4f, 1.64f, 2.27f, 2.27f)
                    lineToRelative(1.01f, -1.74f)
                    curveTo(6.59f, 17.92f, 6.08f, 17.41f, 5.64f, 16.83f)
                    close()
                    moveTo(13f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(5.41f)
                    lineToRelative(4.29f, 4.29f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(13f, 11.59f)
                    verticalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _History_toggle_off!!
    }

private var _History_toggle_off: ImageVector? = null

