package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Database_upload: ImageVector
    get() {
        if (_Database_upload != null) return _Database_upload!!
        
        _Database_upload = ImageVector.Builder(
            name = "database_upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(441f, 739f)
                quadToRelative(2f, 27f, 8.5f, 52.5f)
                reflectiveQuadTo(467f, 840f)
                quadToRelative(-43f, -1f, -102.5f, -10f)
                reflectiveQuadToRelative(-114f, -28f)
                quadTo(196f, 783f, 158f, 753f)
                reflectiveQuadToRelative(-38f, -73f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 39f, 33.5f, 68f)
                reflectiveQuadToRelative(82f, 48f)
                quadTo(284f, 715f, 340f, 725.5f)
                reflectiveQuadTo(441f, 739f)
                close()
                moveToRelative(66f, -200f)
                quadToRelative(-19f, 22f, -33f, 47f)
                reflectiveQuadToRelative(-22f, 53f)
                quadToRelative(-45f, -2f, -102.5f, -12f)
                reflectiveQuadTo(241f, 598f)
                quadToRelative(-51f, -19f, -86f, -48f)
                reflectiveQuadToRelative(-35f, -70f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 44f, 41f, 74.5f)
                reflectiveQuadToRelative(98f, 49.5f)
                quadToRelative(57f, 19f, 118.5f, 27.5f)
                reflectiveQuadTo(480f, 540f)
                quadToRelative(6f, 0f, 12.5f, -0.5f)
                reflectiveQuadToRelative(14.5f, -0.5f)
                close()
                moveToRelative(-27f, -99f)
                quadToRelative(-150f, 0f, -255f, -47f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -66f, 105f, -113f)
                reflectiveQuadToRelative(255f, -47f)
                quadToRelative(150f, 0f, 255f, 47f)
                reflectiveQuadToRelative(105f, 113f)
                quadToRelative(0f, 66f, -105f, 113f)
                reflectiveQuadToRelative(-255f, 47f)
                close()
                moveToRelative(220f, 400f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-164f)
                lineToRelative(72f, 72f)
                lineToRelative(28f, -28f)
                lineToRelative(-120f, -120f)
                lineToRelative(-120f, 120f)
                lineToRelative(28f, 28f)
                lineToRelative(72f, -72f)
                verticalLineToRelative(164f)
                close()
                moveToRelative(20f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
            }
        }.build()
        
        return _Database_upload!!
    }

private var _Database_upload: ImageVector? = null

