package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chair_counter: ImageVector
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
                horizontalLineTo(338f)
                lineToRelative(-14f, -40f)
                horizontalLineTo(160f)
                verticalLineToRelative(-75f)
                quadToRelative(0f, -69f, 46f, -117f)
                reflectiveQuadToRelative(114f, -48f)
                horizontalLineToRelative(320f)
                quadToRelative(68f, 0f, 114f, 48f)
                reflectiveQuadToRelative(46f, 117f)
                verticalLineToRelative(75f)
                horizontalLineTo(636f)
                lineToRelative(-14f, 40f)
                horizontalLineTo(520f)
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

