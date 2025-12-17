package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Plumbing: ImageVector
    get() {
        if (_Plumbing != null) return _Plumbing!!
        
        _Plumbing = ImageVector.Builder(
            name = "plumbing",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.28f, 4.93f)
                        lineToRelative(-2.12f, -2.12f)
                        curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                        lineTo(11.5f, 5.64f)
                        lineToRelative(2.12f, 2.12f)
                        lineToRelative(2.12f, -2.12f)
                        lineToRelative(3.54f, 3.54f)
                        curveTo(20.45f, 8f, 20.45f, 6.1f, 19.28f, 4.93f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.49f, 13.77f)
                        curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                        lineToRelative(2.47f, -2.47f)
                        lineTo(7.96f, 9.17f)
                        lineToRelative(-2.47f, 2.47f)
                        curveTo(4.9f, 12.23f, 4.9f, 13.18f, 5.49f, 13.77f)
                        lineTo(5.49f, 13.77f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.04f, 7.76f)
                        lineToRelative(-0.71f, 0.71f)
                        lineToRelative(-0.71f, 0.71f)
                        lineToRelative(-3.18f, -3.18f)
                        curveTo(9.85f, 5.4f, 8.9f, 5.4f, 8.32f, 5.99f)
                        curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                        lineToRelative(3.18f, 3.18f)
                        lineTo(10.79f, 12f)
                        lineToRelative(-6.36f, 6.36f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                        lineTo(16.45f, 12f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(15.04f, 7.76f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Plumbing!!
    }

private var _Plumbing: ImageVector? = null

