package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nat: ImageVector
    get() {
        if (_Nat != null) return _Nat!!
        
        _Nat = ImageVector.Builder(
            name = "nat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(272f, 440f)
                horizontalLineToRelative(168f)
                verticalLineToRelative(80f)
                horizontalLineTo(272f)
                quadToRelative(-12f, 35f, -42.5f, 57.5f)
                reflectiveQuadTo(160f, 600f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 520f)
                close()
                moveToRelative(40f, 360f)
                verticalLineToRelative(-80f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(200f, 160f)
                verticalLineToRelative(-80f)
                quadToRelative(157f, 0f, 270f, 104f)
                reflectiveQuadToRelative(128f, 256f)
                horizontalLineToRelative(168f)
                lineToRelative(-62f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -56f)
                lineToRelative(62f, -64f)
                horizontalLineTo(598f)
                quadToRelative(-15f, 152f, -128f, 256f)
                reflectiveQuadTo(200f, 880f)
                close()
            }
        }.build()
        
        return _Nat!!
    }

private var _Nat: ImageVector? = null

