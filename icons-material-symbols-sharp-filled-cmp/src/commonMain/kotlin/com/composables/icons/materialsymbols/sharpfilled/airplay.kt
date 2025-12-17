package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Airplay: ImageVector
    get() {
        if (_Airplay != null) return _Airplay!!
        
        _Airplay = ImageVector.Builder(
            name = "airplay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 760f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(760f)
                lineTo(480f, 480f)
                lineTo(200f, 760f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Airplay!!
    }

private var _Airplay: ImageVector? = null

