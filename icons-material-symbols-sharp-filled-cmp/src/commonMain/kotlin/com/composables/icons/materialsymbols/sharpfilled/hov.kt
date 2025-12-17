package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hov: ImageVector
    get() {
        if (_Hov != null) return _Hov!!
        
        _Hov = ImageVector.Builder(
            name = "hov",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(240f, 480f)
                lineToRelative(240f, -400f)
                lineToRelative(240f, 400f)
                lineTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Hov!!
    }

private var _Hov: ImageVector? = null

