package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Lightning_stand: ImageVector
    get() {
        if (_Lightning_stand != null) return _Lightning_stand!!
        
        _Lightning_stand = ImageVector.Builder(
            name = "lightning_stand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-137f, 0f, -208.5f, -35.5f)
                reflectiveQuadTo(200f, 740f)
                quadToRelative(0f, -29f, 13f, -53f)
                reflectiveQuadToRelative(39f, -41f)
                quadToRelative(-6f, 8f, -9.5f, 19.5f)
                reflectiveQuadTo(239f, 691f)
                quadToRelative(0f, 38f, 27.5f, 60f)
                reflectiveQuadToRelative(66f, 33f)
                quadToRelative(38.5f, 11f, 79.5f, 13.5f)
                reflectiveQuadToRelative(68f, 2.5f)
                quadToRelative(27f, 0f, 68f, -2.5f)
                reflectiveQuadToRelative(79.5f, -13.5f)
                quadToRelative(38.5f, -11f, 66f, -33f)
                reflectiveQuadToRelative(27.5f, -60f)
                quadToRelative(0f, -14f, -3.5f, -25.5f)
                reflectiveQuadTo(708f, 646f)
                quadToRelative(26f, 17f, 39f, 41f)
                reflectiveQuadToRelative(13f, 53f)
                quadToRelative(0f, 69f, -71.5f, 104.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-92f, 0f, -146f, -21.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, -35f, 55.5f, -57.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(92f, 0f, 146f, 21.5f)
                reflectiveQuadToRelative(54f, 58.5f)
                quadToRelative(0f, 37f, -54f, 58.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(-40f, -200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                lineToRelative(160f, -280f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                lineTo(440f, 560f)
                close()
            }
        }.build()
        
        return _Lightning_stand!!
    }

private var _Lightning_stand: ImageVector? = null

