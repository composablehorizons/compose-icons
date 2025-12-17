package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Process_chart: ImageVector
    get() {
        if (_Process_chart != null) return _Process_chart!!
        
        _Process_chart = ImageVector.Builder(
            name = "process_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(132f, 738f)
                lineToRelative(-72f, -36f)
                lineToRelative(240f, -480f)
                lineToRelative(72f, 36f)
                lineToRelative(-240f, 480f)
                close()
                moveToRelative(264f, 0f)
                lineToRelative(-72f, -36f)
                lineToRelative(240f, -480f)
                lineToRelative(72f, 36f)
                lineToRelative(-240f, 480f)
                close()
                moveToRelative(264f, 0f)
                lineToRelative(-72f, -36f)
                lineToRelative(240f, -480f)
                lineToRelative(72f, 36f)
                lineToRelative(-240f, 480f)
                close()
            }
        }.build()
        
        return _Process_chart!!
    }

private var _Process_chart: ImageVector? = null

