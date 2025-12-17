package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ad_off: ImageVector
    get() {
        if (_Ad_off != null) return _Ad_off!!
        
        _Ad_off = ImageVector.Builder(
            name = "ad_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 904f)
                lineToRelative(-64f, -64f)
                horizontalLineTo(120f)
                verticalLineToRelative(-607f)
                lineToRelative(-64f, -65f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(447f)
                lineTo(200f, 313f)
                verticalLineToRelative(447f)
                close()
                moveToRelative(640f, -33f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-327f)
                horizontalLineTo(433f)
                lineTo(233f, 120f)
                horizontalLineToRelative(607f)
                verticalLineToRelative(607f)
                close()
            }
        }.build()
        
        return _Ad_off!!
    }

private var _Ad_off: ImageVector? = null

