package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stylus_pencil: ImageVector
    get() {
        if (_Stylus_pencil != null) return _Stylus_pencil!!
        
        _Stylus_pencil = ImageVector.Builder(
            name = "stylus_pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 640f)
                lineToRelative(200f, -520f)
                horizontalLineToRelative(80f)
                lineToRelative(200f, 520f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-80f, 200f)
                lineToRelative(40f, -120f)
                horizontalLineToRelative(560f)
                lineToRelative(40f, 120f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Stylus_pencil!!
    }

private var _Stylus_pencil: ImageVector? = null

