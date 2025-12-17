package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Eda: ImageVector
    get() {
        if (_Eda != null) return _Eda!!
        
        _Eda = ImageVector.Builder(
            name = "eda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(218f)
                lineToRelative(81f, 107f)
                quadToRelative(22f, 29f, 58f, 32f)
                reflectiveQuadToRelative(62f, -23f)
                lineToRelative(182f, -182f)
                lineToRelative(49f, -30f)
                quadToRelative(20f, -13f, 44f, -11f)
                reflectiveQuadToRelative(44f, 16f)
                quadToRelative(25f, 19f, 27f, 50f)
                reflectiveQuadToRelative(-20f, 53f)
                lineTo(632f, 885f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                horizontalLineTo(280f)
                close()
                moveTo(120f, 560f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 120f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(343f)
                lineTo(482f, 699f)
                lineToRelative(-80f, -107f)
                quadToRelative(-11f, -15f, -28f, -23.5f)
                reflectiveQuadToRelative(-36f, -8.5f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Eda!!
    }

private var _Eda: ImageVector? = null

