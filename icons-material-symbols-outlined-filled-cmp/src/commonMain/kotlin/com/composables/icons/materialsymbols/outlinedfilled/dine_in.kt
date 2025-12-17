package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dine_in: ImageVector
    get() {
        if (_Dine_in != null) return _Dine_in!!
        
        _Dine_in = ImageVector.Builder(
            name = "dine_in",
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
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 240f)
                close()
                moveTo(480f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-236f)
                quadToRelative(0f, -35f, 24f, -59.5f)
                reflectiveQuadToRelative(58f, -24.5f)
                quadToRelative(19f, 0f, 35.5f, 8f)
                reflectiveQuadToRelative(28.5f, 22f)
                quadToRelative(45f, 49f, 96.5f, 89.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineToRelative(54f)
                quadToRelative(-25f, -17f, -39.5f, -42.5f)
                reflectiveQuadTo(560f, 340f)
                horizontalLineToRelative(241f)
                quadToRelative(0f, 32f, -14.5f, 57.5f)
                reflectiveQuadTo(747f, 440f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                quadToRelative(-53f, 0f, -107f, -23f)
                reflectiveQuadToRelative(-93f, -55f)
                verticalLineToRelative(138f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 660f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Dine_in!!
    }

private var _Dine_in: ImageVector? = null

