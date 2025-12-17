package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Where_to_vote: ImageVector
    get() {
        if (_Where_to_vote != null) return _Where_to_vote!!
        
        _Where_to_vote = ImageVector.Builder(
            name = "where_to_vote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 534f)
                lineToRelative(198f, -198f)
                lineToRelative(-57f, -57f)
                lineToRelative(-141f, 141f)
                lineToRelative(-56f, -56f)
                lineToRelative(-57f, 57f)
                lineToRelative(113f, 113f)
                close()
                moveToRelative(42f, 346f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Where_to_vote!!
    }

private var _Where_to_vote: ImageVector? = null

