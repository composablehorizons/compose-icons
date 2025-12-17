package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bedtime_off: ImageVector
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.19f, 21.19f)
                            lineTo(2.81f, 2.81f)
                            lineTo(1.39f, 4.22f)
                            lineToRelative(2.27f, 2.27f)
                            curveTo(2.61f, 8.08f, 2f, 9.97f, 2f, 12f)
                            curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                            curveToRelative(2.04f, 0f, 3.93f, -0.62f, 5.51f, -1.66f)
                            lineToRelative(2.27f, 2.27f)
                            lineTo(21.19f, 21.19f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12.34f, 2.02f)
                            curveToRelative(-2.18f, -0.07f, -4.19f, 0.55f, -5.85f, 1.64f)
                            lineToRelative(4.59f, 4.59f)
                            curveTo(10.81f, 6.2f, 11.18f, 4.03f, 12.34f, 2.02f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Bedtime_off!!
    }

private var _Bedtime_off: ImageVector? = null

