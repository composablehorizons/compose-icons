package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_arrow_right: ImageVector
    get() {
        if (_Mobile_arrow_right != null) return _Mobile_arrow_right!!
        
        _Mobile_arrow_right = ImageVector.Builder(
            name = "mobile_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(166f)
                lineToRelative(-62f, 64f)
                lineToRelative(56f, 56f)
                lineToRelative(160f, -160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-56f, 56f)
                lineToRelative(62f, 64f)
                horizontalLineTo(320f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(484f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Mobile_arrow_right!!
    }

private var _Mobile_arrow_right: ImageVector? = null

