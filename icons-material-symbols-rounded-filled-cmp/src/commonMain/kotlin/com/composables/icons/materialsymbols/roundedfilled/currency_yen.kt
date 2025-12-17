package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Currency_yen: ImageVector
    get() {
        if (_Currency_yen != null) return _Currency_yen!!
        
        _Currency_yen = ImageVector.Builder(
            name = "currency_yen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(123f)
                lineTo(239f, 181f)
                quadToRelative(-13f, -20f, -1.5f, -40.5f)
                reflectiveQuadTo(273f, 120f)
                quadToRelative(11f, 0f, 20f, 5f)
                reflectiveQuadToRelative(14f, 14f)
                lineToRelative(173f, 273f)
                lineToRelative(173f, -273f)
                quadToRelative(5f, -9f, 14f, -14f)
                reflectiveQuadToRelative(20f, -5f)
                quadToRelative(24f, 0f, 35.5f, 21f)
                reflectiveQuadToRelative(-1.5f, 41f)
                lineTo(557f, 440f)
                horizontalLineToRelative(123f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 680f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                close()
            }
        }.build()
        
        return _Currency_yen!!
    }

private var _Currency_yen: ImageVector? = null

