package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shop_two: ImageVector
    get() {
        if (_Shop_two != null) return _Shop_two!!
        
        _Shop_two = ImageVector.Builder(
            name = "shop_two",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                lineToRelative(220f, -140f)
                lineToRelative(-220f, -140f)
                verticalLineToRelative(280f)
                close()
                moveTo(120f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 720f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(280f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(200f, -440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 640f)
                verticalLineToRelative(-360f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Shop_two!!
    }

private var _Shop_two: ImageVector? = null

