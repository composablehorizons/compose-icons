package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_share_stack: ImageVector
    get() {
        if (_Mobile_share_stack != null) return _Mobile_share_stack!!
        
        _Mobile_share_stack = ImageVector.Builder(
            name = "mobile_share_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, -240f)
                verticalLineToRelative(-560f)
                horizontalLineTo(400f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(320f)
                close()
                moveTo(400f, 120f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
                moveToRelative(-80f, 640f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(162f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(156f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(402f)
                horizontalLineTo(320f)
                close()
                moveToRelative(120f, -280f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(66f)
                lineToRelative(-28f, 28f)
                lineToRelative(42f, 42f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                lineToRelative(-42f, 42f)
                lineToRelative(28f, 28f)
                horizontalLineTo(440f)
                verticalLineToRelative(130f)
                close()
            }
        }.build()
        
        return _Mobile_share_stack!!
    }

private var _Mobile_share_stack: ImageVector? = null

