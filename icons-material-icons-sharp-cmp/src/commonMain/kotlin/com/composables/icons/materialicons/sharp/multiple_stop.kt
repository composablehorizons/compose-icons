package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Multiple_stop: ImageVector
    get() {
        if (_Multiple_stop != null) return _Multiple_stop!!
        
        _Multiple_stop = ImageVector.Builder(
            name = "multiple_stop",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(4f)
                    close()
                    moveTo(7f, 17f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-3f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(4f, 4f)
                    verticalLineTo(17f)
                    close()
                    moveTo(19f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(15f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(11f, 7f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(7f, 7f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Multiple_stop!!
    }

private var _Multiple_stop: ImageVector? = null

