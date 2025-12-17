package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bedtime_off: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.27f, 4.49f)
                        curveTo(9.14f, 5.08f, 9.07f, 5.64f, 9.03f, 6.2f)
                        lineToRelative(2.05f, 2.05f)
                        curveToRelative(-0.27f, -2.05f, 0.1f, -4.22f, 1.26f, -6.23f)
                        curveToRelative(-0.12f, 0f, -0.23f, -0.01f, -0.35f, -0.01f)
                        curveToRelative(-2.05f, 0f, -3.93f, 0.61f, -5.5f, 1.65f)
                        lineToRelative(1.46f, 1.46f)
                        curveTo(8.37f, 4.88f, 8.81f, 4.66f, 9.27f, 4.49f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.39f, 4.22f)
                        lineToRelative(2.27f, 2.27f)
                        curveTo(2.61f, 8.07f, 2f, 9.97f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(2.04f, 0f, 3.92f, -0.63f, 5.5f, -1.67f)
                        lineToRelative(2.28f, 2.28f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        close()
                        moveTo(5.13f, 7.96f)
                        lineToRelative(10.92f, 10.92f)
                        curveTo(14.84f, 19.6f, 13.45f, 20f, 12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveTo(4f, 10.52f, 4.42f, 9.15f, 5.13f, 7.96f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedtime_off!!
    }

private var _Bedtime_off: ImageVector? = null

