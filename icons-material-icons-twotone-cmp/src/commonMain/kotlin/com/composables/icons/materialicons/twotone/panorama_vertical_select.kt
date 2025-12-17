package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Panorama_vertical_select: ImageVector
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
                    moveTo(18.5f, 12f)
                    curveToRelative(0f, -3.89f, 0.84f, -6.95f, 1.43f, -8.69f)
                    curveTo(20.15f, 2.67f, 19.67f, 2f, 18.98f, 2f)
                    lineTo(5f, 2f)
                    curveTo(4.32f, 2f, 3.84f, 2.66f, 4.05f, 3.31f)
                    curveTo(4.74f, 5.36f, 5.5f, 8.1f, 5.5f, 12f)
                    curveToRelative(0f, 3.87f, -0.76f, 6.66f, -1.45f, 8.69f)
                    curveTo(3.84f, 21.34f, 4.32f, 22f, 5f, 22f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.68f, 0f, 1.17f, -0.66f, 0.95f, -1.31f)
                    curveTo(19.27f, 18.66f, 18.5f, 15.86f, 18.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Panorama_vertical_select!!
    }

private var _Panorama_vertical_select: ImageVector? = null

