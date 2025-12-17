package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Communication: ImageVector
    get() {
        if (_Communication != null) return _Communication!!
        
        _Communication = ImageVector.Builder(
            name = "communication",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 640f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -59f, 57f, -78f)
                reflectiveQuadToRelative(103f, -19f)
                quadToRelative(46f, 0f, 103f, 19f)
                reflectiveQuadToRelative(57f, 78f)
                verticalLineToRelative(23f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 480f)
                close()
                moveToRelative(187f, 57f)
                quadToRelative(-12f, 0f, -21f, -9f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(0f, -6f, 9f, -21f)
                quadToRelative(8f, -10f, 11f, -22f)
                reflectiveQuadToRelative(3f, -24f)
                quadToRelative(0f, -12f, -3f, -23.5f)
                reflectiveQuadTo(366f, 395f)
                quadToRelative(-4f, -5f, -6.5f, -10.5f)
                reflectiveQuadTo(357f, 373f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(387f, 343f)
                quadToRelative(8f, 0f, 14.5f, 4.5f)
                reflectiveQuadTo(413f, 358f)
                quadToRelative(13f, 18f, 20f, 39f)
                reflectiveQuadToRelative(7f, 43f)
                quadToRelative(0f, 22f, -7f, 42.5f)
                reflectiveQuadTo(413f, 522f)
                quadToRelative(-5f, 6f, -11.5f, 10.5f)
                reflectiveQuadTo(387f, 537f)
                close()
                moveToRelative(85f, 86f)
                quadToRelative(-13f, 0f, -22f, -8.5f)
                reflectiveQuadToRelative(-9f, -21.5f)
                quadToRelative(0f, -6f, 2.5f, -11.5f)
                reflectiveQuadTo(450f, 571f)
                quadToRelative(25f, -28f, 37.5f, -62f)
                reflectiveQuadToRelative(12.5f, -69f)
                quadToRelative(0f, -35f, -12.5f, -68.5f)
                reflectiveQuadTo(450f, 310f)
                quadToRelative(-4f, -5f, -6.5f, -10f)
                reflectiveQuadToRelative(-2.5f, -11f)
                quadToRelative(0f, -13f, 8.5f, -22f)
                reflectiveQuadToRelative(21.5f, -9f)
                quadToRelative(7f, 0f, 13f, 3f)
                reflectiveQuadToRelative(11f, 8f)
                quadToRelative(33f, 37f, 49f, 81f)
                reflectiveQuadToRelative(16f, 90f)
                quadToRelative(0f, 46f, -16.5f, 90.5f)
                reflectiveQuadTo(495f, 612f)
                quadToRelative(-5f, 5f, -10.5f, 8f)
                reflectiveQuadToRelative(-12.5f, 3f)
                close()
                moveToRelative(128f, 17f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -59f, 57f, -78f)
                reflectiveQuadToRelative(103f, -19f)
                quadToRelative(46f, 0f, 103f, 19f)
                reflectiveQuadToRelative(57f, 78f)
                verticalLineToRelative(23f)
                horizontalLineTo(600f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 480f)
                close()
            }
        }.build()
        
        return _Communication!!
    }

private var _Communication: ImageVector? = null

