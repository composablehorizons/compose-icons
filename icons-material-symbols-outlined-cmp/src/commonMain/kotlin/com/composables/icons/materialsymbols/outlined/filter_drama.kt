package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Filter_drama: ImageVector
    get() {
        if (_Filter_drama != null) return _Filter_drama!!
        
        _Filter_drama = ImageVector.Builder(
            name = "filter_drama",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadTo(40f, 580f)
                quadToRelative(0f, -78f, 48.5f, -137.5f)
                reflectiveQuadTo(210f, 366f)
                quadToRelative(25f, -90f, 99f, -148f)
                reflectiveQuadToRelative(171f, -58f)
                quadToRelative(119f, 0f, 199.5f, 82.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(75f, 8f, 117.5f, 62f)
                reflectiveQuadTo(920f, 619f)
                quadToRelative(0f, 75f, -52.5f, 128f)
                reflectiveQuadTo(740f, 800f)
                horizontalLineTo(260f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-63f, 0f, -112f, 34.5f)
                reflectiveQuadTo(296f, 363f)
                quadToRelative(78f, 13f, 131f, 73.5f)
                reflectiveQuadTo(480f, 580f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
            }
        }.build()
        
        return _Filter_drama!!
    }

private var _Filter_drama: ImageVector? = null

