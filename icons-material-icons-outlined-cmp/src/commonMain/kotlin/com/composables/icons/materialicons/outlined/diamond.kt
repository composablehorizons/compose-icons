package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
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
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    lineTo(2f, 9f)
                    lineToRelative(10f, 12f)
                    lineTo(22f, 9f)
                    lineTo(19f, 3f)
                    close()
                    moveTo(9.62f, 8f)
                    lineToRelative(1.5f, -3f)
                    horizontalLineToRelative(1.76f)
                    lineToRelative(1.5f, 3f)
                    horizontalLineTo(9.62f)
                    close()
                    moveTo(11f, 10f)
                    verticalLineToRelative(6.68f)
                    lineTo(5.44f, 10f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(13f, 10f)
                    horizontalLineToRelative(5.56f)
                    lineTo(13f, 16.68f)
                    verticalLineTo(10f)
                    close()
                    moveTo(19.26f, 8f)
                    horizontalLineToRelative(-2.65f)
                    lineToRelative(-1.5f, -3f)
                    horizontalLineToRelative(2.65f)
                    lineTo(19.26f, 8f)
                    close()
                    moveTo(6.24f, 5f)
                    horizontalLineToRelative(2.65f)
                    lineToRelative(-1.5f, 3f)
                    horizontalLineTo(4.74f)
                    lineTo(6.24f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

