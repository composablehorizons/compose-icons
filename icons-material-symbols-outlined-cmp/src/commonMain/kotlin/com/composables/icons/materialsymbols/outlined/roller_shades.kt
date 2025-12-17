package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Roller_shades: ImageVector
    get() {
        if (_Roller_shades != null) return _Roller_shades!!
        
        _Roller_shades = ImageVector.Builder(
            name = "roller_shades",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -400f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                verticalLineToRelative(72f)
                quadToRelative(14f, 10f, 22f, 25f)
                reflectiveQuadToRelative(8f, 33f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 650f)
                quadToRelative(0f, -18f, 8f, -32.5f)
                reflectiveQuadToRelative(22f, -24.5f)
                verticalLineToRelative(-73f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Roller_shades!!
    }

private var _Roller_shades: ImageVector? = null

