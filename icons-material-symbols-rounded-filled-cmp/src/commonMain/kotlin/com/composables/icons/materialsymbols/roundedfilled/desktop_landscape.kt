package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Desktop_landscape: ImageVector
    get() {
        if (_Desktop_landscape != null) return _Desktop_landscape!!
        
        _Desktop_landscape = ImageVector.Builder(
            name = "desktop_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 640f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 600f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 640f)
                close()
                moveToRelative(80f, -290f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(390f, 380f)
                horizontalLineToRelative(250f)
                quadToRelative(4f, 0f, 7.5f, 1.5f)
                reflectiveQuadToRelative(6.5f, 4.5f)
                quadToRelative(3f, 3f, 4.5f, 6.5f)
                reflectiveQuadToRelative(1.5f, 7.5f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(690f, 520f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 490f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 320f)
                horizontalLineTo(390f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(360f, 350f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Desktop_landscape!!
    }

private var _Desktop_landscape: ImageVector? = null

