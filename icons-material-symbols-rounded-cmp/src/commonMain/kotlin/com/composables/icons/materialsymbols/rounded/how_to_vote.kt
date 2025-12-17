package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.How_to_vote: ImageVector
    get() {
        if (_How_to_vote != null) return _How_to_vote!!
        
        _How_to_vote = ImageVector.Builder(
            name = "how_to_vote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-152f)
                quadToRelative(0f, -14f, 5f, -28f)
                reflectiveQuadToRelative(15f, -25f)
                lineToRelative(62f, -70f)
                quadToRelative(11f, -13f, 28.5f, -13.5f)
                reflectiveQuadTo(260f, 523f)
                quadToRelative(11f, 11f, 12f, 27f)
                reflectiveQuadToRelative(-10f, 28f)
                lineToRelative(-55f, 62f)
                horizontalLineToRelative(546f)
                lineToRelative(-53f, -60f)
                quadToRelative(-11f, -12f, -10f, -28f)
                reflectiveQuadToRelative(12f, -27f)
                quadToRelative(12f, -12f, 29.5f, -11.5f)
                reflectiveQuadTo(760f, 527f)
                lineToRelative(60f, 68f)
                quadToRelative(10f, 11f, 15f, 25f)
                reflectiveQuadToRelative(5f, 28f)
                verticalLineToRelative(152f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(225f, -225f)
                lineTo(284f, 434f)
                quadToRelative(-23f, -23f, -22.5f, -56.5f)
                reflectiveQuadTo(285f, 321f)
                lineToRelative(196f, -196f)
                quadToRelative(23f, -23f, 57f, -24f)
                reflectiveQuadToRelative(57f, 22f)
                lineToRelative(141f, 141f)
                quadToRelative(23f, 23f, 24f, 56f)
                reflectiveQuadToRelative(-22f, 56f)
                lineTo(538f, 576f)
                quadToRelative(-23f, 23f, -56.5f, 22.5f)
                reflectiveQuadTo(425f, 575f)
                close()
                moveToRelative(255f, -254f)
                lineTo(539f, 180f)
                lineTo(341f, 378f)
                lineToRelative(141f, 141f)
                lineToRelative(198f, -198f)
                close()
                moveTo(200f, 800f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _How_to_vote!!
    }

private var _How_to_vote: ImageVector? = null

