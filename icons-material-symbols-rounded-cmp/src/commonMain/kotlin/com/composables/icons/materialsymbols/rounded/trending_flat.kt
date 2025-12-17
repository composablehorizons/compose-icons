package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Trending_flat: ImageVector
    get() {
        if (_Trending_flat != null) return _Trending_flat!!
        
        _Trending_flat = ImageVector.Builder(
            name = "trending_flat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(727f, 520f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                horizontalLineToRelative(567f)
                lineToRelative(-55f, -56f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                quadToRelative(12f, -11f, 28.5f, -11.5f)
                reflectiveQuadTo(729f, 328f)
                lineToRelative(123f, 124f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(728f, 632f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(672f, 632f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(55f, -55f)
                close()
            }
        }.build()
        
        return _Trending_flat!!
    }

private var _Trending_flat: ImageVector? = null

