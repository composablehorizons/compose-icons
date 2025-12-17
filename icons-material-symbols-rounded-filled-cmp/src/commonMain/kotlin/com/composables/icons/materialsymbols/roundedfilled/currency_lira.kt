package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Currency_lira: ImageVector
    get() {
        if (_Currency_lira != null) return _Currency_lira!!
        
        _Currency_lira = ImageVector.Builder(
            name = "currency_lira",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-166f)
                lineToRelative(-59f, 37f)
                quadToRelative(-20f, 13f, -40.5f, 1f)
                reflectiveQuadTo(240f, 636f)
                quadToRelative(0f, -11f, 5f, -20f)
                reflectiveQuadToRelative(14f, -14f)
                lineToRelative(101f, -63f)
                verticalLineToRelative(-94f)
                lineToRelative(-59f, 37f)
                quadToRelative(-20f, 12f, -40.5f, 1f)
                reflectiveQuadTo(240f, 448f)
                quadToRelative(0f, -11f, 5f, -20f)
                reflectiveQuadToRelative(13f, -14f)
                lineToRelative(102f, -64f)
                verticalLineToRelative(-190f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(140f)
                lineToRelative(99f, -62f)
                quadToRelative(20f, -13f, 40.5f, -1.5f)
                reflectiveQuadTo(600f, 272f)
                quadToRelative(0f, 11f, -5f, 20f)
                reflectiveQuadToRelative(-14f, 14f)
                lineToRelative(-141f, 89f)
                verticalLineToRelative(94f)
                lineToRelative(99f, -62f)
                quadToRelative(20f, -13f, 40.5f, -1.5f)
                reflectiveQuadTo(600f, 461f)
                quadToRelative(0f, 11f, -5f, 20f)
                reflectiveQuadToRelative(-14f, 14f)
                lineToRelative(-141f, 89f)
                verticalLineToRelative(176f)
                quadToRelative(75f, 0f, 130f, -48f)
                reflectiveQuadToRelative(67f, -120f)
                quadToRelative(2f, -15f, 14.5f, -23.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11f)
                reflectiveQuadToRelative(9.5f, 26f)
                quadToRelative(-14f, 104f, -92f, 173.5f)
                reflectiveQuadTo(440f, 840f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                close()
            }
        }.build()
        
        return _Currency_lira!!
    }

private var _Currency_lira: ImageVector? = null

