package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Remove_done: ImageVector
    get() {
        if (_Remove_done != null) return _Remove_done!!
        
        _Remove_done = ImageVector.Builder(
            name = "remove_done",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(845f, 844f)
                lineTo(609f, 608f)
                lineToRelative(-86f, 86f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(297f, 524f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(354f, 467f)
                lineToRelative(141f, 141f)
                lineToRelative(56f, -56f)
                lineToRelative(-386f, -386f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(222f, 109f)
                lineToRelative(679f, 679f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(241f, 694f)
                lineTo(71f, 524f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(142f, 142f)
                lineToRelative(56f, 56f)
                lineToRelative(-28f, 28f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(480f, -198f)
                lineToRelative(-56f, -56f)
                lineToRelative(169f, -169f)
                quadToRelative(11f, -11f, 27f, -11.5f)
                reflectiveQuadToRelative(28f, 10.5f)
                quadToRelative(12f, 11f, 12.5f, 28f)
                reflectiveQuadTo(890f, 327f)
                lineTo(721f, 496f)
                close()
                moveTo(607f, 382f)
                lineToRelative(-56f, -56f)
                lineToRelative(58f, -58f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-58f, 58f)
                close()
            }
        }.build()
        
        return _Remove_done!!
    }

private var _Remove_done: ImageVector? = null

