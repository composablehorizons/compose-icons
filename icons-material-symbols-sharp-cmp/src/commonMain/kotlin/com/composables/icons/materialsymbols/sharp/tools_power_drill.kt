package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tools_power_drill: ImageVector
    get() {
        if (_Tools_power_drill != null) return _Tools_power_drill!!
        
        _Tools_power_drill = ImageVector.Builder(
            name = "tools_power_drill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-60f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -100f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-60f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(400f, 140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(40f)
                lineToRelative(-40f, 40f)
                horizontalLineTo(640f)
                close()
                moveTo(480f, 640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineTo(480f)
                verticalLineToRelative(120f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -520f)
                close()
                moveToRelative(120f, 440f)
                horizontalLineTo(240f)
                horizontalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Tools_power_drill!!
    }

private var _Tools_power_drill: ImageVector? = null

