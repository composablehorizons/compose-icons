package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Desktop_landscape_add: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(351f)
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
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 80f)
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

