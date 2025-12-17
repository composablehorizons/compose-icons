package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Calculate: ImageVector
    get() {
        if (_Calculate != null) return _Calculate!!
        
        _Calculate = ImageVector.Builder(
            name = "calculate",
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
                    moveTo(13.03f, 7.06f)
                    lineTo(14.09f, 6f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(16.91f, 6f)
                    lineToRelative(1.06f, 1.06f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(-1.06f, 1.06f)
                    lineTo(15.5f, 9.54f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(-1.06f, -1.06f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(13.03f, 7.06f)
                    close()
                    moveTo(6.25f, 7.72f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(7.72f)
                    close()
                    moveTo(11.5f, 16f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(18f, 17.25f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(17.25f)
                    close()
                    moveTo(18f, 14.75f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(14.75f)
                    close()
                }
            }
        }.build()
        
        return _Calculate!!
    }

private var _Calculate: ImageVector? = null

