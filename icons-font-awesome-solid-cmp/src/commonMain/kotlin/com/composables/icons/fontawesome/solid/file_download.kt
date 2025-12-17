package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileDownload: ImageVector
    get() {
        if (_FileDownload != null) return _FileDownload!!
        
        _FileDownload = ImageVector.Builder(
            name = "file-download",
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
                moveToRelative(76.45f, 211.36f)
                lineToRelative(-96.42f, 95.7f)
                curveToRelative(-6.65f, 6.61f, -17.39f, 6.61f, -24.04f, 0f)
                lineToRelative(-96.42f, -95.7f)
                curveTo(73.42f, 337.29f, 80.54f, 320f, 94.82f, 320f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(65.18f)
                curveToRelative(14.28f, 0f, 21.4f, 17.29f, 11.27f, 27.36f)
                close()
                moveTo(377f, 105f)
                lineTo(279.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(256f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
            }
        }.build()
        
        return _FileDownload!!
    }

private var _FileDownload: ImageVector? = null

