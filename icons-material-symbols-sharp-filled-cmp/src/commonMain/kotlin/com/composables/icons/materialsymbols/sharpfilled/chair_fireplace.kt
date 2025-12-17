package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chair_fireplace: ImageVector
    get() {
        if (_Chair_fireplace != null) return _Chair_fireplace!!
        
        _Chair_fireplace = ImageVector.Builder(
            name = "chair_fireplace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(593f, 539f)
                quadToRelative(20f, 0f, 33.5f, -13.5f)
                reflectiveQuadTo(640f, 492f)
                quadToRelative(0f, -26f, -19.5f, -38.5f)
                reflectiveQuadTo(593f, 419f)
                quadToRelative(-2f, 9f, -3f, 17.5f)
                reflectiveQuadToRelative(1f, 14.5f)
                quadToRelative(2f, 7f, 4.5f, 17.5f)
                reflectiveQuadToRelative(0.5f, 20.5f)
                quadToRelative(-2f, 11f, -12.5f, 22f)
                reflectiveQuadTo(560f, 527f)
                quadToRelative(7f, 6f, 15.5f, 9f)
                reflectiveQuadToRelative(17.5f, 3f)
                close()
                moveToRelative(-78f, 101f)
                lineToRelative(-57f, -87f)
                quadToRelative(-11f, -17f, -14.5f, -35f)
                reflectiveQuadToRelative(-3.5f, -41f)
                quadToRelative(0f, -73f, 45.5f, -131f)
                reflectiveQuadTo(631f, 231f)
                quadToRelative(-8f, 42f, 8.5f, 78.5f)
                reflectiveQuadTo(696f, 374f)
                quadToRelative(32f, 23f, 48f, 51f)
                reflectiveQuadToRelative(16f, 66f)
                quadToRelative(0f, 18f, -4f, 33.5f)
                reflectiveQuadTo(743f, 560f)
                horizontalLineToRelative(57f)
                verticalLineToRelative(-400f)
                horizontalLineTo(400f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(515f)
                close()
                moveTo(160f, 840f)
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
        
        return _Chair_fireplace!!
    }

private var _Chair_fireplace: ImageVector? = null

