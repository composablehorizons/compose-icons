package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) return _Hexagon!!
        
        _Hexagon = ImageVector.Builder(
            name = "hexagon",
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
                    moveTo(17.2f, 3f)
                    horizontalLineTo(6.8f)
                    lineToRelative(-5.2f, 9f)
                    lineToRelative(5.2f, 9f)
                    horizontalLineToRelative(10.4f)
                    lineToRelative(5.2f, -9f)
                    lineTo(17.2f, 3f)
                    close()
                    moveTo(16.05f, 19f)
                    horizontalLineTo(7.95f)
                    lineToRelative(-4.04f, -7f)
                    lineToRelative(4.04f, -7f)
                    horizontalLineToRelative(8.09f)
                    lineToRelative(4.04f, 7f)
                    lineTo(16.05f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

