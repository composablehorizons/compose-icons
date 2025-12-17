package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Polyline: ImageVector
    get() {
        if (_Polyline != null) return _Polyline!!
        
        _Polyline = ImageVector.Builder(
            name = "polyline",
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
                    moveTo(15f, 16f)
                    lineTo(15f, 17.26f)
                    lineTo(9f, 14.26f)
                    lineTo(9f, 11.09f)
                    lineTo(11.7f, 8f)
                    lineTo(16f, 8f)
                    lineTo(16f, 2f)
                    lineTo(10f, 2f)
                    lineTo(10f, 6.9f)
                    lineTo(7.3f, 10f)
                    lineTo(3f, 10f)
                    lineTo(3f, 16f)
                    lineTo(8f, 16f)
                    lineTo(15f, 19.5f)
                    lineTo(15f, 22f)
                    lineTo(21f, 22f)
                    lineTo(21f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Polyline!!
    }

private var _Polyline: ImageVector? = null

