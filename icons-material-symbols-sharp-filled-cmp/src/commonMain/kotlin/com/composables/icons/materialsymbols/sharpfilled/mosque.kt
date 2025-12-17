package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mosque: ImageVector
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
                moveTo(240f, 322f)
                verticalLineToRelative(-38f)
                quadToRelative(0f, -40f, 19f, -74f)
                reflectiveQuadToRelative(51f, -56f)
                lineToRelative(170f, -114f)
                lineToRelative(170f, 114f)
                quadToRelative(32f, 22f, 51f, 56f)
                reflectiveQuadToRelative(19f, 74f)
                verticalLineToRelative(38f)
                horizontalLineTo(240f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-491f)
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
                verticalLineToRelative(-158f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(158f)
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
                verticalLineToRelative(491f)
                horizontalLineTo(560f)
                verticalLineToRelative(-240f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Mosque!!
    }

private var _Mosque: ImageVector? = null

