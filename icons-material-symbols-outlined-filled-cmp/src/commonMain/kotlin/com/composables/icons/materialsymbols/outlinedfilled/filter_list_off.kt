package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Filter_list_off: ImageVector
    get() {
        if (_Filter_list_off != null) return _Filter_list_off!!
        
        _Filter_list_off = ImageVector.Builder(
            name = "filter_list_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(633f, 520f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(167f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-87f)
                close()
                moveTo(433f, 320f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(487f)
                verticalLineToRelative(80f)
                horizontalLineTo(433f)
                close()
                moveToRelative(-33f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveTo(240f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveTo(120f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(86f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-86f)
                close()
            }
        }.build()
        
        return _Filter_list_off!!
    }

private var _Filter_list_off: ImageVector? = null

