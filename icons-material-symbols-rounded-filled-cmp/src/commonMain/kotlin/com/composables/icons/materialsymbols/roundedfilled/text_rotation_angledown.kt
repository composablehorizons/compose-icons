package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Text_rotation_angledown: ImageVector
    get() {
        if (_Text_rotation_angledown != null) return _Text_rotation_angledown!!
        
        _Text_rotation_angledown = ImageVector.Builder(
            name = "text_rotation_angledown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 760f)
                lineTo(120f, 416f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(344f, 344f)
                verticalLineToRelative(-24f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 760f)
                horizontalLineToRelative(24f)
                close()
                moveToRelative(12f, -428f)
                lineToRelative(-84f, 39f)
                quadToRelative(-10f, 5f, -20.5f, 3.5f)
                reflectiveQuadTo(353f, 365f)
                quadToRelative(-14f, -14f, -10.5f, -32f)
                reflectiveQuadToRelative(20.5f, -26f)
                lineToRelative(358f, -162f)
                quadToRelative(11f, -5f, 22f, -3f)
                reflectiveQuadToRelative(19f, 10f)
                lineToRelative(20f, 20f)
                quadToRelative(8f, 8f, 10f, 19f)
                reflectiveQuadToRelative(-3f, 22f)
                lineTo(625f, 572f)
                quadToRelative(-8f, 17f, -26f, 20f)
                reflectiveQuadToRelative(-31f, -10f)
                quadToRelative(-8f, -8f, -10f, -19f)
                reflectiveQuadToRelative(3f, -22f)
                lineToRelative(41f, -83f)
                lineToRelative(-126f, -126f)
                close()
                moveToRelative(62f, -30f)
                lineToRelative(92f, 94f)
                lineToRelative(84f, -174f)
                lineToRelative(-2f, -2f)
                lineToRelative(-174f, 82f)
                close()
            }
        }.build()
        
        return _Text_rotation_angledown!!
    }

private var _Text_rotation_angledown: ImageVector? = null

