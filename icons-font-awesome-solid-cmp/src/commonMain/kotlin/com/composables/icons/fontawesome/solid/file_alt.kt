package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileAlt: ImageVector
    get() {
        if (_FileAlt != null) return _FileAlt!!
        
        _FileAlt = ImageVector.Builder(
            name = "file-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(64f, 236f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(108f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(168f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(0f, -64f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(108f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(168f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(0f, -72f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(108f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(168f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
                moveToRelative(96f, -114.1f)
                verticalLineToRelative(6.1f)
                horizontalLineTo(256f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0f, 12.5f, 2.5f, 17f, 7f)
                lineToRelative(97.9f, 98f)
                curveToRelative(4.5f, 4.5f, 7f, 10.6f, 7f, 16.9f)
                close()
            }
        }.build()
        
        return _FileAlt!!
    }

private var _FileAlt: ImageVector? = null

