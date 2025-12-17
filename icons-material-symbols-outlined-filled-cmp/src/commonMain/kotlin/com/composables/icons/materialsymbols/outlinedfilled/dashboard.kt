package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dashboard: ImageVector
    get() {
        if (_Dashboard != null) return _Dashboard!!
        
        _Dashboard = ImageVector.Builder(
            name = "dashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                close()
                moveTo(120f, 520f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(400f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 320f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(400f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Dashboard!!
    }

private var _Dashboard: ImageVector? = null

