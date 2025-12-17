package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Article_person: ImageVector
    get() {
        if (_Article_person != null) return _Article_person!!
        
        _Article_person = ImageVector.Builder(
            name = "article_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(338f)
                quadToRelative(-23f, -45f, -66f, -71.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(-45f, 0f, -84f, 21f)
                reflectiveQuadToRelative(-65f, 59f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(221f)
                quadToRelative(-2f, 20f, 0f, 40f)
                reflectiveQuadToRelative(9f, 40f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(157f)
                quadToRelative(-19f, 22f, -28f, 48.5f)
                reflectiveQuadToRelative(-9f, 55.5f)
                verticalLineToRelative(56f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-56f)
                quadToRelative(0f, -24f, 12.5f, -44.5f)
                reflectiveQuadTo(528f, 710f)
                quadToRelative(36f, -15f, 74.5f, -22.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(39f, 0f, 77.5f, 7.5f)
                reflectiveQuadTo(832f, 710f)
                quadToRelative(23f, 9f, 35.5f, 29.5f)
                reflectiveQuadTo(880f, 784f)
                verticalLineToRelative(56f)
                horizontalLineTo(480f)
                close()
                moveToRelative(200f, -200f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
            }
        }.build()
        
        return _Article_person!!
    }

private var _Article_person: ImageVector? = null

