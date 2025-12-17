package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Network_cell: ImageVector
    get() {
        if (_Network_cell != null) return _Network_cell!!
        
        _Network_cell = ImageVector.Builder(
            name = "network_cell",
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
                    horizontalLineToRelative(-3f)
                    verticalLineTo(9.83f)
                    lineToRelative(3f, -3f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Network_cell!!
    }

private var _Network_cell: ImageVector? = null

