package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Door_sliding: ImageVector
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
                    moveTo(10f, 13f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(16f, 11f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(21f, 19f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(11f, 5f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(5f)
                    close()
                    moveTo(18f, 5f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(5f)
                    close()
                }
            }
        }.build()
        
        return _Door_sliding!!
    }

private var _Door_sliding: ImageVector? = null

