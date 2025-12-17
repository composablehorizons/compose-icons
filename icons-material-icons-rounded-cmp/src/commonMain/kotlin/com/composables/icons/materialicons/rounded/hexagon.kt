package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hexagon: ImageVector
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
                    moveTo(16.05f, 3f)
                    horizontalLineTo(7.95f)
                    curveTo(7.24f, 3f, 6.58f, 3.38f, 6.22f, 4f)
                    lineToRelative(-4.04f, 7f)
                    curveToRelative(-0.36f, 0.62f, -0.36f, 1.38f, 0f, 2f)
                    lineToRelative(4.04f, 7f)
                    curveToRelative(0.36f, 0.62f, 1.02f, 1f, 1.73f, 1f)
                    horizontalLineToRelative(8.09f)
                    curveToRelative(0.71f, 0f, 1.37f, -0.38f, 1.73f, -1f)
                    lineToRelative(4.04f, -7f)
                    curveToRelative(0.36f, -0.62f, 0.36f, -1.38f, 0f, -2f)
                    lineToRelative(-4.04f, -7f)
                    curveTo(17.42f, 3.38f, 16.76f, 3f, 16.05f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

