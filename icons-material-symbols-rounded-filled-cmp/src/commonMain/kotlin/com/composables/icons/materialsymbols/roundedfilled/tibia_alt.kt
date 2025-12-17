package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tibia_alt: ImageVector
    get() {
        if (_Tibia_alt != null) return _Tibia_alt!!
        
        _Tibia_alt = ImageVector.Builder(
            name = "tibia_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(721f, 326f)
                quadToRelative(19f, 29f, 29f, 62f)
                reflectiveQuadToRelative(10f, 69f)
                verticalLineToRelative(363f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 880f)
                horizontalLineTo(430f)
                quadToRelative(-17f, 0f, -29.5f, -9.5f)
                reflectiveQuadTo(383f, 845f)
                quadToRelative(-12f, -42f, -17f, -82f)
                reflectiveQuadToRelative(-6.5f, -76f)
                quadToRelative(-1.5f, -36f, 0.5f, -66f)
                reflectiveQuadToRelative(4f, -52f)
                quadToRelative(0f, -1f, 0f, 0f)
                quadToRelative(-37f, -8f, -92.5f, -26f)
                reflectiveQuadTo(159f, 489f)
                quadToRelative(-17f, -11f, -20f, -31.5f)
                reflectiveQuadToRelative(9f, -37.5f)
                lineToRelative(185f, -259f)
                quadToRelative(13f, -17f, 33.5f, -23f)
                reflectiveQuadToRelative(40.5f, 3f)
                lineToRelative(212f, 97f)
                quadToRelative(32f, 14f, 57.5f, 36.5f)
                reflectiveQuadTo(721f, 326f)
                close()
                moveTo(540f, 759f)
                quadToRelative(9f, 0f, 17f, -4f)
                reflectiveQuadToRelative(13f, -10f)
                quadToRelative(6f, 6f, 14f, 10f)
                reflectiveQuadToRelative(16f, 4f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 719f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 679f)
                verticalLineToRelative(-159f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(-8f, 0f, -16f, 3.5f)
                reflectiveQuadToRelative(-14f, 9.5f)
                quadToRelative(-5f, -6f, -13f, -9.5f)
                reflectiveQuadToRelative(-17f, -3.5f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 520f)
                verticalLineToRelative(159f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 719f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 759f)
                close()
            }
        }.build()
        
        return _Tibia_alt!!
    }

private var _Tibia_alt: ImageVector? = null

