package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chair_umbrella: ImageVector
    get() {
        if (_Chair_umbrella != null) return _Chair_umbrella!!
        
        _Chair_umbrella = ImageVector.Builder(
            name = "chair_umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 840f)
                verticalLineToRelative(-440f)
                quadToRelative(-14f, -18f, -34.5f, -29f)
                reflectiveQuadTo(420f, 360f)
                quadToRelative(-25f, 0f, -45.5f, 10.5f)
                reflectiveQuadTo(340f, 400f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(540f, 120f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(820f, 400f)
                horizontalLineToRelative(-80f)
                quadToRelative(-14f, -19f, -34.5f, -29.5f)
                reflectiveQuadTo(660f, 360f)
                quadToRelative(-25f, 0f, -45.5f, 11f)
                reflectiveQuadTo(580f, 400f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(140f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-480f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-39f)
                lineTo(80f, 280f)
                horizontalLineToRelative(80f)
                lineToRelative(29f, 320f)
                horizontalLineToRelative(251f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(220f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Chair_umbrella!!
    }

private var _Chair_umbrella: ImageVector? = null

