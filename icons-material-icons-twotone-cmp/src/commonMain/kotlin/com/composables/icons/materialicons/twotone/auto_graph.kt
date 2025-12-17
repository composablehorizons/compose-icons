package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Auto_graph: ImageVector
    get() {
        if (_Auto_graph != null) return _Auto_graph!!
        
        _Auto_graph = ImageVector.Builder(
            name = "auto_graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.06f, 9.94f)
                    lineTo(12f, 9f)
                    lineToRelative(2.06f, -0.94f)
                    lineTo(15f, 6f)
                    lineToRelative(0.94f, 2.06f)
                    lineTo(18f, 9f)
                    lineToRelative(-2.06f, 0.94f)
                    lineTo(15f, 12f)
                    lineTo(14.06f, 9.94f)
                    close()
                    moveTo(4f, 14f)
                    lineToRelative(0.94f, -2.06f)
                    lineTo(7f, 11f)
                    lineToRelative(-2.06f, -0.94f)
                    lineTo(4f, 8f)
                    lineToRelative(-0.94f, 2.06f)
                    lineTo(1f, 11f)
                    lineToRelative(2.06f, 0.94f)
                    lineTo(4f, 14f)
                    close()
                    moveTo(8.5f, 9f)
                    lineToRelative(1.09f, -2.41f)
                    lineTo(12f, 5.5f)
                    lineTo(9.59f, 4.41f)
                    lineTo(8.5f, 2f)
                    lineTo(7.41f, 4.41f)
                    lineTo(5f, 5.5f)
                    lineToRelative(2.41f, 1.09f)
                    lineTo(8.5f, 9f)
                    close()
                    moveTo(4.5f, 20.5f)
                    lineToRelative(6f, -6.01f)
                    lineToRelative(4f, 4f)
                    lineTo(23f, 8.93f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-7.09f, 7.97f)
                    lineToRelative(-4f, -4f)
                    lineTo(3f, 19f)
                    lineTo(4.5f, 20.5f)
                    close()
                }
            }
        }.build()
        
        return _Auto_graph!!
    }

private var _Auto_graph: ImageVector? = null

