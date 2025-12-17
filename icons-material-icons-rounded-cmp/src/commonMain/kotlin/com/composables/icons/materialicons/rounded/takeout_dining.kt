package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Takeout_dining: ImageVector
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
                        moveTo(21.29f, 6.75f)
                        curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0f)
                        lineTo(19f, 7.63f)
                        lineToRelative(0.03f, -0.56f)
                        lineToRelative(-3.46f, -3.48f)
                        curveTo(15.19f, 3.21f, 14.68f, 3f, 14.15f, 3f)
                        horizontalLineToRelative(-4.3f)
                        curveTo(9.32f, 3f, 8.81f, 3.21f, 8.43f, 3.59f)
                        lineTo(4.97f, 7.07f)
                        lineTo(5f, 7.57f)
                        lineTo(4.11f, 6.7f)
                        curveTo(3.72f, 6.32f, 3.1f, 6.32f, 2.72f, 6.71f)
                        lineTo(2.7f, 6.73f)
                        curveTo(2.32f, 7.12f, 2.32f, 7.75f, 2.72f, 8.13f)
                        lineTo(4.66f, 10f)
                        horizontalLineToRelative(14.69f)
                        lineToRelative(1.92f, -1.84f)
                        curveTo(21.67f, 7.78f, 21.68f, 7.14f, 21.29f, 6.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.79f, 18.15f)
                        curveTo(5.87f, 19.19f, 6.74f, 20f, 7.79f, 20f)
                        horizontalLineToRelative(8.43f)
                        curveToRelative(1.05f, 0f, 1.92f, -0.81f, 1.99f, -1.85f)
                        lineToRelative(0.49f, -6.6f)
                        horizontalLineTo(5.3f)
                        lineTo(5.79f, 18.15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

