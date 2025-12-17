package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Filter_list: ImageVector
    get() {
        if (_Filter_list != null) return _Filter_list!!
        
        _Filter_list = ImageVector.Builder(
            name = "filter_list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveTo(240f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveTo(120f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Filter_list!!
    }

private var _Filter_list: ImageVector? = null

