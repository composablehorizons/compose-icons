package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Local_pharmacy: ImageVector
    get() {
        if (_Local_pharmacy != null) return _Local_pharmacy!!
        
        _Local_pharmacy = ImageVector.Builder(
            name = "local_pharmacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, -240f)
                lineToRelative(-80f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(508f)
                lineToRelative(58f, -160f)
                lineToRelative(94f, 34f)
                lineToRelative(-46f, 126f)
                horizontalLineToRelative(106f)
                verticalLineToRelative(80f)
                lineToRelative(-80f, 240f)
                lineToRelative(80f, 240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Local_pharmacy!!
    }

private var _Local_pharmacy: ImageVector? = null

