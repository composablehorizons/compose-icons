package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Directions_bike: ImageVector
    get() {
        if (_Directions_bike != null) return _Directions_bike!!
        
        _Directions_bike = ImageVector.Builder(
            name = "directions_bike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 220f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(540f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(620f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(700f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(620f, 220f)
                close()
                moveTo(432f, 420f)
                lineToRelative(88f, 92f)
                verticalLineToRelative(248f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                lineTo(312f, 448f)
                quadToRelative(-14f, -12f, -19f, -25f)
                reflectiveQuadToRelative(-5f, -31f)
                quadToRelative(0f, -18f, 5.5f, -30.5f)
                reflectiveQuadTo(312f, 336f)
                lineToRelative(112f, -112f)
                quadToRelative(13f, -13f, 27.5f, -18.5f)
                reflectiveQuadTo(484f, 200f)
                quadToRelative(18f, 0f, 32.5f, 5.5f)
                reflectiveQuadTo(544f, 224f)
                lineToRelative(76f, 76f)
                quadToRelative(27f, 27f, 63f, 43.5f)
                reflectiveQuadToRelative(81f, 16.5f)
                verticalLineToRelative(80f)
                quadToRelative(-63f, 0f, -114f, -22.5f)
                reflectiveQuadTo(560f, 356f)
                lineToRelative(-32f, -32f)
                lineToRelative(-96f, 96f)
                close()
                moveToRelative(-232f, 60f)
                quadToRelative(85f, 0f, 142.5f, 57.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, 85f, -57.5f, 142.5f)
                reflectiveQuadTo(200f, 880f)
                quadToRelative(-85f, 0f, -142.5f, -57.5f)
                reflectiveQuadTo(0f, 680f)
                quadToRelative(0f, -85f, 57.5f, -142.5f)
                reflectiveQuadTo(200f, 480f)
                close()
                moveToRelative(0f, 340f)
                quadToRelative(57f, 0f, 98.5f, -41.5f)
                reflectiveQuadTo(340f, 680f)
                quadToRelative(0f, -57f, -41.5f, -98.5f)
                reflectiveQuadTo(200f, 540f)
                quadToRelative(-57f, 0f, -98.5f, 41.5f)
                reflectiveQuadTo(60f, 680f)
                quadToRelative(0f, 57f, 41.5f, 98.5f)
                reflectiveQuadTo(200f, 820f)
                close()
                moveToRelative(560f, -340f)
                quadToRelative(85f, 0f, 142.5f, 57.5f)
                reflectiveQuadTo(960f, 680f)
                quadToRelative(0f, 85f, -57.5f, 142.5f)
                reflectiveQuadTo(760f, 880f)
                quadToRelative(-85f, 0f, -142.5f, -57.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, -85f, 57.5f, -142.5f)
                reflectiveQuadTo(760f, 480f)
                close()
                moveToRelative(0f, 340f)
                quadToRelative(57f, 0f, 98.5f, -41.5f)
                reflectiveQuadTo(900f, 680f)
                quadToRelative(0f, -57f, -41.5f, -98.5f)
                reflectiveQuadTo(760f, 540f)
                quadToRelative(-57f, 0f, -98.5f, 41.5f)
                reflectiveQuadTo(620f, 680f)
                quadToRelative(0f, 57f, 41.5f, 98.5f)
                reflectiveQuadTo(760f, 820f)
                close()
            }
        }.build()
        
        return _Directions_bike!!
    }

private var _Directions_bike: ImageVector? = null

