package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tools_power_drill: ImageVector
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
                moveTo(240f, 400f)
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
                moveToRelative(440f, 140f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(40f)
                lineToRelative(-40f, 40f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 620f)
                verticalLineToRelative(-100f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineTo(480f)
                verticalLineToRelative(100f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-80f, 220f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(180f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Tools_power_drill!!
    }

private var _Tools_power_drill: ImageVector? = null

