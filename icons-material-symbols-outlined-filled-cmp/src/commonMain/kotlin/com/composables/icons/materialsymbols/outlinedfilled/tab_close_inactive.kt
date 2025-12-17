package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Tab_close_inactive: ImageVector
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
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-80f)
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
                moveTo(320f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Tab_close_inactive!!
    }

private var _Tab_close_inactive: ImageVector? = null

