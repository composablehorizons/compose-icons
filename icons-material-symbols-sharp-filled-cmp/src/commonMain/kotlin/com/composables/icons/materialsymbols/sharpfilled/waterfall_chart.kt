package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Waterfall_chart: ImageVector
    get() {
        if (_Waterfall_chart != null) return _Waterfall_chart!!
        
        _Waterfall_chart = ImageVector.Builder(
            name = "waterfall_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(200f, -240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(200f)
                horizontalLineTo(320f)
                close()
                moveToRelative(200f, -200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(200f)
                horizontalLineTo(520f)
                close()
                moveToRelative(200f, 440f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Waterfall_chart!!
    }

private var _Waterfall_chart: ImageVector? = null

