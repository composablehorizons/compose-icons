package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Door_sliding: ImageVector
    get() {
        if (_Door_sliding != null) return _Door_sliding!!
        
        _Door_sliding = ImageVector.Builder(
            name = "door_sliding",
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
                    moveTo(20f, 19f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-7.25f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(3f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(18f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(10f, 13f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(16f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Door_sliding!!
    }

private var _Door_sliding: ImageVector? = null

