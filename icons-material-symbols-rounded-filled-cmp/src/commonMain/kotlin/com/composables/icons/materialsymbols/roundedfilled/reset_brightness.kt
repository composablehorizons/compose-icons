package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Reset_brightness: ImageVector
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
                moveTo(620f, 840f)
                horizontalLineToRelative(-80f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-80f)
                lineToRelative(-46f, -46f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(46f, -46f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(80f)
                lineToRelative(46f, -46f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(46f, 46f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                verticalLineToRelative(80f)
                lineToRelative(46f, 46f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-46f, 46f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineToRelative(-80f)
                lineToRelative(-46f, 46f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-46f, -46f)
                close()
                moveToRelative(60f, -40f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                verticalLineToRelative(240f)
                close()
                moveTo(480f, 200f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 760f)
                horizontalLineToRelative(54f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(65f, 0f, 139f, 38f)
                reflectiveQuadToRelative(195f, 187f)
                quadToRelative(11f, 13f, 3.5f, 28.5f)
                reflectiveQuadTo(792f, 397f)
                quadToRelative(-16f, 7f, -32f, 0.5f)
                reflectiveQuadTo(739f, 375f)
                quadToRelative(-20f, -68f, -91.5f, -121.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Reset_brightness!!
    }

private var _Reset_brightness: ImageVector? = null

