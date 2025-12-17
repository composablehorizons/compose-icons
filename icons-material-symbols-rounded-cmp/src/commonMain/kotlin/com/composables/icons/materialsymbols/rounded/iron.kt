package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Iron: ImageVector
    get() {
        if (_Iron != null) return _Iron!!
        
        _Iron = ImageVector.Builder(
            name = "iron",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 640f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 600f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(240f, -400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 320f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                quadTo(800f, 343f, 800f, 360f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 360f)
                horizontalLineTo(400f)
                quadToRelative(-8f, 0f, -15.5f, 3.5f)
                reflectiveQuadTo(372f, 372f)
                quadToRelative(-5f, 5f, -12.5f, 8f)
                reflectiveQuadToRelative(-15.5f, 3f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(304f, 343f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(8f, -12.5f)
                quadToRelative(17f, -17f, 38.5f, -26f)
                reflectiveQuadToRelative(46.5f, -9f)
                horizontalLineToRelative(160f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                close()
            }
        }.build()
        
        return _Iron!!
    }

private var _Iron: ImageVector? = null

