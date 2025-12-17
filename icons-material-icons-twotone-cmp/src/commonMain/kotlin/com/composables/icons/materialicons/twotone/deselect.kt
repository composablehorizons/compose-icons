package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Deselect: ImageVector
    get() {
        if (_Deselect != null) return _Deselect!!
        
        _Deselect = ImageVector.Builder(
            name = "deselect",
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
                    moveTo(3f, 13f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(13f)
                    close()
                    moveTo(7f, 21f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineTo(21f)
                    close()
                    moveTo(13f, 3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    close()
                    moveTo(19f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(5f, 21f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                    close()
                    moveTo(3f, 17f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(17f)
                    close()
                    moveTo(11f, 21f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(21f)
                    close()
                    moveTo(19f, 13f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(19f, 9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(15f, 5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(5f)
                    close()
                    moveTo(7.83f, 5f)
                    lineTo(7f, 4.17f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7.83f)
                    close()
                    moveTo(19.83f, 17f)
                    lineTo(19f, 16.17f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(19.83f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(4.17f, 7f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7.83f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(7.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1.17f)
                    lineToRelative(2.78f, 2.78f)
                    lineTo(21.19f, 21.19f)
                    close()
                    moveTo(9f, 15f)
                    verticalLineToRelative(-3.17f)
                    lineTo(12.17f, 15f)
                    horizontalLineTo(9f)
                    close()
                    moveTo(15f, 12.17f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-3.17f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(7.17f)
                    lineTo(15f, 12.17f)
                    close()
                }
            }
        }.build()
        
        return _Deselect!!
    }

private var _Deselect: ImageVector? = null

