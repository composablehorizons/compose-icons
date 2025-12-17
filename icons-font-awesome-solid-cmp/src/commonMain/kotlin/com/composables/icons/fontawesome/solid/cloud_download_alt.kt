package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CloudDownloadAlt: ImageVector
    get() {
        if (_CloudDownloadAlt != null) return _CloudDownloadAlt!!
        
        _CloudDownloadAlt = ImageVector.Builder(
            name = "cloud-download-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(537.6f, 226.6f)
                curveToRelative(4.1f, -10.7f, 6.4f, -22.4f, 6.4f, -34.6f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                curveToRelative(-19.7f, 0f, -38.1f, 6f, -53.3f, 16.2f)
                curveTo(367f, 64.2f, 315.3f, 32f, 256f, 32f)
                curveToRelative(-88.4f, 0f, -160f, 71.6f, -160f, 160f)
                curveToRelative(0f, 2.7f, 0.1f, 5.4f, 0.2f, 8.1f)
                curveTo(40.2f, 219.8f, 0f, 273.2f, 0f, 336f)
                curveToRelative(0f, 79.5f, 64.5f, 144f, 144f, 144f)
                horizontalLineToRelative(368f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                curveToRelative(0f, -61.9f, -44f, -113.6f, -102.4f, -125.4f)
                close()
                moveToRelative(-132.9f, 88.7f)
                lineTo(299.3f, 420.7f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0f)
                lineTo(171.3f, 315.3f)
                curveToRelative(-10.1f, -10.1f, -2.9f, -27.3f, 11.3f, -27.3f)
                horizontalLineTo(248f)
                verticalLineTo(176f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(48f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                verticalLineToRelative(112f)
                horizontalLineToRelative(65.4f)
                curveToRelative(14.2f, 0f, 21.4f, 17.2f, 11.3f, 27.3f)
                close()
            }
        }.build()
        
        return _CloudDownloadAlt!!
    }

private var _CloudDownloadAlt: ImageVector? = null

