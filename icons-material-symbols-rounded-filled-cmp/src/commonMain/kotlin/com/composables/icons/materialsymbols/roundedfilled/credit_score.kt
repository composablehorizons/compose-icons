package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Credit_score: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(207f)
                quadToRelative(0f, 14f, -9.5f, 23.5f)
                reflectiveQuadTo(847f, 480f)
                quadToRelative(-30f, 0f, -59f, 5.5f)
                reflectiveQuadTo(738f, 512f)
                lineTo(598f, 653f)
                lineToRelative(-30f, -29f)
                quadToRelative(-35f, -35f, -84f, -34.5f)
                reflectiveQuadTo(400f, 625f)
                quadToRelative(-32f, 32f, -35.5f, 69.5f)
                reflectiveQuadTo(380f, 767f)
                quadToRelative(6f, 11f, 0.5f, 22f)
                reflectiveQuadTo(364f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -480f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                close()
                moveToRelative(438f, 446f)
                lineToRelative(197f, -197f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(852f, 570f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(852f, 626f)
                lineTo(626f, 852f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(456f, 738f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(456f, 682f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(86f, 84f)
                close()
            }
        }.build()
        
        return _Credit_score!!
    }

private var _Credit_score: ImageVector? = null

