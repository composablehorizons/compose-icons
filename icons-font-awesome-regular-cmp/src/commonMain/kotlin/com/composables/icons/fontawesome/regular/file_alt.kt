package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileAlt: ImageVector
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
                moveTo(288f, 248f)
                verticalLineToRelative(28f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(108f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-28f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(168f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
                moveToRelative(-12f, 72f)
                horizontalLineTo(108f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(28f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(168f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-28f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveToRelative(108f, -188.1f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(48f)
                curveTo(0f, 21.5f, 21.5f, 0f, 48f, 0f)
                horizontalLineToRelative(204.1f)
                curveTo(264.8f, 0f, 277f, 5.1f, 286f, 14.1f)
                lineTo(369.9f, 98f)
                curveToRelative(9f, 8.9f, 14.1f, 21.2f, 14.1f, 33.9f)
                close()
                moveToRelative(-128f, -80f)
                verticalLineTo(128f)
                horizontalLineToRelative(76.1f)
                lineTo(256f, 51.9f)
                close()
                moveTo(336f, 464f)
                verticalLineTo(176f)
                horizontalLineTo(232f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineTo(48f)
                horizontalLineTo(48f)
                verticalLineToRelative(416f)
                horizontalLineToRelative(288f)
                close()
            }
        }.build()
        
        return _FileAlt!!
    }

private var _FileAlt: ImageVector? = null

