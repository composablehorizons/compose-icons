package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flag_2: ImageVector
    get() {
        if (_Flag_2 != null) return _Flag_2!!
        
        _Flag_2 = ImageVector.Builder(
            name = "flag_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 520f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(541f)
                quadToRelative(11f, 0f, 19.5f, 5f)
                reflectiveQuadToRelative(13.5f, 13f)
                quadToRelative(5f, 8f, 6.5f, 17.5f)
                reflectiveQuadTo(818f, 175f)
                lineToRelative(-58f, 145f)
                lineToRelative(58f, 145f)
                quadToRelative(4f, 10f, 2.5f, 19.5f)
                reflectiveQuadTo(814f, 502f)
                quadToRelative(-5f, 8f, -13.5f, 13f)
                reflectiveQuadToRelative(-19.5f, 5f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(442f)
                lineToRelative(-36f, -90f)
                quadToRelative(-6f, -14f, -6f, -30f)
                reflectiveQuadToRelative(6f, -30f)
                lineToRelative(36f, -90f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Flag_2!!
    }

private var _Flag_2: ImageVector? = null

