package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Font_download: ImageVector
    get() {
        if (_Font_download != null) return _Font_download!!
        
        _Font_download = ImageVector.Builder(
            name = "font_download",
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
                moveTo(9.93f, 13.5f)
                horizontalLineToRelative(4.14f)
                lineTo(12f, 7.98f)
                lineTo(9.93f, 13.5f)
                close()
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(20f)
                verticalLineTo(2f)
                close()
                moveToRelative(-6.05f, 16.5f)
                lineToRelative(-1.14f, -3f)
                horizontalLineTo(9.17f)
                lineToRelative(-1.12f, 3f)
                horizontalLineTo(5.96f)
                lineToRelative(5.11f, -13f)
                horizontalLineToRelative(1.86f)
                lineToRelative(5.11f, 13f)
                horizontalLineToRelative(-2.09f)
                close()
            }
        }.build()
        
        return _Font_download!!
    }

private var _Font_download: ImageVector? = null

