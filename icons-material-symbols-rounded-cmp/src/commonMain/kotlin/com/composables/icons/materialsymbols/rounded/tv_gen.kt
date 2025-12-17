package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tv_gen: ImageVector
    get() {
        if (_Tv_gen != null) return _Tv_gen!!
        
        _Tv_gen = ImageVector.Builder(
            name = "tv_gen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(227f, 760f)
                lineToRelative(-22f, 66f)
                quadToRelative(-2f, 6f, -7f, 10f)
                reflectiveQuadToRelative(-12f, 4f)
                horizontalLineToRelative(-6f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-60f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                verticalLineToRelative(61f)
                quadToRelative(0f, 8f, -5.5f, 13.5f)
                reflectiveQuadTo(781f, 840f)
                horizontalLineToRelative(-7f)
                quadToRelative(-6f, 0f, -11f, -3.5f)
                reflectiveQuadToRelative(-7f, -9.5f)
                lineToRelative(-22f, -67f)
                horizontalLineTo(227f)
                close()
                moveToRelative(-67f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(320f, -220f)
                close()
            }
        }.build()
        
        return _Tv_gen!!
    }

private var _Tv_gen: ImageVector? = null

