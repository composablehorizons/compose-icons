package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Window: ImageVector
    get() {
        if (_Window != null) return _Window!!
        
        _Window = ImageVector.Builder(
            name = "window",
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
                    moveTo(22f, 2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(2f)
                    close()
                    moveTo(20f, 11f)
                    horizontalLineToRelative(-7f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(11f)
                    close()
                    moveTo(11f, 4f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(4f, 13f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    verticalLineTo(13f)
                    close()
                    moveTo(13f, 20f)
                    verticalLineToRelative(-7f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Window!!
    }

private var _Window: ImageVector? = null

