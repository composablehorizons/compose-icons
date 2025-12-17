package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Font_download: ImageVector
    get() {
        if (_Font_download != null) return _Font_download!!
        
        _Font_download = ImageVector.Builder(
            name = "font_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 720f)
                horizontalLineToRelative(84f)
                lineToRelative(44f, -122f)
                horizontalLineToRelative(192f)
                lineToRelative(44f, 122f)
                horizontalLineToRelative(84f)
                lineTo(522f, 240f)
                horizontalLineToRelative(-84f)
                lineTo(256f, 720f)
                close()
                moveToRelative(152f, -192f)
                lineToRelative(70f, -198f)
                horizontalLineToRelative(4f)
                lineToRelative(70f, 198f)
                horizontalLineTo(408f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Font_download!!
    }

private var _Font_download: ImageVector? = null

