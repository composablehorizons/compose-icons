package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Quick_phrases: ImageVector
    get() {
        if (_Quick_phrases != null) return _Quick_phrases!!
        
        _Quick_phrases = ImageVector.Builder(
            name = "quick_phrases",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 844f)
                quadToRelative(-16f, 0f, -28f, -11.5f)
                reflectiveQuadTo(320f, 803f)
                verticalLineToRelative(-124f)
                quadToRelative(-101f, -8f, -170.5f, -82f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(340f, 160f)
                horizontalLineToRelative(27f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(388f, 332f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(332f, 332f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                horizontalLineToRelative(-27f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(160f, 420f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(340f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(107f)
                lineToRelative(107f, -107f)
                horizontalLineToRelative(113f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(620f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(580f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(620f, 160f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(880f, 420f)
                quadToRelative(0f, 109f, -75.5f, 184.5f)
                reflectiveQuadTo(620f, 680f)
                horizontalLineToRelative(-80f)
                lineTo(388f, 832f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                close()
            }
        }.build()
        
        return _Quick_phrases!!
    }

private var _Quick_phrases: ImageVector? = null

