package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Height: ImageVector
    get() {
        if (_Height != null) return _Height!!
        
        _Height = ImageVector.Builder(
            name = "height",
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
                group {
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 6.99f)
                    lineTo(16f, 6.99f)
                    lineTo(12f, 3f)
                    lineTo(8f, 6.99f)
                    lineTo(11f, 6.99f)
                    lineTo(11f, 17.01f)
                    lineTo(8f, 17.01f)
                    lineTo(12f, 21f)
                    lineTo(16f, 17.01f)
                    lineTo(13f, 17.01f)
                    close()
                }
            }
        }.build()
        
        return _Height!!
    }

private var _Height: ImageVector? = null

