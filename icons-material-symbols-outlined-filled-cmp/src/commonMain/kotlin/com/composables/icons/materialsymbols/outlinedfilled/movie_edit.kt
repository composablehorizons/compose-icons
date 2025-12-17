package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Movie_edit: ImageVector
    get() {
        if (_Movie_edit != null) return _Movie_edit!!
        
        _Movie_edit = ImageVector.Builder(
            name = "movie_edit",
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
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(171f)
                quadToRelative(-38f, -17f, -81f, -10f)
                reflectiveQuadToRelative(-75f, 39f)
                lineTo(480f, 684f)
                verticalLineToRelative(116f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, 40f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(903f, 620f)
                lineTo(683f, 840f)
                horizontalLineTo(560f)
                close()
                moveToRelative(263f, -224f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
            }
        }.build()
        
        return _Movie_edit!!
    }

private var _Movie_edit: ImageVector? = null

