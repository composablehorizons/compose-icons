package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bolt: ImageVector
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
                    horizontalLineTo(6.74f)
                    curveToRelative(0f, 0f, 3.68f, -6.46f, 6.26f, -11f)
                    horizontalLineToRelative(1f)
                    lineToRelative(-1f, 7f)
                    horizontalLineToRelative(4.28f)
                    lineTo(11f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

