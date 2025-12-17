package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Measuring_tape: ImageVector
    get() {
        if (_Measuring_tape != null) return _Measuring_tape!!
        
        _Measuring_tape = ImageVector.Builder(
            name = "measuring_tape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 800f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 720f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -142f, 99f, -241f)
                reflectiveQuadToRelative(241f, -99f)
                quadToRelative(142f, 0f, 241f, 99f)
                reflectiveQuadToRelative(99f, 241f)
                quadToRelative(0f, 142f, -99f, 241f)
                reflectiveQuadToRelative(-241f, 99f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 460f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(540f, 400f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(600f, 460f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(540f, 520f)
                close()
                moveTo(120f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 800f)
                close()
            }
        }.build()
        
        return _Measuring_tape!!
    }

private var _Measuring_tape: ImageVector? = null

