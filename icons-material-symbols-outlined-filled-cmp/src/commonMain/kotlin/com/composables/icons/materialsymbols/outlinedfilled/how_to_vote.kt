package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.How_to_vote: ImageVector
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
                moveToRelative(224f, -304f)
                lineTo(285f, 435f)
                quadToRelative(-23f, -23f, -23f, -57f)
                reflectiveQuadToRelative(23f, -57f)
                lineToRelative(196f, -196f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(141f, 139f)
                quadToRelative(23f, 23f, 23.5f, 56.5f)
                reflectiveQuadTo(737f, 377f)
                lineTo(537f, 577f)
                quadToRelative(-23f, 23f, -56.5f, 22.5f)
                reflectiveQuadTo(424f, 576f)
                close()
                moveToRelative(256f, -256f)
                lineTo(538f, 180f)
                lineTo(340f, 378f)
                lineToRelative(142f, 140f)
                lineToRelative(198f, -198f)
                close()
            }
        }.build()
        
        return _How_to_vote!!
    }

private var _How_to_vote: ImageVector? = null

