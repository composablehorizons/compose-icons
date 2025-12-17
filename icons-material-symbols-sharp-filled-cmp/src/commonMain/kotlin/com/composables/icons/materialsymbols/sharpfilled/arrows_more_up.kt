package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Arrows_more_up: ImageVector
    get() {
        if (_Arrows_more_up != null) return _Arrows_more_up!!
        
        _Arrows_more_up = ImageVector.Builder(
            name = "arrows_more_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                verticalLineToRelative(-360f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, -200f)
                verticalLineToRelative(-360f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrows_more_up!!
    }

private var _Arrows_more_up: ImageVector? = null

