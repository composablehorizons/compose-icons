package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Reset_brightness: ImageVector
    get() {
        if (_Reset_brightness != null) return _Reset_brightness!!
        
        _Reset_brightness = ImageVector.Builder(
            name = "reset_brightness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 900f)
                lineToRelative(-60f, -60f)
                horizontalLineTo(520f)
                verticalLineToRelative(-100f)
                lineToRelative(-60f, -60f)
                lineToRelative(60f, -60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                lineToRelative(60f, -60f)
                lineToRelative(60f, 60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                lineToRelative(60f, 60f)
                lineToRelative(-60f, 60f)
                verticalLineToRelative(100f)
                horizontalLineTo(740f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(0f, -100f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(151f, -400f)
                horizontalLineToRelative(-83f)
                quadToRelative(-26f, -88f, -99f, -144f)
                reflectiveQuadToRelative(-169f, -56f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(94f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(129f, 0f, 226.5f, 79.5f)
                reflectiveQuadTo(831f, 400f)
                close()
            }
        }.build()
        
        return _Reset_brightness!!
    }

private var _Reset_brightness: ImageVector? = null

