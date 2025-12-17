package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stacked_email: ImageVector
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
                moveToRelative(360f, -189f)
                lineTo(280f, 297f)
                verticalLineToRelative(303f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-303f)
                lineTo(560f, 491f)
                close()
                moveToRelative(0f, -97f)
                lineToRelative(280f, -194f)
                horizontalLineTo(280f)
                lineToRelative(280f, 194f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-580f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(500f)
                horizontalLineToRelative(660f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(800f, -640f)
                horizontalLineTo(280f)
                horizontalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Stacked_email!!
    }

private var _Stacked_email: ImageVector? = null

