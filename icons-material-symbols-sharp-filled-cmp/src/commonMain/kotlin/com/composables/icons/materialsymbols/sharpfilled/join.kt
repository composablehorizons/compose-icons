package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Join: ImageVector
    get() {
        if (_Join != null) return _Join!!
        
        _Join = ImageVector.Builder(
            name = "join",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 760f)
                quadToRelative(-28f, 0f, -54.5f, -5.5f)
                reflectiveQuadTo(534f, 739f)
                quadToRelative(59f, -54f, 92.5f, -120.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(0f, -72f, -33.5f, -138.5f)
                reflectiveQuadTo(534f, 221f)
                quadToRelative(25f, -10f, 51.5f, -15.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                close()
                moveToRelative(-160f, -50f)
                quadToRelative(-55f, -38f, -87.5f, -98f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -72f, 32.5f, -132f)
                reflectiveQuadToRelative(87.5f, -98f)
                quadToRelative(55f, 38f, 87.5f, 98f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 72f, -32.5f, 132f)
                reflectiveQuadTo(480f, 710f)
                close()
                moveToRelative(-160f, 50f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(28f, 0f, 54.5f, 5.5f)
                reflectiveQuadTo(426f, 221f)
                quadToRelative(-59f, 54f, -92.5f, 120.5f)
                reflectiveQuadTo(300f, 480f)
                quadToRelative(0f, 79f, 32.5f, 146.5f)
                reflectiveQuadTo(422f, 741f)
                quadToRelative(-24f, 9f, -49.5f, 14f)
                reflectiveQuadToRelative(-52.5f, 5f)
                close()
            }
        }.build()
        
        return _Join!!
    }

private var _Join: ImageVector? = null

