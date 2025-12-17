package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Currency_yuan: ImageVector
    get() {
        if (_Currency_yuan != null) return _Currency_yuan!!
        
        _Currency_yuan = ImageVector.Builder(
            name = "currency_yuan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineToRelative(149f)
                lineTo(239f, 182f)
                quadToRelative(-13f, -20f, -1.5f, -41f)
                reflectiveQuadToRelative(35.5f, -21f)
                quadToRelative(11f, 0f, 20f, 5f)
                reflectiveQuadToRelative(14f, 14f)
                lineToRelative(173f, 273f)
                lineToRelative(173f, -273f)
                quadToRelative(5f, -9f, 14f, -14f)
                reflectiveQuadToRelative(20f, -5f)
                quadToRelative(24f, 0f, 35.5f, 21f)
                reflectiveQuadToRelative(-1.5f, 41f)
                lineTo(531f, 480f)
                horizontalLineToRelative(149f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 560f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                close()
            }
        }.build()
        
        return _Currency_yuan!!
    }

private var _Currency_yuan: ImageVector? = null

