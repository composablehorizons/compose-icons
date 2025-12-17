package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Range_hood: ImageVector
    get() {
        if (_Range_hood != null) return _Range_hood!!
        
        _Range_hood = ImageVector.Builder(
            name = "range_hood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(122f, 480f)
                lineToRelative(158f, -160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                lineToRelative(160f, 160f)
                horizontalLineTo(122f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -132f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(400f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Range_hood!!
    }

private var _Range_hood: ImageVector? = null

