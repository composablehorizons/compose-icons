package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shield_spark: ImageVector
    get() {
        if (_Shield_spark != null) return _Shield_spark!!
        
        _Shield_spark = ImageVector.Builder(
            name = "shield_spark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(0f, -84f, 58f, -142f)
                reflectiveQuadToRelative(142f, -58f)
                quadToRelative(-84f, 0f, -142f, -58f)
                reflectiveQuadToRelative(-58f, -142f)
                quadToRelative(0f, 84f, -58f, 142f)
                reflectiveQuadToRelative(-142f, 58f)
                quadToRelative(84f, 0f, 142f, 58f)
                reflectiveQuadToRelative(58f, 142f)
                close()
            }
        }.build()
        
        return _Shield_spark!!
    }

private var _Shield_spark: ImageVector? = null

