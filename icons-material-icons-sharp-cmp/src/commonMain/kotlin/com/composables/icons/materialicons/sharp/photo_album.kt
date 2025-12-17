package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Photo_album: ImageVector
    get() {
        if (_Photo_album != null) return _Photo_album!!
        
        _Photo_album = ImageVector.Builder(
            name = "photo_album",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                lineToRelative(-2.5f, -1.5f)
                lineTo(11f, 11f)
                verticalLineTo(4f)
                close()
                moveTo(7f, 18f)
                lineToRelative(2.38f, -3.17f)
                lineTo(11f, 17f)
                lineToRelative(2.62f, -3.5f)
                lineTo(17f, 18f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Photo_album!!
    }

private var _Photo_album: ImageVector? = null

