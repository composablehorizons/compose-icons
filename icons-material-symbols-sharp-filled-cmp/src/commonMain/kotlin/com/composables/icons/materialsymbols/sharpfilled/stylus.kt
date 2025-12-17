package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stylus: ImageVector
    get() {
        if (_Stylus != null) return _Stylus!!
        
        _Stylus = ImageVector.Builder(
            name = "stylus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(338f, 804f)
                lineToRelative(-230f, 48f)
                lineToRelative(48f, -230f)
                lineToRelative(182f, 182f)
                close()
                moveToRelative(65f, -49f)
                lineTo(205f, 557f)
                lineToRelative(470f, -470f)
                lineToRelative(198f, 198f)
                lineToRelative(-470f, 470f)
                close()
            }
        }.build()
        
        return _Stylus!!
    }

private var _Stylus: ImageVector? = null

