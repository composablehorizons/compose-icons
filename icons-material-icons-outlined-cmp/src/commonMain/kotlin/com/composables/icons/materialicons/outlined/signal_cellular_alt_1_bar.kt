package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Signal_cellular_alt_1_bar: ImageVector
    get() {
        if (_Signal_cellular_alt_1_bar != null) return _Signal_cellular_alt_1_bar!!
        
        _Signal_cellular_alt_1_bar = ImageVector.Builder(
            name = "signal_cellular_alt_1_bar",
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
                    moveTo(5f, 14f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(5f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Signal_cellular_alt_1_bar!!
    }

private var _Signal_cellular_alt_1_bar: ImageVector? = null

