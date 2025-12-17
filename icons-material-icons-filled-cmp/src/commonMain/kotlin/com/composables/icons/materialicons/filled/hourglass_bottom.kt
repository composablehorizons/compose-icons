package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hourglass_bottom: ImageVector
    get() {
        if (_Hourglass_bottom != null) return _Hourglass_bottom!!
        
        _Hourglass_bottom = ImageVector.Builder(
            name = "hourglass_bottom",
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
                    moveTo(18f, 22f)
                    lineToRelative(-0.01f, -6f)
                    lineTo(14f, 12f)
                    lineToRelative(3.99f, -4.01f)
                    lineTo(18f, 2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(6f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-4f, 3.99f)
                    verticalLineTo(22f)
                    horizontalLineTo(18f)
                    close()
                    moveTo(8f, 7.5f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(3.5f)
                    lineToRelative(-4f, 4f)
                    lineTo(8f, 7.5f)
                    close()
                }
            }
        }.build()
        
        return _Hourglass_bottom!!
    }

private var _Hourglass_bottom: ImageVector? = null

