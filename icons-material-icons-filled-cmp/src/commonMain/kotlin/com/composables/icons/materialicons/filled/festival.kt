package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Festival: ImageVector
    get() {
        if (_Festival != null) return _Festival!!
        
        _Festival = ImageVector.Builder(
            name = "festival",
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
                    moveTo(13f, 5.7f)
                    lineTo(13f, 4f)
                    lineTo(16f, 4f)
                    lineTo(15f, 2.51f)
                    lineTo(16f, 1f)
                    lineTo(11f, 1f)
                    lineTo(11f, 5.7f)
                    lineTo(2f, 12f)
                    lineTo(2f, 22f)
                    lineTo(9f, 22f)
                    lineTo(9f, 17f)
                    lineTo(12.03f, 15f)
                    lineTo(15f, 17f)
                    lineTo(15f, 22f)
                    lineTo(22f, 22f)
                    lineTo(22f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Festival!!
    }

private var _Festival: ImageVector? = null

