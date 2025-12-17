package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) return _Volunteer_activism!!
        
        _Volunteer_activism = ImageVector.Builder(
            name = "volunteer_activism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 900f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(40f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(318f)
                lineToRelative(322f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                lineTo(560f, 900f)
                close()
                moveTo(120f, 800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(438f, 16f)
                lineToRelative(238f, -74f)
                verticalLineToRelative(-22f)
                horizontalLineTo(513f)
                lineToRelative(-125f, -42f)
                lineToRelative(24f, -76f)
                lineToRelative(117f, 38f)
                horizontalLineToRelative(71f)
                verticalLineToRelative(-26f)
                lineToRelative(-256f, -94f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                lineToRelative(278f, 76f)
                close()
                moveToRelative(82f, -296f)
                lineTo(474f, 358f)
                quadToRelative(-31f, -30f, -52.5f, -66.5f)
                reflectiveQuadTo(400f, 212f)
                quadToRelative(0f, -55f, 38.5f, -93.5f)
                reflectiveQuadTo(532f, 80f)
                quadToRelative(32f, 0f, 60f, 13.5f)
                reflectiveQuadToRelative(48f, 36.5f)
                quadToRelative(20f, -23f, 48f, -36.5f)
                reflectiveQuadToRelative(60f, -13.5f)
                quadToRelative(55f, 0f, 93.5f, 38.5f)
                reflectiveQuadTo(880f, 212f)
                quadToRelative(0f, 43f, -21f, 79.5f)
                reflectiveQuadTo(807f, 358f)
                lineTo(640f, 520f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(109f, -107f)
                quadToRelative(19f, -19f, 35f, -40.5f)
                reflectiveQuadToRelative(16f, -48.5f)
                quadToRelative(0f, -22f, -15f, -37f)
                reflectiveQuadToRelative(-37f, -15f)
                quadToRelative(-14f, 0f, -26.5f, 5.5f)
                reflectiveQuadTo(700f, 182f)
                lineToRelative(-60f, 72f)
                lineToRelative(-60f, -72f)
                quadToRelative(-9f, -11f, -21.5f, -16.5f)
                reflectiveQuadTo(532f, 160f)
                quadToRelative(-22f, 0f, -37f, 15f)
                reflectiveQuadToRelative(-15f, 37f)
                quadToRelative(0f, 27f, 16f, 48.5f)
                reflectiveQuadToRelative(35f, 40.5f)
                lineToRelative(109f, 107f)
                close()
                moveToRelative(0f, -154f)
                close()
            }
        }.build()
        
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null

