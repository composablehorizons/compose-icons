package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Movie_off: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(240f, 240f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(560f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(711f, -44f)
                lineToRelative(-71f, -71f)
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
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 10f, -2f, 19f)
                reflectiveQuadToRelative(-7f, 17f)
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

