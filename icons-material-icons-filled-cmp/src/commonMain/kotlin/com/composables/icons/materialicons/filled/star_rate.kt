package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Star_rate: ImageVector
    get() {
        if (_Star_rate != null) return _Star_rate!!
        
        _Star_rate = ImageVector.Builder(
            name = "star_rate",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.43f, 10f)
                    lineTo(12f, 2f)
                    lineTo(9.57f, 10f)
                    lineTo(2f, 10f)
                    lineTo(8.18f, 14.41f)
                    lineTo(5.83f, 22f)
                    lineTo(12f, 17.31f)
                    lineTo(18.18f, 22f)
                    lineTo(15.83f, 14.41f)
                    lineTo(22f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Star_rate!!
    }

private var _Star_rate: ImageVector? = null

