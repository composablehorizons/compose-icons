package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Grid_3x3: ImageVector
    get() {
        if (_Grid_3x3 != null) return _Grid_3x3!!
        
        _Grid_3x3 = ImageVector.Builder(
            name = "grid_3x3",
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
                    moveTo(20f, 10f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(4f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(14f, 14f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Grid_3x3!!
    }

private var _Grid_3x3: ImageVector? = null

