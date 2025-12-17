package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chair_counter: ImageVector
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
                moveTo(280f, 880f)
                verticalLineToRelative(-60f)
                quadToRelative(36f, -25f, 76.5f, -39f)
                reflectiveQuadToRelative(83.5f, -19f)
                verticalLineToRelative(-82f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
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
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(82f)
                quadToRelative(43f, 5f, 83.5f, 19f)
                reflectiveQuadToRelative(76.5f, 39f)
                verticalLineToRelative(60f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Chair_counter!!
    }

private var _Chair_counter: ImageVector? = null

