package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Logout: ImageVector
    get() {
        if (_Logout != null) return _Logout!!
        
        _Logout = ImageVector.Builder(
            name = "logout",
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
                    moveTo(17f, 8f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(17.17f, 11f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(8.17f)
                    lineToRelative(-1.58f, 1.58f)
                    lineTo(17f, 16f)
                    lineToRelative(4f, -4f)
                    lineTo(17f, 8f)
                    close()
                    moveTo(5f, 5f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    close()
                }
            }
        }.build()
        
        return _Logout!!
    }

private var _Logout: ImageVector? = null

