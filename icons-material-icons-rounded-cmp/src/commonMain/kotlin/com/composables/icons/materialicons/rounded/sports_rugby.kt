package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports_rugby: ImageVector
    get() {
        if (_Sports_rugby != null) return _Sports_rugby!!
        
        _Sports_rugby = ImageVector.Builder(
            name = "sports_rugby",
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
                        moveTo(20.49f, 3.51f)
                        curveToRelative(-0.56f, -0.56f, -2.15f, -0.97f, -4.16f, -0.97f)
                        curveToRelative(-3.08f, 0f, -7.15f, 0.96f, -9.98f, 3.79f)
                        curveTo(1.66f, 11.03f, 2.1f, 19.07f, 3.51f, 20.49f)
                        curveToRelative(0.56f, 0.56f, 2.15f, 0.97f, 4.16f, 0.97f)
                        curveToRelative(3.08f, 0f, 7.15f, -0.96f, 9.98f, -3.79f)
                        curveTo(22.34f, 12.97f, 21.9f, 4.93f, 20.49f, 3.51f)
                        close()
                        moveTo(7.76f, 7.76f)
                        curveToRelative(2.64f, -2.64f, 6.35f, -3.12f, 8.03f, -3.19f)
                        curveToRelative(-2.05f, 0.94f, -4.46f, 2.45f, -6.61f, 4.61f)
                        curveToRelative(-2.16f, 2.16f, -3.67f, 4.58f, -4.61f, 6.63f)
                        curveTo(4.66f, 13.33f, 5.44f, 10.07f, 7.76f, 7.76f)
                        close()
                        moveTo(16.24f, 16.24f)
                        curveToRelative(-2.64f, 2.64f, -6.35f, 3.12f, -8.03f, 3.19f)
                        curveToRelative(2.05f, -0.94f, 4.46f, -2.45f, 6.61f, -4.61f)
                        curveToRelative(2.16f, -2.16f, 3.67f, -4.58f, 4.62f, -6.63f)
                        curveTo(19.34f, 10.67f, 18.56f, 13.93f, 16.24f, 16.24f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_rugby!!
    }

private var _Sports_rugby: ImageVector? = null

