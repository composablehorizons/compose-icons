package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileVideo: ImageVector
    get() {
        if (_FileVideo != null) return _FileVideo!!
        
        _FileVideo = ImageVector.Builder(
            name = "file-video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 121.941f)
                verticalLineTo(128f)
                horizontalLineTo(256f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.059f)
                curveToRelative(6.365f, 0f, 12.47f, 2.529f, 16.971f, 7.029f)
                lineToRelative(97.941f, 97.941f)
                arcTo(24.005f, 24.005f, 0f, false, true, 384f, 121.941f)
                close()
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.745f, 0f, 0f, 10.745f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(96f, 144.016f)
                verticalLineToRelative(111.963f)
                curveToRelative(0f, 21.445f, -25.943f, 31.998f, -40.971f, 16.971f)
                lineTo(224f, 353.941f)
                verticalLineTo(392f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(88f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(112f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(38.059f)
                lineToRelative(55.029f, -55.013f)
                curveToRelative(15.011f, -15.01f, 40.971f, -4.491f, 40.971f, 16.97f)
                close()
            }
        }.build()
        
        return _FileVideo!!
    }

private var _FileVideo: ImageVector? = null

