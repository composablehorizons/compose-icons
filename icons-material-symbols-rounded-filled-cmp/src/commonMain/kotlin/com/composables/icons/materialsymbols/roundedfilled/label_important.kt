package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Label_important: ImageVector
    get() {
        if (_Label_important != null) return _Label_important!!
        
        _Label_important = ImageVector.Builder(
            name = "label_important",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(267f, 760f)
                quadToRelative(-48f, 0f, -71f, -41.5f)
                reflectiveQuadToRelative(3f, -81.5f)
                lineToRelative(101f, -157f)
                lineToRelative(-101f, -157f)
                quadToRelative(-26f, -40f, -3f, -81.5f)
                reflectiveQuadToRelative(71f, -41.5f)
                horizontalLineToRelative(333f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(141f, 200f)
                quadToRelative(15f, 21f, 15f, 46f)
                reflectiveQuadToRelative(-15f, 46f)
                lineTo(666f, 726f)
                quadToRelative(-11f, 16f, -28.5f, 25f)
                reflectiveQuadToRelative(-37.5f, 9f)
                horizontalLineTo(267f)
                close()
            }
        }.build()
        
        return _Label_important!!
    }

private var _Label_important: ImageVector? = null

