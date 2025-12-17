package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dashboard_customize: ImageVector
    get() {
        if (_Dashboard_customize != null) return _Dashboard_customize!!
        
        _Dashboard_customize = ImageVector.Builder(
            name = "dashboard_customize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                verticalLineToRelative(-320f)
                close()
                moveTo(120f, 520f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                close()
                moveToRelative(520f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Dashboard_customize!!
    }

private var _Dashboard_customize: ImageVector? = null

