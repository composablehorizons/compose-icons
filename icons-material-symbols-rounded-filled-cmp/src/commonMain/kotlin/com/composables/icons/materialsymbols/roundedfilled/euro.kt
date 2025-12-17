package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Euro: ImageVector
    get() {
        if (_Euro != null) return _Euro!!
        
        _Euro = ImageVector.Builder(
            name = "euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                quadToRelative(-118f, 0f, -210f, -67f)
                reflectiveQuadTo(260f, 600f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(-3f, -24f, -2.5f, -44.5f)
                reflectiveQuadTo(242f, 440f)
                horizontalLineToRelative(-82f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(100f)
                quadToRelative(38f, -106f, 130f, -173f)
                reflectiveQuadToRelative(210f, -67f)
                quadToRelative(58f, 0f, 110.5f, 17f)
                reflectiveQuadToRelative(97.5f, 49f)
                quadToRelative(14f, 10f, 15f, 26.5f)
                reflectiveQuadTo(812f, 240f)
                quadToRelative(-12f, 12f, -29f, 12.5f)
                reflectiveQuadToRelative(-31f, -8.5f)
                quadToRelative(-33f, -21f, -71.5f, -32.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(-85f, 0f, -152f, 44.5f)
                reflectiveQuadTo(347f, 360f)
                horizontalLineToRelative(213f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineTo(323f)
                quadToRelative(-4f, 27f, -3f, 47.5f)
                reflectiveQuadToRelative(3f, 32.5f)
                horizontalLineToRelative(237f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 600f)
                horizontalLineTo(347f)
                quadToRelative(34f, 71f, 101f, 115.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(42f, 0f, 80.5f, -12f)
                reflectiveQuadToRelative(71.5f, -33f)
                quadToRelative(14f, -9f, 31f, -8f)
                reflectiveQuadToRelative(29f, 13f)
                quadToRelative(12f, 11f, 11f, 27.5f)
                reflectiveQuadTo(808f, 774f)
                quadToRelative(-45f, 32f, -97.5f, 49f)
                reflectiveQuadTo(600f, 840f)
                close()
            }
        }.build()
        
        return _Euro!!
    }

private var _Euro: ImageVector? = null

