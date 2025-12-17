package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Buttons_alt: ImageVector
    get() {
        if (_Buttons_alt != null) return _Buttons_alt!!
        
        _Buttons_alt = ImageVector.Builder(
            name = "buttons_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(130f, -130f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(350f, 570f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 450f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(290f, 390f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 510f)
                horizontalLineToRelative(60f)
                close()
                moveTo(160f, 640f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Buttons_alt!!
    }

private var _Buttons_alt: ImageVector? = null

