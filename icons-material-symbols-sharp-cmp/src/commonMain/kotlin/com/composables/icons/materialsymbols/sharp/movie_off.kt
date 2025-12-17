package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Movie_off: ImageVector
    get() {
        if (_Movie_off != null) return _Movie_off!!
        
        _Movie_off = ImageVector.Builder(
            name = "movie_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(240f, 240f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(560f)
                lineToRelative(80f, 80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(800f, -35f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-285f)
                horizontalLineTo(514f)
                lineTo(274f, 160f)
                horizontalLineToRelative(66f)
                lineToRelative(67f, 133f)
                lineToRelative(27f, 27f)
                horizontalLineToRelative(106f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(100f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(605f)
                close()
                moveTo(791f, 905f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(446f, 560f)
                close()
                moveToRelative(211f, -18f)
                close()
            }
        }.build()
        
        return _Movie_off!!
    }

private var _Movie_off: ImageVector? = null

