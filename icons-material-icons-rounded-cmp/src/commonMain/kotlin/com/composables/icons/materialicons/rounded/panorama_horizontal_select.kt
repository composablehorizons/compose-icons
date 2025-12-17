package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Panorama_horizontal_select: ImageVector
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
                    curveToRelative(-3.89f, 0f, -6.95f, -0.84f, -8.69f, -1.43f)
                    curveTo(2.67f, 3.85f, 2f, 4.33f, 2f, 5.02f)
                    lineTo(2f, 19f)
                    curveToRelative(0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f)
                    curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12f, 18.5f)
                    curveToRelative(3.87f, 0f, 6.66f, 0.76f, 8.69f, 1.45f)
                    curveTo(21.34f, 20.16f, 22f, 19.68f, 22f, 19f)
                    lineToRelative(0f, -14f)
                    curveToRelative(0f, -0.68f, -0.66f, -1.17f, -1.31f, -0.95f)
                    curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12f, 5.5f)
                    close()
                }
            }
        }.build()
        
        return _Panorama_horizontal_select!!
    }

private var _Panorama_horizontal_select: ImageVector? = null

