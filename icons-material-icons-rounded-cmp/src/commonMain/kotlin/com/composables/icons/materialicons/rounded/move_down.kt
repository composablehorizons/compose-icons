package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Move_down: ImageVector
    get() {
        if (_Move_down != null) return _Move_down!!
        
        _Move_down = ImageVector.Builder(
            name = "move_down",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.01f, 10.72f)
                        curveToRelative(-0.14f, 2.57f, 1.66f, 4.73f, 4.07f, 5.18f)
                        lineToRelative(-0.79f, -0.79f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(2.59f, 2.59f)
                        curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                        lineTo(7.71f, 20.3f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0.88f, -0.88f)
                        lineToRelative(0f, -0.06f)
                        curveToRelative(-3.64f, -0.43f, -6.43f, -3.65f, -6.15f, -7.47f)
                        curveTo(1.29f, 6.78f, 4.55f, 4f, 8.26f, 4f)
                        lineTo(10f, 4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        lineTo(8.22f, 6f)
                        curveTo(5.52f, 6f, 3.15f, 8.04f, 3.01f, 10.72f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 11f)
                        horizontalLineToRelative(5f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-5f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(3f)
                        curveTo(13f, 10.1f, 13.9f, 11f, 15f, 11f)
                        close()
                        moveTo(20f, 9f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 20f)
                        horizontalLineToRelative(-5f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(5f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(3f)
                        curveTo(22f, 19.1f, 21.1f, 20f, 20f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Move_down!!
    }

private var _Move_down: ImageVector? = null

