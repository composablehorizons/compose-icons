package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ink_highlighter_move: ImageVector
    get() {
        if (_Ink_highlighter_move != null) return _Ink_highlighter_move!!
        
        _Ink_highlighter_move = ImageVector.Builder(
            name = "ink_highlighter_move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(551f, 160f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(311f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(391f, 320f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 240f)
                horizontalLineToRelative(271f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(231f, 480f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 400f)
                horizontalLineToRelative(231f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(193f, -80f)
                lineToRelative(216f, 216f)
                lineToRelative(-200f, 200f)
                quadToRelative(-24f, 24f, -56f, 24f)
                reflectiveQuadToRelative(-56f, -24f)
                lineToRelative(-2f, -2f)
                lineToRelative(-14f, 14f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineTo(148f)
                quadToRelative(-14f, 0f, -19f, -12f)
                reflectiveQuadToRelative(5f, -22f)
                lineToRelative(92f, -92f)
                lineToRelative(-2f, -2f)
                quadToRelative(-24f, -24f, -24f, -56f)
                reflectiveQuadToRelative(24f, -56f)
                lineToRelative(200f, -200f)
                close()
                moveToRelative(57f, -57f)
                lineToRelative(199f, -199f)
                quadToRelative(24f, -24f, 56f, -24f)
                reflectiveQuadToRelative(56f, 24f)
                lineToRelative(104f, 104f)
                quadToRelative(24f, 24f, 24f, 56f)
                reflectiveQuadToRelative(-24f, 56f)
                lineTo(697f, 559f)
                lineTo(481f, 343f)
                close()
            }
        }.build()
        
        return _Ink_highlighter_move!!
    }

private var _Ink_highlighter_move: ImageVector? = null

