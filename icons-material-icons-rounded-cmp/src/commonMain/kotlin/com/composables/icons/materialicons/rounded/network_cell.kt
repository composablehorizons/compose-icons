package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Network_cell: ImageVector
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
                    moveTo(4.41f, 22f)
                    horizontalLineTo(21f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(4.41f)
                    curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                    lineTo(3.71f, 20.29f)
                    curveTo(3.08f, 20.92f, 3.52f, 22f, 4.41f, 22f)
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

