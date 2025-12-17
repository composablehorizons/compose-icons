package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Moved_location: ImageVector
    get() {
        if (_Moved_location != null) return _Moved_location!!
        
        _Moved_location = ImageVector.Builder(
            name = "moved_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(717f, 630f)
                quadToRelative(-45f, 64f, -95.5f, 117f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -136f, 93f, -232f)
                reflectiveQuadToRelative(227f, -96f)
                quadToRelative(25f, 0f, 49.5f, 3.5f)
                reflectiveQuadTo(578f, 95f)
                quadToRelative(13f, 4f, 21f, 14f)
                reflectiveQuadToRelative(8f, 24f)
                quadToRelative(0f, 17f, -11.5f, 29f)
                reflectiveQuadTo(567f, 174f)
                quadToRelative(-11f, 0f, -14f, -3f)
                quadToRelative(-17f, -6f, -36f, -8.5f)
                reflectiveQuadToRelative(-37f, -2.5f)
                quadToRelative(-101f, 0f, -170.5f, 72.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162f)
                reflectiveQuadToRelative(181f, 203f)
                quadToRelative(56f, -51f, 99f, -96.5f)
                reflectiveQuadToRelative(71f, -90.5f)
                quadToRelative(7f, -11f, 16.5f, -18.5f)
                reflectiveQuadTo(688f, 560f)
                quadToRelative(17f, 0f, 29f, 12f)
                reflectiveQuadToRelative(12f, 29f)
                quadToRelative(0f, 8f, -3.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 14f)
                close()
                moveToRelative(33f, -252f)
                quadToRelative(-43f, -8f, -137.5f, 9f)
                reflectiveQuadTo(400f, 519f)
                quadToRelative(32f, -117f, 129f, -188f)
                reflectiveQuadToRelative(219f, -71f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(144f, 144f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(748f, 492f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(692f, 492f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(58f, -58f)
                close()
            }
        }.build()
        
        return _Moved_location!!
    }

private var _Moved_location: ImageVector? = null

