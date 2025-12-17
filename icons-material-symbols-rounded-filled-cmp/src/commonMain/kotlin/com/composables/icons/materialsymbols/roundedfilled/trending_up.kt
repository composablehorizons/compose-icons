package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Trending_up: ImageVector
    get() {
        if (_Trending_up != null) return _Trending_up!!
        
        _Trending_up = ImageVector.Builder(
            name = "trending_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(108f, 705f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(108f, 649f)
                lineToRelative(211f, -214f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(103f, 104f)
                lineToRelative(208f, -206f)
                horizontalLineToRelative(-64f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 293f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 253f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 293f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 493f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 453f)
                verticalLineToRelative(-64f)
                lineTo(593f, 596f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(376f, 493f)
                lineTo(164f, 705f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Trending_up!!
    }

private var _Trending_up: ImageVector? = null

