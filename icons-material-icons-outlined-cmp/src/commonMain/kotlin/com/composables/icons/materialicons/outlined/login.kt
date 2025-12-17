package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Login: ImageVector
    get() {
        if (_Login != null) return _Login!!
        
        _Login = ImageVector.Builder(
            name = "login",
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
                    moveTo(11f, 7f)
                    lineTo(9.6f, 8.4f)
                    lineToRelative(2.6f, 2.6f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(10.2f)
                    lineToRelative(-2.6f, 2.6f)
                    lineTo(11f, 17f)
                    lineToRelative(5f, -5f)
                    lineTo(11f, 7f)
                    close()
                    moveTo(20f, 19f)
                    horizontalLineToRelative(-8f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-8f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Login!!
    }

private var _Login: ImageVector? = null

