package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Done_all: ImageVector
    get() {
        if (_Done_all != null) return _Done_all!!
        
        _Done_all = ImageVector.Builder(
            name = "done_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 720f)
                lineTo(42f, 494f)
                lineToRelative(57f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(56f, 56f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(226f, 0f)
                lineTo(268f, 494f)
                lineToRelative(56f, -57f)
                lineToRelative(170f, 170f)
                lineToRelative(368f, -368f)
                lineToRelative(56f, 57f)
                lineToRelative(-424f, 424f)
                close()
                moveToRelative(0f, -226f)
                lineToRelative(-57f, -56f)
                lineToRelative(198f, -198f)
                lineToRelative(57f, 56f)
                lineToRelative(-198f, 198f)
                close()
            }
        }.build()
        
        return _Done_all!!
    }

private var _Done_all: ImageVector? = null

