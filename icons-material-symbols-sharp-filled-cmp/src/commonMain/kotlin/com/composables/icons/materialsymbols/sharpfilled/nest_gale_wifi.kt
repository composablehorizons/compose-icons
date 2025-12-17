package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_gale_wifi: ImageVector
    get() {
        if (_Nest_gale_wifi != null) return _Nest_gale_wifi!!
        
        _Nest_gale_wifi = ImageVector.Builder(
            name = "nest_gale_wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(104f, 400f)
                lineToRelative(16f, -240f)
                horizontalLineToRelative(720f)
                lineToRelative(16f, 240f)
                horizontalLineTo(104f)
                close()
                moveToRelative(96f, 400f)
                lineToRelative(-13f, -40f)
                horizontalLineTo(80f)
                lineToRelative(19f, -280f)
                horizontalLineToRelative(762f)
                lineToRelative(19f, 280f)
                horizontalLineTo(773f)
                lineToRelative(-13f, 40f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Nest_gale_wifi!!
    }

private var _Nest_gale_wifi: ImageVector? = null

