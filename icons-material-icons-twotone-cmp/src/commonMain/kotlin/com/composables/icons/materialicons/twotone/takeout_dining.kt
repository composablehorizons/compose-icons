package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Takeout_dining: ImageVector
    get() {
        if (_Takeout_dining != null) return _Takeout_dining!!
        
        _Takeout_dining = ImageVector.Builder(
            name = "takeout_dining",
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
                        moveTo(9.83f, 5f)
                        lineTo(7.03f, 7.73f)
                        lineTo(7.12f, 9f)
                        lineTo(16.87f, 9f)
                        lineTo(16.96f, 7.73f)
                        lineTo(14.16f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.79f, 18f)
                        lineTo(16.23f, 18f)
                        lineTo(16.74f, 11f)
                        lineTo(7.28f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.59f, 6.05f)
                        lineTo(19f, 7.63f)
                        lineToRelative(0.03f, -0.56f)
                        lineTo(14.98f, 3f)
                        horizontalLineTo(9.02f)
                        lineTo(4.97f, 7.07f)
                        lineTo(5f, 7.57f)
                        lineTo(3.41f, 6.01f)
                        lineTo(2f, 7.44f)
                        lineToRelative(3.23f, 3.11f)
                        lineTo(5.93f, 20f)
                        horizontalLineToRelative(12.14f)
                        lineToRelative(0.7f, -9.44f)
                        lineTo(22f, 7.46f)
                        lineTo(20.59f, 6.05f)
                        close()
                        moveTo(16.23f, 18f)
                        horizontalLineTo(7.79f)
                        lineToRelative(-0.51f, -7f)
                        horizontalLineToRelative(9.46f)
                        lineTo(16.23f, 18f)
                        close()
                        moveTo(16.87f, 9f)
                        horizontalLineTo(7.12f)
                        lineTo(7.03f, 7.73f)
                        lineTo(9.83f, 5f)
                        horizontalLineToRelative(4.33f)
                        lineToRelative(2.8f, 2.73f)
                        lineTo(16.87f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

