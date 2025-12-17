package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Manufacturing: ImageVector
    get() {
        if (_Manufacturing != null) return _Manufacturing!!
        
        _Manufacturing = ImageVector.Builder(
            name = "manufacturing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(234f, 480f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(178f, 396f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -13f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(222f, 140f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(370f, 164f)
                lineToRelative(58f, -18f)
                lineToRelative(40f, 68f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 13f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(326f, 420f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(354f, 280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(274f, 200f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(194f, 280f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(274f, 360f)
                close()
                moveTo(592f, 920f)
                lineToRelative(-18f, -84f)
                quadToRelative(-17f, -6f, -31.5f, -14.5f)
                reflectiveQuadTo(514f, 802f)
                lineToRelative(-80f, 26f)
                lineToRelative(-56f, -96f)
                lineToRelative(64f, -56f)
                quadToRelative(-2f, -18f, -2f, -36f)
                reflectiveQuadToRelative(2f, -36f)
                lineToRelative(-64f, -56f)
                lineToRelative(56f, -96f)
                lineToRelative(80f, 26f)
                quadToRelative(14f, -11f, 28.5f, -19.5f)
                reflectiveQuadTo(574f, 444f)
                lineToRelative(18f, -84f)
                horizontalLineToRelative(112f)
                lineToRelative(18f, 84f)
                quadToRelative(17f, 6f, 31.5f, 14.5f)
                reflectiveQuadTo(782f, 478f)
                lineToRelative(80f, -26f)
                lineToRelative(56f, 96f)
                lineToRelative(-64f, 56f)
                quadToRelative(2f, 18f, 2f, 36f)
                reflectiveQuadToRelative(-2f, 36f)
                lineToRelative(64f, 56f)
                lineToRelative(-56f, 96f)
                lineToRelative(-80f, -26f)
                quadToRelative(-14f, 11f, -28.5f, 19.5f)
                reflectiveQuadTo(722f, 836f)
                lineToRelative(-18f, 84f)
                horizontalLineTo(592f)
                close()
                moveToRelative(56f, -160f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()
        
        return _Manufacturing!!
    }

private var _Manufacturing: ImageVector? = null

