package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Subdirectory_arrow_left: ImageVector
    get() {
        if (_Subdirectory_arrow_left != null) return _Subdirectory_arrow_left!!
        
        _Subdirectory_arrow_left = ImageVector.Builder(
            name = "subdirectory_arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                lineTo(160f, 600f)
                lineToRelative(241f, -241f)
                lineToRelative(56f, 57f)
                lineToRelative(-144f, 144f)
                horizontalLineToRelative(367f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineTo(313f)
                lineToRelative(144f, 143f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_left!!
    }

private var _Subdirectory_arrow_left: ImageVector? = null

