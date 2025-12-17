package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
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
                    moveTo(11f, 21f)
                    horizontalLineToRelative(-1f)
                    lineToRelative(1f, -7f)
                    horizontalLineTo(7.5f)
                    curveToRelative(-0.88f, 0f, -0.33f, -0.75f, -0.31f, -0.78f)
                    curveTo(8.48f, 10.94f, 10.42f, 7.54f, 13.01f, 3f)
                    horizontalLineToRelative(1f)
                    lineToRelative(-1f, 7f)
                    horizontalLineToRelative(3.51f)
                    curveToRelative(0.4f, 0f, 0.62f, 0.19f, 0.4f, 0.66f)
                    curveTo(12.97f, 17.55f, 11f, 21f, 11f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

