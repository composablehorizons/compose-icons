package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Download_2: ImageVector
    get() {
        if (_Download_2 != null) return _Download_2!!
        
        _Download_2 = ImageVector.Builder(
            name = "download_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -160f)
                lineTo(200f, 360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(160f)
                lineTo(480f, 720f)
                close()
            }
        }.build()
        
        return _Download_2!!
    }

private var _Download_2: ImageVector? = null

