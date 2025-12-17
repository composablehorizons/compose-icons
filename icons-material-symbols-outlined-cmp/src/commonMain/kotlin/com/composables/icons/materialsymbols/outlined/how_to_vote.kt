package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.How_to_vote: ImageVector
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
                verticalLineToRelative(-182f)
                lineToRelative(110f, -125f)
                lineToRelative(57f, 57f)
                lineToRelative(-80f, 90f)
                horizontalLineToRelative(546f)
                lineToRelative(-78f, -88f)
                lineToRelative(57f, -57f)
                lineToRelative(108f, 123f)
                verticalLineToRelative(182f)
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

