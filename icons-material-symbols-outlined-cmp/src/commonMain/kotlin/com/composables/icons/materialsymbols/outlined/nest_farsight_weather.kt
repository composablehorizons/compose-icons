package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_farsight_weather: ImageVector
    get() {
        if (_Nest_farsight_weather != null) return _Nest_farsight_weather!!
        
        _Nest_farsight_weather = ImageVector.Builder(
            name = "nest_farsight_weather",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 620f)
                horizontalLineToRelative(250f)
                quadToRelative(46f, 0f, 78f, -32.5f)
                reflectiveQuadToRelative(32f, -77.5f)
                quadToRelative(0f, -45f, -30.5f, -76.5f)
                reflectiveQuadTo(614f, 400f)
                quadToRelative(-13f, -45f, -50f, -72.5f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-41f, 0f, -75f, 21.5f)
                reflectiveQuadTo(354f, 381f)
                quadToRelative(-48f, 2f, -81f, 36.5f)
                reflectiveQuadTo(240f, 500f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 500f)
                quadToRelative(0f, -17f, 11f, -28f)
                reflectiveQuadToRelative(27f, -12f)
                horizontalLineToRelative(48f)
                lineToRelative(20f, -45f)
                quadToRelative(8f, -17f, 22.5f, -26f)
                reflectiveQuadToRelative(31.5f, -9f)
                quadToRelative(20f, 0f, 36f, 11.5f)
                reflectiveQuadToRelative(21f, 31.5f)
                lineToRelative(16f, 57f)
                horizontalLineToRelative(58f)
                quadToRelative(13f, 0f, 21f, 8.5f)
                reflectiveQuadToRelative(8f, 21.5f)
                quadToRelative(0f, 12f, -8.5f, 21f)
                reflectiveQuadToRelative(-21.5f, 9f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Nest_farsight_weather!!
    }

private var _Nest_farsight_weather: ImageVector? = null

