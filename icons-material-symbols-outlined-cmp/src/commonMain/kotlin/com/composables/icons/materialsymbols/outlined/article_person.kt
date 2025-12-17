package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Article_person: ImageVector
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
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(179f)
                verticalLineToRelative(-19f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, -240f)
                horizontalLineToRelative(221f)
                quadToRelative(2f, -22f, 10f, -42f)
                reflectiveQuadToRelative(20f, -38f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(157f)
                quadToRelative(17f, -20f, 39f, -32.5f)
                reflectiveQuadToRelative(46f, -20.5f)
                quadToRelative(-4f, -6f, -7f, -13f)
                reflectiveQuadToRelative(-5f, -14f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(258f)
                quadToRelative(-14f, -26f, -34f, -46f)
                reflectiveQuadToRelative(-46f, -33f)
                verticalLineToRelative(-179f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(202f)
                quadToRelative(-1f, 6f, -1.5f, 12f)
                reflectiveQuadToRelative(-0.5f, 12f)
                verticalLineToRelative(56f)
                horizontalLineTo(200f)
                close()
                moveToRelative(480f, -200f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(480f, 840f)
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
            }
        }.build()
        
        return _Article_person!!
    }

private var _Article_person: ImageVector? = null

