package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_cellular_0_bar: ImageVector
    get() {
        if (_Signal_cellular_0_bar != null) return _Signal_cellular_0_bar!!
        
        _Signal_cellular_0_bar = ImageVector.Builder(
            name = "signal_cellular_0_bar",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(2f, 22f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(2f)
                    lineTo(2f, 22f)
                    close()
                    moveTo(20f, 20f)
                    horizontalLineTo(6.83f)
                    lineTo(20f, 6.83f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Signal_cellular_0_bar!!
    }

private var _Signal_cellular_0_bar: ImageVector? = null

