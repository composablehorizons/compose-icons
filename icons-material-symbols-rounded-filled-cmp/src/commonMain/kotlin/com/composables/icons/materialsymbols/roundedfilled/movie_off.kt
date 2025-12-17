package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Movie_off: ImageVector
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
                lineToRelative(640f, 640f)
                horizontalLineTo(160f)
                close()
                moveToRelative(711f, -44f)
                lineTo(274f, 160f)
                horizontalLineToRelative(69f)
                lineToRelative(66f, 131f)
                quadToRelative(7f, 14f, 20f, 21.5f)
                reflectiveQuadToRelative(28f, 7.5f)
                quadToRelative(30f, 0f, 45.5f, -25f)
                reflectiveQuadToRelative(1.5f, -52f)
                lineToRelative(-41f, -83f)
                horizontalLineToRelative(97f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 10f, -2f, 19f)
                reflectiveQuadToRelative(-7f, 17f)
                close()
                moveTo(763f, 876f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
            }
        }.build()
        
        return _Movie_off!!
    }

private var _Movie_off: ImageVector? = null

