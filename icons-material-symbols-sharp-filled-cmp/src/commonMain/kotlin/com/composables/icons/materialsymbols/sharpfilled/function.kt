package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Function: ImageVector
    get() {
        if (_Function != null) return _Function!!
        
        _Function = ImageVector.Builder(
            name = "function",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(62f)
                lineToRelative(105f, -120f)
                lineToRelative(-105f, -120f)
                horizontalLineToRelative(-66f)
                lineToRelative(-64f, 344f)
                quadToRelative(-8f, 45f, -37f, 70.5f)
                reflectiveQuadTo(221f, 840f)
                quadToRelative(-45f, 0f, -73f, -24f)
                reflectiveQuadToRelative(-28f, -64f)
                quadToRelative(0f, -32f, 17f, -51.5f)
                reflectiveQuadToRelative(43f, -19.5f)
                quadToRelative(25f, 0f, 42.5f, 17f)
                reflectiveQuadToRelative(17.5f, 41f)
                quadToRelative(0f, 5f, -0.5f, 9f)
                reflectiveQuadToRelative(-1.5f, 9f)
                quadToRelative(5f, -1f, 8.5f, -5.5f)
                reflectiveQuadTo(252f, 739f)
                lineToRelative(62f, -339f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(129f)
                lineToRelative(21f, -114f)
                quadToRelative(7f, -38f, 37.5f, -62f)
                reflectiveQuadToRelative(72.5f, -24f)
                quadToRelative(44f, 0f, 72f, 26f)
                reflectiveQuadToRelative(28f, 65f)
                quadToRelative(0f, 30f, -17f, 49.5f)
                reflectiveQuadTo(500f, 280f)
                quadToRelative(-25f, 0f, -42.5f, -17f)
                reflectiveQuadTo(440f, 221f)
                quadToRelative(0f, -5f, 0.5f, -9f)
                reflectiveQuadToRelative(1.5f, -9f)
                quadToRelative(-6f, 2f, -9f, 6f)
                reflectiveQuadToRelative(-5f, 12f)
                lineToRelative(-17f, 99f)
                horizontalLineToRelative(189f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-32f)
                lineToRelative(52f, 59f)
                lineToRelative(52f, -59f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-62f)
                lineTo(673f, 520f)
                lineToRelative(105f, 120f)
                horizontalLineToRelative(62f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(32f)
                lineToRelative(-52f, -60f)
                lineToRelative(-52f, 60f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Function!!
    }

private var _Function: ImageVector? = null

