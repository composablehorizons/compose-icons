package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Panorama_vertical_select: ImageVector
    get() {
        if (_Panorama_vertical_select != null) return _Panorama_vertical_select!!
        
        _Panorama_vertical_select = ImageVector.Builder(
            name = "panorama_vertical_select",
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
                    moveTo(18.49f, 11.99f)
                    curveToRelative(0f, -5.25f, 1.54f, -9.01f, 1.92f, -10f)
                    lineToRelative(-16.82f, 0f)
                    curveToRelative(0.76f, 2.16f, 1.9f, 5.21f, 1.9f, 10f)
                    curveToRelative(0f, 4.78f, -1.17f, 7.91f, -1.9f, 10f)
                    lineToRelative(16.81f, 0f)
                    curveTo(19.66f, 19.91f, 18.49f, 16.76f, 18.49f, 11.99f)
                    close()
                }
            }
        }.build()
        
        return _Panorama_vertical_select!!
    }

private var _Panorama_vertical_select: ImageVector? = null

