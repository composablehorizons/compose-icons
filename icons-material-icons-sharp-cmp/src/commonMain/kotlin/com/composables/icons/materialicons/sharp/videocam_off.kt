package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Videocam_off: ImageVector
    get() {
        if (_Videocam_off != null) return _Videocam_off!!
        
        _Videocam_off = ImageVector.Builder(
            name = "videocam_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 16.61f)
                verticalLineTo(6.5f)
                lineToRelative(-4f, 4f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6.61f)
                close()
                moveTo(3.41f, 1.86f)
                lineTo(2f, 3.27f)
                lineTo(4.73f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(13.73f)
                lineToRelative(3f, 3f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Videocam_off!!
    }

private var _Videocam_off: ImageVector? = null

