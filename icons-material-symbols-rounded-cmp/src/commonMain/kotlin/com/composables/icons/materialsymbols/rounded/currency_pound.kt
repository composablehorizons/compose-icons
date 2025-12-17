package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Currency_pound: ImageVector
    get() {
        if (_Currency_pound != null) return _Currency_pound!!
        
        _Currency_pound = ImageVector.Builder(
            name = "currency_pound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-18f)
                quadToRelative(0f, -11f, 5f, -20f)
                reflectiveQuadToRelative(13f, -14f)
                quadToRelative(38f, -25f, 62f, -63f)
                reflectiveQuadToRelative(24f, -85f)
                quadToRelative(0f, -11f, -1.5f, -21f)
                reflectiveQuadToRelative(-3.5f, -19f)
                horizontalLineToRelative(-59f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineToRelative(20f)
                quadToRelative(-21f, -33f, -40.5f, -69.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(61f, 0f, 110.5f, 29.5f)
                reflectiveQuadTo(649f, 207f)
                quadToRelative(8f, 14f, 1f, 28f)
                reflectiveQuadToRelative(-22f, 21f)
                quadToRelative(-15f, 6f, -29.5f, 0.5f)
                reflectiveQuadTo(574f, 238f)
                quadToRelative(-19f, -26f, -49f, -42f)
                reflectiveQuadToRelative(-65f, -16f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 48f, 24f, 80f)
                reflectiveQuadToRelative(49f, 80f)
                horizontalLineToRelative(127f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 560f)
                horizontalLineToRelative(-99f)
                quadToRelative(2f, 9f, 2.5f, 19f)
                reflectiveQuadToRelative(0.5f, 21f)
                quadToRelative(0f, 50f, -17.5f, 90f)
                reflectiveQuadTo(364f, 760f)
                horizontalLineToRelative(196f)
                quadToRelative(35f, 0f, 57f, -16.5f)
                reflectiveQuadToRelative(29f, -44.5f)
                quadToRelative(4f, -15f, 13.5f, -25.5f)
                reflectiveQuadTo(685f, 663f)
                quadToRelative(17f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 61f, -54.5f, 99f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Currency_pound!!
    }

private var _Currency_pound: ImageVector? = null

