package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Currency_yen: ImageVector
    get() {
        if (_Currency_yen != null) return _Currency_yen!!
        
        _Currency_yen = ImageVector.Builder(
            name = "currency_yen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(163f)
                lineTo(200f, 120f)
                horizontalLineToRelative(95f)
                lineToRelative(185f, 292f)
                lineToRelative(185f, -292f)
                horizontalLineToRelative(95f)
                lineTo(557f, 440f)
                horizontalLineToRelative(163f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Currency_yen!!
    }

private var _Currency_yen: ImageVector? = null

