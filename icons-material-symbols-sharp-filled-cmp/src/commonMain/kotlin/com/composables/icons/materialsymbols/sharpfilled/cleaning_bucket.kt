package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Cleaning_bucket: ImageVector
    get() {
        if (_Cleaning_bucket != null) return _Cleaning_bucket!!
        
        _Cleaning_bucket = ImageVector.Builder(
            name = "cleaning_bucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                lineToRelative(-80f, -600f)
                horizontalLineToRelative(560f)
                lineTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -280f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(120f, -360f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(540f, 220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 220f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 280f)
                close()
                moveToRelative(-200f, -40f)
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
        
        return _Cleaning_bucket!!
    }

private var _Cleaning_bucket: ImageVector? = null

