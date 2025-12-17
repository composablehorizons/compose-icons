package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Panorama_horizontal_select: ImageVector
    get() {
        if (_Panorama_horizontal_select != null) return _Panorama_horizontal_select!!
        
        _Panorama_horizontal_select = ImageVector.Builder(
            name = "panorama_horizontal_select",
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
                    lineTo(2f, 20.4f)
                    curveToRelative(2.16f, -0.76f, 5.21f, -1.9f, 10f, -1.9f)
                    curveToRelative(4.78f, 0f, 7.91f, 1.17f, 10f, 1.9f)
                    lineTo(22f, 3.6f)
                    curveTo(19.91f, 4.33f, 16.77f, 5.5f, 12f, 5.5f)
                    close()
                }
            }
        }.build()
        
        return _Panorama_horizontal_select!!
    }

private var _Panorama_horizontal_select: ImageVector? = null

