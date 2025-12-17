package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Align_horizontal_right: ImageVector
    get() {
        if (_Align_horizontal_right != null) return _Align_horizontal_right!!
        
        _Align_horizontal_right = ImageVector.Builder(
            name = "align_horizontal_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                close()
                moveTo(380f, 680f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 620f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 560f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 620f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(660f, 680f)
                horizontalLineTo(380f)
                close()
                moveTo(140f, 400f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 280f)
                horizontalLineToRelative(520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 340f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(660f, 400f)
                horizontalLineTo(140f)
                close()
            }
        }.build()
        
        return _Align_horizontal_right!!
    }

private var _Align_horizontal_right: ImageVector? = null

