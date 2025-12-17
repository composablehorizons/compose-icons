package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileExport: ImageVector
    get() {
        if (_FileExport != null) return _FileExport!!
        
        _FileExport = ImageVector.Builder(
            name = "file-export",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 121.9f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                lineTo(279.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(256f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                close()
                moveTo(571f, 308f)
                lineToRelative(-95.7f, -96.4f)
                curveToRelative(-10.1f, -10.1f, -27.4f, -3f, -27.4f, 11.3f)
                verticalLineTo(288f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(65.2f)
                curveToRelative(0f, 14.3f, 17.3f, 21.4f, 27.4f, 11.3f)
                lineTo(571f, 332f)
                curveToRelative(6.6f, -6.6f, 6.6f, -17.4f, 0f, -24f)
                close()
                moveToRelative(-379f, 28f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(176f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(352f)
                horizontalLineTo(208f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                close()
            }
        }.build()
        
        return _FileExport!!
    }

private var _FileExport: ImageVector? = null

