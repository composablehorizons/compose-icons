package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Battery_5_bar: ImageVector
    get() {
        if (_Battery_5_bar != null) return _Battery_5_bar!!
        
        _Battery_5_bar = ImageVector.Builder(
            name = "battery_5_bar",
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
                    moveTo(17f, 4f)
                    verticalLineToRelative(18f)
                    horizontalLineTo(7f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(15f, 6f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(6f)
                    close()
                }
            }
        }.build()
        
        return _Battery_5_bar!!
    }

private var _Battery_5_bar: ImageVector? = null

