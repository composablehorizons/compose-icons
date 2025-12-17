package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Car_rental: ImageVector
    get() {
        if (_Car_rental != null) return _Car_rental!!
        
        _Car_rental = ImageVector.Builder(
            name = "car_rental",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 280f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(38f, 0f, 69f, 22.5f)
                reflectiveQuadToRelative(45f, 57.5f)
                horizontalLineToRelative(326f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(434f)
                quadToRelative(-14f, 35f, -45f, 57.5f)
                reflectiveQuadTo(320f, 280f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 200f)
                close()
                moveToRelative(40f, 500f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 660f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 620f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 660f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 700f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 660f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 620f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 660f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 700f)
                close()
                moveTo(200f, 584f)
                lineToRelative(66f, -192f)
                quadToRelative(5f, -14f, 16.5f, -23f)
                reflectiveQuadToRelative(25.5f, -9f)
                horizontalLineToRelative(344f)
                quadToRelative(14f, 0f, 25.5f, 9f)
                reflectiveQuadToRelative(16.5f, 23f)
                lineToRelative(66f, 192f)
                verticalLineToRelative(264f)
                quadToRelative(0f, 14f, -9f, 23f)
                reflectiveQuadToRelative(-23f, 9f)
                horizontalLineToRelative(-16f)
                quadToRelative(-14f, 0f, -23f, -9f)
                reflectiveQuadToRelative(-9f, -23f)
                verticalLineToRelative(-48f)
                horizontalLineTo(280f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 14f, -9f, 23f)
                reflectiveQuadToRelative(-23f, 9f)
                horizontalLineToRelative(-16f)
                quadToRelative(-14f, 0f, -23f, -9f)
                reflectiveQuadToRelative(-9f, -23f)
                verticalLineToRelative(-264f)
                close()
                moveToRelative(106f, -64f)
                horizontalLineToRelative(348f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(334f)
                lineToRelative(-28f, 80f)
                close()
                moveToRelative(-26f, 80f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(0f, 120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Car_rental!!
    }

private var _Car_rental: ImageVector? = null

