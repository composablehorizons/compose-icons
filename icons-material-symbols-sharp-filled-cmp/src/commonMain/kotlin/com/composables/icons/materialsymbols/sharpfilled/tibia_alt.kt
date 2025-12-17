package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tibia_alt: ImageVector
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
                moveTo(394f, 880f)
                quadToRelative(-16f, -47f, -24f, -92f)
                reflectiveQuadToRelative(-10f, -86f)
                quadToRelative(-2f, -41f, -0.5f, -75f)
                reflectiveQuadToRelative(4.5f, -58f)
                quadToRelative(0f, -1f, 0f, 0f)
                quadToRelative(-22f, -5f, -50.5f, -12.5f)
                reflectiveQuadToRelative(-61f, -20.5f)
                quadTo(220f, 523f, 186f, 504.5f)
                reflectiveQuadTo(119f, 460f)
                lineToRelative(243f, -339f)
                lineToRelative(257f, 117f)
                quadToRelative(64f, 29f, 102.5f, 88f)
                reflectiveQuadTo(760f, 457f)
                verticalLineToRelative(423f)
                horizontalLineTo(394f)
                close()
                moveToRelative(146f, -121f)
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

