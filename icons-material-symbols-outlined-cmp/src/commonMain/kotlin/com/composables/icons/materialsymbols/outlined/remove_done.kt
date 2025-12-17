package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Remove_done: ImageVector
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
                moveTo(873f, 872f)
                lineTo(609f, 608f)
                lineTo(495f, 722f)
                lineTo(269f, 496f)
                lineToRelative(56f, -58f)
                lineToRelative(170f, 170f)
                lineToRelative(56f, -56f)
                lineToRelative(-414f, -414f)
                lineToRelative(56f, -58f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(269f, 722f)
                lineTo(43f, 496f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(452f, -226f)
                lineToRelative(-56f, -56f)
                lineToRelative(196f, -196f)
                lineToRelative(58f, 54f)
                lineToRelative(-198f, 198f)
                close()
                moveTo(607f, 382f)
                lineToRelative(-56f, -56f)
                lineToRelative(86f, -86f)
                lineToRelative(56f, 56f)
                lineToRelative(-86f, 86f)
                close()
            }
        }.build()
        
        return _Remove_done!!
    }

private var _Remove_done: ImageVector? = null

