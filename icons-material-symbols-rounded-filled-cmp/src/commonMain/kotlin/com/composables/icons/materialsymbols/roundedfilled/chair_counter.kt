package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chair_counter: ImageVector
    get() {
        if (_Chair_counter != null) return _Chair_counter!!
        
        _Chair_counter = ImageVector.Builder(
            name = "chair_counter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(307f, 880f)
                quadToRelative(-11f, 0f, -19f, -8.5f)
                reflectiveQuadToRelative(-8f, -22.5f)
                quadToRelative(0f, -20f, 19.5f, -37f)
                reflectiveQuadToRelative(57.5f, -31f)
                quadToRelative(20f, -7f, 40.5f, -12f)
                reflectiveQuadToRelative(42.5f, -7f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                quadToRelative(-20f, 0f, -35f, -11.5f)
                reflectiveQuadTo(324f, 320f)
                horizontalLineToRelative(-84f)
                quadToRelative(-32f, 0f, -56f, -21.5f)
                reflectiveQuadTo(160f, 245f)
                quadToRelative(0f, -69f, 46f, -117f)
                reflectiveQuadToRelative(114f, -48f)
                horizontalLineToRelative(320f)
                quadToRelative(68f, 0f, 114f, 48f)
                reflectiveQuadToRelative(46f, 117f)
                quadToRelative(0f, 32f, -24f, 53.5f)
                reflectiveQuadTo(720f, 320f)
                horizontalLineToRelative(-84f)
                quadToRelative(-6f, 17f, -21f, 28.5f)
                reflectiveQuadTo(580f, 360f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(82f)
                quadToRelative(22f, 2f, 42.5f, 7f)
                reflectiveQuadToRelative(40.5f, 12f)
                quadToRelative(38f, 14f, 57.5f, 31f)
                reflectiveQuadToRelative(19.5f, 37f)
                quadToRelative(0f, 14f, -8f, 22.5f)
                reflectiveQuadTo(653f, 880f)
                horizontalLineTo(307f)
                close()
            }
        }.build()
        
        return _Chair_counter!!
    }

private var _Chair_counter: ImageVector? = null

