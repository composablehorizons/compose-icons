package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Currency_franc: ImageVector
    get() {
        if (_Currency_franc != null) return _Currency_franc!!
        
        _Currency_franc = ImageVector.Builder(
            name = "currency_franc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Currency_franc!!
    }

private var _Currency_franc: ImageVector? = null

