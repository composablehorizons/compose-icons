package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Credit_score: ImageVector
    get() {
        if (_Credit_score != null) return _Credit_score!!
        
        _Credit_score = ImageVector.Builder(
            name = "credit_score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, -80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(124f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(324f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(284f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-130.5f)
                verticalLineToRelative(63.5f)
                verticalLineToRelative(-413f)
                close()
                moveTo(598f, 864f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(456f, 738f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(456f, 682f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(86f, 84f)
                lineToRelative(197f, -197f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(852f, 570f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(852f, 626f)
                lineTo(626f, 852f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                close()
            }
        }.build()
        
        return _Credit_score!!
    }

private var _Credit_score: ImageVector? = null

