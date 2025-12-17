package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bedtime_off: ImageVector
    get() {
        if (_Bedtime_off != null) return _Bedtime_off!!
        
        _Bedtime_off = ImageVector.Builder(
            name = "bedtime_off",
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
                        moveTo(11.65f, 3.46f)
                        curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f)
                        curveTo(9.05f, 2.33f, 7.68f, 2.88f, 6.49f, 3.66f)
                        lineToRelative(4.59f, 4.59f)
                        curveTo(10.88f, 6.69f, 11.04f, 5.05f, 11.65f, 3.46f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 3.51f)
                        lineTo(2.1f, 3.51f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(1.56f, 1.56f)
                        curveToRelative(-1.4f, 2.11f, -2.02f, 4.77f, -1.46f, 7.56f)
                        curveToRelative(0.79f, 3.94f, 3.99f, 7.07f, 7.94f, 7.78f)
                        curveToRelative(2.74f, 0.49f, 5.3f, -0.15f, 7.35f, -1.51f)
                        lineToRelative(1.57f, 1.57f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedtime_off!!
    }

private var _Bedtime_off: ImageVector? = null

