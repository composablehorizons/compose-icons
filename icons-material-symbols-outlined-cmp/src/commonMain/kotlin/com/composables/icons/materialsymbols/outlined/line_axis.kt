package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Line_axis: ImageVector
    get() {
        if (_Line_axis != null) return _Line_axis!!
        
        _Line_axis = ImageVector.Builder(
            name = "line_axis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(140f, 760f)
                lineToRelative(-60f, -60f)
                lineToRelative(300f, -300f)
                lineToRelative(160f, 160f)
                lineToRelative(67f, -76f)
                lineToRelative(-224f, -207f)
                lineToRelative(-243f, 243f)
                lineToRelative(-60f, -60f)
                lineToRelative(300f, -300f)
                lineToRelative(284f, 261f)
                lineToRelative(160f, -181f)
                lineToRelative(56f, 56f)
                lineToRelative(-158f, 178f)
                lineToRelative(158f, 146f)
                lineToRelative(-60f, 60f)
                lineToRelative(-154f, -142f)
                lineToRelative(-126f, 142f)
                lineToRelative(-160f, -160f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Line_axis!!
    }

private var _Line_axis: ImageVector? = null

