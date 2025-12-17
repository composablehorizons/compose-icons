package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fluid_med: ImageVector
    get() {
        if (_Fluid_med != null) return _Fluid_med!!
        
        _Fluid_med = ImageVector.Builder(
            name = "fluid_med",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 800f)
                verticalLineToRelative(-44f)
                quadToRelative(-69f, -14f, -114.5f, -68.5f)
                reflectiveQuadTo(520f, 560f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 73f, -45.5f, 127.5f)
                reflectiveQuadTo(760f, 756f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
                moveToRelative(30f, -360f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(30f)
                quadToRelative(33f, 0f, 62.5f, 15f)
                reflectiveQuadToRelative(49.5f, 41f)
                quadToRelative(8f, 12f, 21f, 18f)
                reflectiveQuadToRelative(27f, 6f)
                close()
                moveToRelative(-70f, 160f)
                quadToRelative(39f, 0f, 70f, -22.5f)
                reflectiveQuadToRelative(43f, -57.5f)
                horizontalLineToRelative(-43f)
                quadToRelative(-33f, 0f, -62.5f, -14.5f)
                reflectiveQuadTo(678f, 544f)
                quadToRelative(-9f, -11f, -21.5f, -17.5f)
                reflectiveQuadTo(630f, 520f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(720f, 680f)
                close()
                moveToRelative(-42f, -184f)
                close()
                moveTo(320f, 900f)
                lineToRelative(-80f, -60f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-300f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(300f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 680f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(220f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(260f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(260f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(200f)
                verticalLineToRelative(300f)
                close()
            }
        }.build()
        
        return _Fluid_med!!
    }

private var _Fluid_med: ImageVector? = null

