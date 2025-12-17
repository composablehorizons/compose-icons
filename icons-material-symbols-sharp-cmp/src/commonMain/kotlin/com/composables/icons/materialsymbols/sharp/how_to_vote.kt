package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.How_to_vote: ImageVector
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
                moveTo(120f, 880f)
                verticalLineToRelative(-262f)
                lineToRelative(110f, -125f)
                lineToRelative(57f, 57f)
                lineToRelative(-80f, 90f)
                horizontalLineToRelative(546f)
                lineToRelative(-78f, -88f)
                lineToRelative(57f, -57f)
                lineToRelative(108f, 123f)
                verticalLineToRelative(262f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(282f, -168f)
                lineTo(228f, 378f)
                lineToRelative(311f, -311f)
                lineToRelative(254f, 254f)
                lineToRelative(-311f, 311f)
                close()
                moveToRelative(0f, -113f)
                lineToRelative(198f, -198f)
                lineToRelative(-141f, -141f)
                lineToRelative(-198f, 198f)
                lineToRelative(141f, 141f)
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

