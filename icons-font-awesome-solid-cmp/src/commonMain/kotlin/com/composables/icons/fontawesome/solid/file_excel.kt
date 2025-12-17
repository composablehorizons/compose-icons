package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileExcel: ImageVector
    get() {
        if (_FileExcel != null) return _FileExcel!!
        
        _FileExcel = ImageVector.Builder(
            name = "file-excel",
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
                moveToRelative(60.1f, 106.5f)
                lineTo(224f, 336f)
                lineToRelative(60.1f, 93.5f)
                curveToRelative(5.1f, 8f, -0.6f, 18.5f, -10.1f, 18.5f)
                horizontalLineToRelative(-34.9f)
                curveToRelative(-4.4f, 0f, -8.5f, -2.4f, -10.6f, -6.3f)
                curveTo(208.9f, 405.5f, 192f, 373f, 192f, 373f)
                curveToRelative(-6.4f, 14.8f, -10f, 20f, -36.6f, 68.8f)
                curveToRelative(-2.1f, 3.9f, -6.1f, 6.3f, -10.5f, 6.3f)
                horizontalLineTo(110f)
                curveToRelative(-9.5f, 0f, -15.2f, -10.5f, -10.1f, -18.5f)
                lineToRelative(60.3f, -93.5f)
                lineToRelative(-60.3f, -93.5f)
                curveToRelative(-5.2f, -8f, 0.6f, -18.5f, 10.1f, -18.5f)
                horizontalLineToRelative(34.8f)
                curveToRelative(4.4f, 0f, 8.5f, 2.4f, 10.6f, 6.3f)
                curveToRelative(26.1f, 48.8f, 20f, 33.6f, 36.6f, 68.5f)
                curveToRelative(0f, 0f, 6.1f, -11.7f, 36.6f, -68.5f)
                curveToRelative(2.1f, -3.9f, 6.2f, -6.3f, 10.6f, -6.3f)
                horizontalLineTo(274f)
                curveToRelative(9.5f, -0.1f, 15.2f, 10.4f, 10.1f, 18.4f)
                close()
                moveTo(384f, 121.9f)
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
        
        return _FileExcel!!
    }

private var _FileExcel: ImageVector? = null

