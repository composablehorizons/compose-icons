package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mosque: ImageVector
    get() {
        if (_Mosque != null) return _Mosque!!
        
        _Mosque = ImageVector.Builder(
            name = "mosque",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(278f, 322f)
                quadToRelative(-21f, 0f, -29.5f, -8.5f)
                reflectiveQuadTo(240f, 284f)
                quadToRelative(0f, -40f, 19f, -74f)
                reflectiveQuadToRelative(51f, -56f)
                lineToRelative(125f, -84f)
                quadToRelative(20f, -14f, 45f, -14f)
                reflectiveQuadToRelative(45f, 14f)
                lineToRelative(125f, 84f)
                quadToRelative(32f, 22f, 51f, 56f)
                reflectiveQuadToRelative(19f, 74f)
                quadToRelative(0f, 21f, -8.5f, 29.5f)
                reflectiveQuadTo(682f, 322f)
                horizontalLineTo(278f)
                close()
                moveTo(40f, 760f)
                verticalLineToRelative(-411f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(0f, 280f)
                quadToRelative(0f, -23f, 24f, -56f)
                reflectiveQuadToRelative(56f, -64f)
                quadToRelative(32f, 31f, 56f, 64f)
                reflectiveQuadToRelative(24f, 56f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(120f, 349f)
                verticalLineToRelative(171f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -25f, 16f, -48f)
                reflectiveQuadToRelative(46f, -30f)
                horizontalLineToRelative(436f)
                quadToRelative(30f, 7f, 46f, 30f)
                reflectiveQuadToRelative(16f, 48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-171f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(800f, 280f)
                quadToRelative(0f, -23f, 24f, -56f)
                reflectiveQuadToRelative(56f, -64f)
                quadToRelative(32f, 31f, 56f, 64f)
                reflectiveQuadToRelative(24f, 56f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(920f, 349f)
                verticalLineToRelative(411f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                close()
            }
        }.build()
        
        return _Mosque!!
    }

private var _Mosque: ImageVector? = null

