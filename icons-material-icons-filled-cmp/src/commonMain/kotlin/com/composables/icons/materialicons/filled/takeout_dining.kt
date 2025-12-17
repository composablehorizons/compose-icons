package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Takeout_dining: ImageVector
    get() {
        if (_Takeout_dining != null) return _Takeout_dining!!
        
        _Takeout_dining = ImageVector.Builder(
            name = "takeout_dining",
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
                    moveTo(5.26f, 11f)
                    horizontalLineToRelative(13.48f)
                    lineToRelative(-0.67f, 9f)
                    horizontalLineTo(5.93f)
                    lineTo(5.26f, 11f)
                    close()
                    moveTo(9.02f, 4f)
                    horizontalLineToRelative(5.95f)
                    lineTo(19f, 7.38f)
                    lineToRelative(1.59f, -1.59f)
                    lineTo(22f, 7.21f)
                    lineTo(19.21f, 10f)
                    horizontalLineTo(4.79f)
                    lineTo(2f, 7.21f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(5f, 7.38f)
                    lineTo(9.02f, 4f)
                    close()
                }
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

