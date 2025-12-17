package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Scatter_plot: ImageVector
    get() {
        if (_Scatter_plot != null) return _Scatter_plot!!
        
        _Scatter_plot = ImageVector.Builder(
            name = "scatter_plot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10f, 14f)
                    arcTo(3f, 3f, 0f, false, true, 7f, 17f)
                    arcTo(3f, 3f, 0f, false, true, 4f, 14f)
                    arcTo(3f, 3f, 0f, false, true, 10f, 14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 6f)
                    arcTo(3f, 3f, 0f, false, true, 11f, 9f)
                    arcTo(3f, 3f, 0f, false, true, 8f, 6f)
                    arcTo(3f, 3f, 0f, false, true, 14f, 6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.6f, 17.6f)
                    arcTo(3f, 3f, 0f, false, true, 16.6f, 20.6f)
                    arcTo(3f, 3f, 0f, false, true, 13.6f, 17.6f)
                    arcTo(3f, 3f, 0f, false, true, 19.6f, 17.6f)
                    close()
                }
            }
        }.build()
        
        return _Scatter_plot!!
    }

private var _Scatter_plot: ImageVector? = null

