package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chair_fireplace: ImageVector
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
                moveToRelative(13f, 21f)
                quadToRelative(30f, 0f, 52f, -20f)
                reflectiveQuadToRelative(22f, -48f)
                quadToRelative(0f, -16f, -8.5f, -29.5f)
                reflectiveQuadTo(643f, 435f)
                quadToRelative(-20f, -14f, -37f, -32.5f)
                reflectiveQuadTo(578f, 364f)
                quadToRelative(-29f, 24f, -43f, 50.5f)
                reflectiveQuadTo(521f, 468f)
                quadToRelative(0f, 38f, 25f, 65f)
                reflectiveQuadToRelative(60f, 27f)
                close()
                moveToRelative(-91f, 80f)
                quadToRelative(-7f, -26f, -21.5f, -48f)
                reflectiveQuadTo(458f, 553f)
                quadToRelative(-9f, -17f, -13.5f, -35f)
                reflectiveQuadToRelative(-4.5f, -41f)
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
                verticalLineToRelative(-122f)
                quadToRelative(-19f, -5f, -30.5f, -19.5f)
                reflectiveQuadTo(116f, 665f)
                lineTo(80f, 280f)
                horizontalLineToRelative(25f)
                quadToRelative(23f, 0f, 40.5f, 16f)
                reflectiveQuadToRelative(19.5f, 39f)
                lineToRelative(24f, 265f)
                horizontalLineToRelative(171f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(220f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(446f, -280f)
                close()
            }
        }.build()
        
        return _Chair_fireplace!!
    }

private var _Chair_fireplace: ImageVector? = null

