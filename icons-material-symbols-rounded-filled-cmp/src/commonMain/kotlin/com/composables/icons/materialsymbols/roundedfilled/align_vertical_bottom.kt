package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Align_vertical_bottom: ImageVector
    get() {
        if (_Align_vertical_bottom != null) return _Align_vertical_bottom!!
        
        _Align_vertical_bottom = ImageVector.Builder(
            name = "align_vertical_bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 800f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(220f, -160f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(280f, 660f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(400f, 140f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(340f, 720f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(560f, 660f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(620f, 320f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(680f, 380f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 720f)
                close()
            }
        }.build()
        
        return _Align_vertical_bottom!!
    }

private var _Align_vertical_bottom: ImageVector? = null

