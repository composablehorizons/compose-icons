package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Smart_display: ImageVector
    get() {
        if (_Smart_display != null) return _Smart_display!!
        
        _Smart_display = ImageVector.Builder(
            name = "smart_display",
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
                    moveTo(22f, 4f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(9.5f, 16.5f)
                    verticalLineToRelative(-9f)
                    lineToRelative(7f, 4.5f)
                    lineTo(9.5f, 16.5f)
                    close()
                }
            }
        }.build()
        
        return _Smart_display!!
    }

private var _Smart_display: ImageVector? = null

