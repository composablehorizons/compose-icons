package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cards_star: ImageVector
    get() {
        if (_Cards_star != null) return _Cards_star!!
        
        _Cards_star = ImageVector.Builder(
            name = "cards_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(489f, 500f)
                lineToRelative(91f, -55f)
                lineToRelative(91f, 55f)
                lineToRelative(-24f, -104f)
                lineToRelative(80f, -69f)
                lineToRelative(-105f, -9f)
                lineToRelative(-42f, -98f)
                lineToRelative(-42f, 98f)
                lineToRelative(-105f, 9f)
                lineToRelative(80f, 69f)
                lineToRelative(-24f, 104f)
                close()
                moveToRelative(19f, 260f)
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
        
        return _Cards_star!!
    }

private var _Cards_star: ImageVector? = null

