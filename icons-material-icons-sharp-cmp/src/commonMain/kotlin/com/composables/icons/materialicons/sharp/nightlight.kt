package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Nightlight: ImageVector
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
                            moveTo(14f, 2f)
                            curveToRelative(1.82f, 0f, 3.53f, 0.5f, 5f, 1.35f)
                            curveTo(16.01f, 5.08f, 14f, 8.3f, 14f, 12f)
                            reflectiveCurveToRelative(2.01f, 6.92f, 5f, 8.65f)
                            curveTo(17.53f, 21.5f, 15.82f, 22f, 14f, 22f)
                            curveTo(8.48f, 22f, 4f, 17.52f, 4f, 12f)
                            reflectiveCurveTo(8.48f, 2f, 14f, 2f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Nightlight!!
    }

private var _Nightlight: ImageVector? = null

