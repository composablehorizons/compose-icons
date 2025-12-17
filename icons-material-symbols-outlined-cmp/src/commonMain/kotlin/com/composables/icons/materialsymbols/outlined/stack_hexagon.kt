package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stack_hexagon: ImageVector
    get() {
        if (_Stack_hexagon != null) return _Stack_hexagon!!
        
        _Stack_hexagon = ImageVector.Builder(
            name = "stack_hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 540f)
                lineToRelative(140f, -80f)
                verticalLineToRelative(-160f)
                lineToRelative(-140f, -80f)
                lineToRelative(-140f, 80f)
                verticalLineToRelative(160f)
                lineToRelative(140f, 80f)
                close()
                moveToRelative(-72f, 220f)
                horizontalLineToRelative(224f)
                quadToRelative(-7f, 26f, -24f, 42f)
                reflectiveQuadToRelative(-44f, 20f)
                lineTo(228f, 875f)
                quadToRelative(-33f, 5f, -59.5f, -15.5f)
                reflectiveQuadTo(138f, 806f)
                lineTo(85f, 369f)
                quadToRelative(-4f, -33f, 16f, -59f)
                reflectiveQuadToRelative(53f, -30f)
                lineToRelative(46f, -6f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 5f)
                lineToRelative(54f, 437f)
                lineToRelative(290f, -36f)
                close()
                moveToRelative(-148f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(360f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(220f, -220f)
                close()
                moveTo(218f, 796f)
                close()
            }
        }.build()
        
        return _Stack_hexagon!!
    }

private var _Stack_hexagon: ImageVector? = null

