package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
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
                    moveTo(22f, 3f)
                    lineToRelative(-1.67f, 1.67f)
                    lineTo(18.67f, 3f)
                    lineTo(17f, 4.67f)
                    lineTo(15.33f, 3f)
                    lineToRelative(-1.66f, 1.67f)
                    lineTo(12f, 3f)
                    lineToRelative(-1.67f, 1.67f)
                    lineTo(8.67f, 3f)
                    lineTo(7f, 4.67f)
                    lineTo(5.33f, 3f)
                    lineTo(3.67f, 4.67f)
                    lineTo(2f, 3f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    lineToRelative(16f, 0f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    close()
                    moveTo(11f, 19f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(19f)
                    close()
                    moveTo(20f, 19f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(19f)
                    close()
                    moveTo(20f, 15f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(15f)
                    close()
                    moveTo(20f, 11f)
                    horizontalLineTo(4f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

