package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shuffle_on: ImageVector
    get() {
        if (_Shuffle_on != null) return _Shuffle_on!!
        
        _Shuffle_on = ImageVector.Builder(
            name = "shuffle_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 40f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, -120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(62f)
                lineToRelative(-97f, -97f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(566f, 565f)
                quadToRelative(-12f, 12f, -12.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(99f, 99f)
                horizontalLineToRelative(-64f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 800f)
                close()
                moveToRelative(-428f, -12f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(492f, -492f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 160f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 240f)
                horizontalLineToRelative(64f)
                lineTo(172f, 732f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                close()
                moveToRelative(-1f, -560f)
                lineToRelative(168f, 167f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(12f, -12f, 11.5f, -28.5f)
                reflectiveQuadTo(395f, 339f)
                lineTo(227f, 172f)
                quadToRelative(-12f, -11f, -28.5f, -11f)
                reflectiveQuadTo(171f, 172f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                close()
            }
        }.build()
        
        return _Shuffle_on!!
    }

private var _Shuffle_on: ImageVector? = null

