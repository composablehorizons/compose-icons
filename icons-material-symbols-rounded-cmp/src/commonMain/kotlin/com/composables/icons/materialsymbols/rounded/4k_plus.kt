package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.`4k_plus`: ImageVector
    get() {
        if (_4k_plus != null) return _4k_plus!!
        
        _4k_plus = ImageVector.Builder(
            name = "4k_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 500f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(-140f, 10f)
                lineToRelative(61f, 79f)
                quadToRelative(2f, 3f, 23f, 11f)
                quadToRelative(18f, 0f, 26f, -16.5f)
                reflectiveQuadToRelative(-3f, -30.5f)
                lineToRelative(-57f, -73f)
                lineToRelative(57f, -74f)
                quadToRelative(11f, -14f, 3f, -30f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-7f, 0f, -13f, 3f)
                reflectiveQuadToRelative(-10f, 8f)
                lineToRelative(-61f, 79f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(490f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(460f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(490f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(520f, 570f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-180f, 30f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(370f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(400f, 570f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(10f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 510f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 480f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(370f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(340f, 390f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(250f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(220f, 390f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(250f, 540f)
                horizontalLineToRelative(90f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _4k_plus!!
    }

private var _4k_plus: ImageVector? = null

