package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Vrpano: ImageVector
    get() {
        if (_Vrpano != null) return _Vrpano!!
        
        _Vrpano = ImageVector.Builder(
            name = "vrpano",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 5.5f)
                    curveToRelative(-5.25f, 0f, -9.01f, -1.54f, -10f, -1.92f)
                    verticalLineTo(20.4f)
                    curveToRelative(2.16f, -0.76f, 5.21f, -1.9f, 10f, -1.9f)
                    curveToRelative(4.78f, 0f, 7.91f, 1.17f, 10f, 1.9f)
                    verticalLineTo(3.6f)
                    curveTo(19.91f, 4.33f, 16.77f, 5.5f, 12f, 5.5f)
                    close()
                    moveTo(12f, 15f)
                    curveToRelative(-2.34f, 0f, -4.52f, 0.15f, -6.52f, 0.41f)
                    lineToRelative(3.69f, -4.42f)
                    lineToRelative(2f, 2.4f)
                    lineTo(14f, 10f)
                    lineToRelative(4.51f, 5.4f)
                    curveTo(16.52f, 15.15f, 14.3f, 15f, 12f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null

