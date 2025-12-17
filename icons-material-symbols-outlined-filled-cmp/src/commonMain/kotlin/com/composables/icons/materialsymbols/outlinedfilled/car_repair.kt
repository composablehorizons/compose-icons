package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Car_repair: ImageVector
    get() {
        if (_Car_repair != null) return _Car_repair!!
        
        _Car_repair = ImageVector.Builder(
            name = "car_repair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, -420f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 420f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 380f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 420f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 460f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 420f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 380f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 420f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 460f)
                close()
                moveTo(200f, 344f)
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
            }
        }.build()
        
        return _Car_repair!!
    }

private var _Car_repair: ImageVector? = null

