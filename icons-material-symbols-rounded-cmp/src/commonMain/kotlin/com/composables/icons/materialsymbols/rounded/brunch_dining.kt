package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Brunch_dining: ImageVector
    get() {
        if (_Brunch_dining != null) return _Brunch_dining!!
        
        _Brunch_dining = ImageVector.Builder(
            name = "brunch_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 600f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(40f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, -84f)
                quadToRelative(-36f, -41f, -58f, -81f)
                reflectiveQuadToRelative(-22f, -97f)
                verticalLineToRelative(-338f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(338f)
                quadToRelative(0f, 57f, -21.5f, 97.5f)
                reflectiveQuadTo(800f, 636f)
                verticalLineToRelative(164f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 840f)
                verticalLineToRelative(-204f)
                close()
                moveToRelative(0f, -316f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(40f, 242f)
                quadToRelative(18f, -21f, 29f, -48f)
                reflectiveQuadToRelative(11f, -56f)
                verticalLineToRelative(-58f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(58f)
                quadToRelative(0f, 29f, 10f, 56f)
                reflectiveQuadToRelative(30f, 48f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Brunch_dining!!
    }

private var _Brunch_dining: ImageVector? = null

