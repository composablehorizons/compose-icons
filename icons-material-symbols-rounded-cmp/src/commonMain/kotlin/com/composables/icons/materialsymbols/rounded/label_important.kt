package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Label_important: ImageVector
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
                moveToRelative(333f, -80f)
                lineToRelative(142f, -200f)
                lineToRelative(-142f, -200f)
                horizontalLineTo(266f)
                lineToRelative(102f, 156f)
                quadToRelative(13f, 20f, 13f, 44f)
                reflectiveQuadToRelative(-13f, 44f)
                lineTo(266f, 680f)
                horizontalLineToRelative(334f)
                close()
                moveToRelative(-96f, -200f)
                close()
            }
        }.build()
        
        return _Label_important!!
    }

private var _Label_important: ImageVector? = null

