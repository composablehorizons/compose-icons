package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Browse_gallery: ImageVector
    get() {
        if (_Browse_gallery != null) return _Browse_gallery!!
        
        _Browse_gallery = ImageVector.Builder(
            name = "browse_gallery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 464f)
                verticalLineToRelative(-144f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                verticalLineToRelative(159f)
                quadToRelative(0f, 8f, 3f, 15.5f)
                reflectiveQuadToRelative(9f, 13.5f)
                lineToRelative(112f, 112f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineTo(400f, 464f)
                close()
                moveToRelative(480f, 16f)
                quadToRelative(0f, -72f, -33.5f, -133.5f)
                reflectiveQuadTo(754f, 247f)
                quadToRelative(-14f, -9f, -19f, -25f)
                reflectiveQuadToRelative(2f, -31f)
                quadToRelative(8f, -16f, 24f, -21f)
                reflectiveQuadToRelative(30f, 4f)
                quadToRelative(78f, 49f, 123.5f, 130f)
                reflectiveQuadTo(960f, 480f)
                quadToRelative(0f, 95f, -45.5f, 176f)
                reflectiveQuadTo(791f, 786f)
                quadToRelative(-14f, 9f, -30f, 4f)
                reflectiveQuadToRelative(-24f, -21f)
                quadToRelative(-7f, -15f, -2f, -31f)
                reflectiveQuadToRelative(19f, -25f)
                quadToRelative(59f, -38f, 92.5f, -99.5f)
                reflectiveQuadTo(880f, 480f)
                close()
                moveTo(360f, 840f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(360f, 840f)
                close()
            }
        }.build()
        
        return _Browse_gallery!!
    }

private var _Browse_gallery: ImageVector? = null

