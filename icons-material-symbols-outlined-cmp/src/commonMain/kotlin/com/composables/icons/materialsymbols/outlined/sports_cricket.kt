package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sports_cricket: ImageVector
    get() {
        if (_Sports_cricket != null) return _Sports_cricket!!
        
        _Sports_cricket = ImageVector.Builder(
            name = "sports_cricket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 568f)
                lineTo(488f, 680f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(92f, 340f)
                quadToRelative(-12f, -12f, -12f, -27f)
                reflectiveQuadToRelative(12f, -27f)
                lineToRelative(112f, -112f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                lineToRelative(338f, 338f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                close()
                moveToRelative(-140f, 28f)
                lineToRelative(56f, -56f)
                lineToRelative(-284f, -284f)
                lineToRelative(-56f, 56f)
                lineToRelative(284f, 284f)
                close()
                moveTo(744f, 880f)
                lineTo(574f, 710f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-4f, -520f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(800f, 220f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(740f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(680f, 220f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(740f, 280f)
                close()
                moveToRelative(0f, -60f)
                close()
                moveTo(346f, 426f)
                close()
            }
        }.build()
        
        return _Sports_cricket!!
    }

private var _Sports_cricket: ImageVector? = null

