package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stacked_email: ImageVector
    get() {
        if (_Stacked_email != null) return _Stacked_email!!
        
        _Stacked_email = ImageVector.Builder(
            name = "stacked_email",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(560f)
                horizontalLineTo(200f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-580f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(500f)
                horizontalLineToRelative(660f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(520f, -349f)
                lineToRelative(280f, -194f)
                verticalLineToRelative(-97f)
                lineTo(560f, 394f)
                lineTo(280f, 200f)
                verticalLineToRelative(97f)
                lineToRelative(280f, 194f)
                close()
            }
        }.build()
        
        return _Stacked_email!!
    }

private var _Stacked_email: ImageVector? = null

