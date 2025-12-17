package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.File_download_off: ImageVector
    get() {
        if (_File_download_off != null) return _File_download_off!!
        
        _File_download_off = ImageVector.Builder(
            name = "file_download_off",
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
                moveTo(9f, 6.17f)
                verticalLineTo(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                lineToRelative(-3.59f, 3.59f)
                lineTo(9f, 6.17f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(6.17f, 9f)
                horizontalLineTo(5f)
                lineToRelative(7f, 7f)
                lineToRelative(0.59f, -0.59f)
                lineTo(15.17f, 18f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12.17f)
                lineToRelative(2.61f, 2.61f)
                lineTo(21.19f, 21.19f)
                close()
            }
        }.build()
        
        return _File_download_off!!
    }

private var _File_download_off: ImageVector? = null

