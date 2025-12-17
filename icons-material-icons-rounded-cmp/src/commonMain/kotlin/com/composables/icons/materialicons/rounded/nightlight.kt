package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nightlight: ImageVector
    get() {
        if (_Nightlight != null) return _Nightlight!!
        
        _Nightlight = ImageVector.Builder(
            name = "nightlight",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                            moveTo(11.57f, 2.3f)
                            curveToRelative(2.38f, -0.59f, 4.68f, -0.27f, 6.63f, 0.64f)
                            curveToRelative(0.35f, 0.16f, 0.41f, 0.64f, 0.1f, 0.86f)
                            curveTo(15.7f, 5.6f, 14f, 8.6f, 14f, 12f)
                            reflectiveCurveToRelative(1.7f, 6.4f, 4.3f, 8.2f)
                            curveToRelative(0.32f, 0.22f, 0.26f, 0.7f, -0.09f, 0.86f)
                            curveTo(16.93f, 21.66f, 15.5f, 22f, 14f, 22f)
                            curveToRelative(-6.05f, 0f, -10.85f, -5.38f, -9.87f, -11.6f)
                            curveTo(4.74f, 6.48f, 7.72f, 3.24f, 11.57f, 2.3f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Nightlight!!
    }

private var _Nightlight: ImageVector? = null

