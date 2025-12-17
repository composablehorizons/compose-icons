package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_timeline: ImageVector
    get() {
        if (_View_timeline != null) return _View_timeline!!
        
        _View_timeline = ImageVector.Builder(
            name = "view_timeline",
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
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(12f, 17f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(17f)
                    close()
                    moveTo(15f, 13f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(13f)
                    close()
                    moveTo(18f, 9f)
                    horizontalLineToRelative(-6f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _View_timeline!!
    }

private var _View_timeline: ImageVector? = null

