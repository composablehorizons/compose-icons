package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`2d`: ImageVector
    get() {
        if (_2d != null) return _2d!!
        
        _2d = ImageVector.Builder(
            name = "2d",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 540f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 460f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                horizontalLineTo(290f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(260f, 390f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(290f, 420f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(260f, 500f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(290f, 600f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 570f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 540f)
                horizontalLineToRelative(-90f)
                close()
                moveToRelative(230f, 60f)
                horizontalLineToRelative(110f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 360f)
                horizontalLineTo(550f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 600f)
                close()
                moveToRelative(30f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _2d!!
    }

private var _2d: ImageVector? = null

