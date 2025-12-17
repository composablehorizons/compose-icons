package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Float_portrait_2: ImageVector
    get() {
        if (_Float_portrait_2 != null) return _Float_portrait_2!!
        
        _Float_portrait_2 = ImageVector.Builder(
            name = "float_portrait_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 440f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineTo(320f)
                verticalLineToRelative(200f)
                close()
                moveTo(800f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                close()
            }
        }.build()
        
        return _Float_portrait_2!!
    }

private var _Float_portrait_2: ImageVector? = null

