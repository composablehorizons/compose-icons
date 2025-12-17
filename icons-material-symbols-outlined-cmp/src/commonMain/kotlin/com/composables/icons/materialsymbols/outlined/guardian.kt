package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Guardian: ImageVector
    get() {
        if (_Guardian != null) return _Guardian!!
        
        _Guardian = ImageVector.Builder(
            name = "guardian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                quadToRelative(-186f, 0f, -313f, -69.5f)
                reflectiveQuadTo(40f, 680f)
                quadToRelative(0f, -69f, 64f, -126.5f)
                reflectiveQuadTo(280f, 466f)
                verticalLineToRelative(82f)
                quadToRelative(-73f, 23f, -116.5f, 59f)
                reflectiveQuadTo(120f, 680f)
                quadToRelative(0f, 64f, 108f, 112f)
                reflectiveQuadToRelative(252f, 48f)
                quadToRelative(144f, 0f, 252f, -48f)
                reflectiveQuadToRelative(108f, -112f)
                quadToRelative(0f, -37f, -43.5f, -73f)
                reflectiveQuadTo(680f, 548f)
                verticalLineToRelative(-82f)
                quadToRelative(112f, 30f, 176f, 87.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 101f, -127f, 170.5f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveTo(360f, 760f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Guardian!!
    }

private var _Guardian: ImageVector? = null

