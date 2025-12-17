package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Art_track: ImageVector
    get() {
        if (_Art_track != null) return _Art_track!!
        
        _Art_track = ImageVector.Builder(
            name = "art_track",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 760f)
                horizontalLineTo(120f)
                close()
                moveToRelative(180f, -200f)
                lineToRelative(-40f, -53f)
                quadToRelative(-6f, -8f, -16f, -7.5f)
                reflectiveQuadToRelative(-16f, 8.5f)
                lineToRelative(-45f, 60f)
                quadToRelative(-8f, 10f, -1.5f, 21f)
                reflectiveQuadToRelative(18.5f, 11f)
                horizontalLineToRelative(240f)
                quadToRelative(12f, 0f, 18f, -11f)
                reflectiveQuadToRelative(-2f, -21f)
                lineToRelative(-64f, -87f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-60f, 79f)
                close()
                moveToRelative(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 760f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 760f)
                close()
            }
        }.build()
        
        return _Art_track!!
    }

private var _Art_track: ImageVector? = null

