package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sports_soccer: ImageVector
    get() {
        if (_Sports_soccer != null) return _Sports_soccer!!
        
        _Sports_soccer = ImageVector.Builder(
            name = "sports_soccer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(200f, -500f)
                lineToRelative(54f, -18f)
                lineToRelative(16f, -54f)
                quadToRelative(-32f, -48f, -77f, -82.5f)
                reflectiveQuadTo(574f, 174f)
                lineToRelative(-54f, 38f)
                verticalLineToRelative(56f)
                lineToRelative(160f, 112f)
                close()
                moveToRelative(-400f, 0f)
                lineToRelative(160f, -112f)
                verticalLineToRelative(-56f)
                lineToRelative(-54f, -38f)
                quadToRelative(-54f, 17f, -99f, 51.5f)
                reflectiveQuadTo(210f, 308f)
                lineToRelative(16f, 54f)
                lineToRelative(54f, 18f)
                close()
                moveToRelative(-42f, 308f)
                lineToRelative(46f, -4f)
                lineToRelative(30f, -54f)
                lineToRelative(-58f, -174f)
                lineToRelative(-56f, -20f)
                lineToRelative(-40f, 30f)
                quadToRelative(0f, 65f, 18f, 118.5f)
                reflectiveQuadTo(238f, 688f)
                close()
                moveToRelative(242f, 112f)
                quadToRelative(26f, 0f, 51f, -4f)
                reflectiveQuadToRelative(49f, -12f)
                lineToRelative(28f, -60f)
                lineToRelative(-26f, -44f)
                horizontalLineTo(378f)
                lineToRelative(-26f, 44f)
                lineToRelative(28f, 60f)
                quadToRelative(24f, 8f, 49f, 12f)
                reflectiveQuadToRelative(51f, 4f)
                close()
                moveToRelative(-90f, -200f)
                horizontalLineToRelative(180f)
                lineToRelative(56f, -160f)
                lineToRelative(-146f, -102f)
                lineToRelative(-144f, 102f)
                lineToRelative(54f, 160f)
                close()
                moveToRelative(332f, 88f)
                quadToRelative(42f, -50f, 60f, -103.5f)
                reflectiveQuadTo(800f, 466f)
                lineToRelative(-40f, -28f)
                lineToRelative(-56f, 18f)
                lineToRelative(-58f, 174f)
                lineToRelative(30f, 54f)
                lineToRelative(46f, 4f)
                close()
            }
        }.build()
        
        return _Sports_soccer!!
    }

private var _Sports_soccer: ImageVector? = null

