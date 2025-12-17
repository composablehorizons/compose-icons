package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Align_horizontal_left: ImageVector
    get() {
        if (_Align_horizontal_left != null) return _Align_horizontal_left!!
        
        _Align_horizontal_left = ImageVector.Builder(
            name = "align_horizontal_left",
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
                verticalLineToRelative(-720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 880f)
                close()
                moveToRelative(180f, -200f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(240f, 620f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 560f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 620f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 680f)
                horizontalLineTo(300f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(240f, 340f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 280f)
                horizontalLineToRelative(520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 340f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 400f)
                horizontalLineTo(300f)
                close()
            }
        }.build()
        
        return _Align_horizontal_left!!
    }

private var _Align_horizontal_left: ImageVector? = null

