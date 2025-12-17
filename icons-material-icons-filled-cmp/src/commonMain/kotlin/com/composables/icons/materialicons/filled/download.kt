package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Download: ImageVector
    get() {
        if (_Download != null) return _Download!!
        
        _Download = ImageVector.Builder(
            name = "download",
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
                    moveTo(5f, 20f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(5f)
                    verticalLineTo(20f)
                    close()
                    moveTo(19f, 9f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(3f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(5f)
                    lineToRelative(7f, 7f)
                    lineTo(19f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Download!!
    }

private var _Download: ImageVector? = null

