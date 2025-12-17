package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_play: ImageVector
    get() {
        if (_Person_play != null) return _Person_play!!
        
        _Person_play = ImageVector.Builder(
            name = "person_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 496f)
                lineTo(64f, 340f)
                lineToRelative(156f, -156f)
                lineToRelative(156f, 156f)
                lineToRelative(-156f, 156f)
                close()
                moveTo(360f, 880f)
                verticalLineToRelative(-200f)
                quadToRelative(-61f, -5f, -121f, -14.5f)
                reflectiveQuadTo(120f, 640f)
                lineToRelative(20f, -80f)
                quadToRelative(84f, 23f, 168.5f, 31.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(87f, 0f, 171.5f, -8.5f)
                reflectiveQuadTo(820f, 560f)
                lineToRelative(20f, 80f)
                quadToRelative(-59f, 16f, -119f, 25.5f)
                reflectiveQuadTo(600f, 680f)
                verticalLineToRelative(200f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -600f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(202f, -80f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(136f)
                lineToRelative(68f, 120f)
                lineToRelative(-68f, 120f)
                horizontalLineTo(682f)
                close()
            }
        }.build()
        
        return _Person_play!!
    }

private var _Person_play: ImageVector? = null

