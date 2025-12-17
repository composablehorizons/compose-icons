package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Desktop_landscape_add: ImageVector
    get() {
        if (_Desktop_landscape_add != null) return _Desktop_landscape_add!!
        
        _Desktop_landscape_add = ImageVector.Builder(
            name = "desktop_landscape_add",
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
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(271f)
                quadToRelative(-26f, -15f, -56.5f, -23f)
                reflectiveQuadToRelative(-62.5f, -8f)
                quadToRelative(-11f, 0f, -21f, 0.5f)
                reflectiveQuadToRelative(-20f, 2.5f)
                verticalLineToRelative(-163f)
                horizontalLineTo(360f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(300f)
                verticalLineToRelative(122f)
                quadToRelative(-17f, 8f, -31.5f, 17.5f)
                reflectiveQuadTo(600f, 541f)
                verticalLineToRelative(-101f)
                horizontalLineTo(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(294f)
                quadToRelative(-7f, 19f, -10.5f, 39.5f)
                reflectiveQuadTo(520f, 721f)
                quadToRelative(0f, 21f, 3f, 40.5f)
                reflectiveQuadToRelative(10f, 38.5f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, 80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Desktop_landscape_add!!
    }

private var _Desktop_landscape_add: ImageVector? = null

