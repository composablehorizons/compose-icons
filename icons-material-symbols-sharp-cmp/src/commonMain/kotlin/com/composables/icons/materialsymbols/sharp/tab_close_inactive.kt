package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tab_close_inactive: ImageVector
    get() {
        if (_Tab_close_inactive != null) return _Tab_close_inactive!!
        
        _Tab_close_inactive = ImageVector.Builder(
            name = "tab_close_inactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveTo(160f, 400f)
                horizontalLineTo(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, 240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(236f, -340f)
                lineToRelative(84f, -84f)
                lineToRelative(84f, 84f)
                lineToRelative(56f, -56f)
                lineToRelative(-84f, -84f)
                lineToRelative(84f, -84f)
                lineToRelative(-56f, -56f)
                lineToRelative(-84f, 84f)
                lineToRelative(-84f, -84f)
                lineToRelative(-56f, 56f)
                lineToRelative(84f, 84f)
                lineToRelative(-84f, 84f)
                lineToRelative(56f, 56f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Tab_close_inactive!!
    }

private var _Tab_close_inactive: ImageVector? = null

