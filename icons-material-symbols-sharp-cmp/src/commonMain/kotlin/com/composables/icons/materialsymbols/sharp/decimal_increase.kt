package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Decimal_increase: ImageVector
    get() {
        if (_Decimal_increase != null) return _Decimal_increase!!
        
        _Decimal_increase = ImageVector.Builder(
            name = "decimal_increase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(247f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineTo(720f, 880f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(300f, 0f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(-360f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 380f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 220f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 440f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(800f, 380f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(740f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(680f, 220f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(740f, 440f)
                close()
            }
        }.build()
        
        return _Decimal_increase!!
    }

private var _Decimal_increase: ImageVector? = null

