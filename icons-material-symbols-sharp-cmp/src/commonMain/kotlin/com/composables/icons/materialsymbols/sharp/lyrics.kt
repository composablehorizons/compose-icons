package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Lyrics: ImageVector
    get() {
        if (_Lyrics != null) return _Lyrics!!
        
        _Lyrics = ImageVector.Builder(
            name = "lyrics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 640f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(97f)
                quadToRelative(-24f, 11f, -44f, 27f)
                reflectiveQuadToRelative(-36f, 36f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-160f)
                quadToRelative(16f, 20f, 36f, 36f)
                reflectiveQuadToRelative(44f, 27f)
                verticalLineToRelative(177f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(520f, -80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(11f, 0f, 21f, 2f)
                reflectiveQuadToRelative(19f, 5f)
                verticalLineToRelative(-207f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-520f, -40f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Lyrics!!
    }

private var _Lyrics: ImageVector? = null

