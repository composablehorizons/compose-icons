package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Garage: ImageVector
    get() {
        if (_Garage != null) return _Garage!!
        
        _Garage = ImageVector.Builder(
            name = "garage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(200f, -240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                close()
                moveTo(200f, 444f)
                verticalLineToRelative(264f)
                quadToRelative(0f, 14f, 9f, 23f)
                reflectiveQuadToRelative(23f, 9f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 23f, -9f)
                reflectiveQuadToRelative(9f, -23f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 14f, 9f, 23f)
                reflectiveQuadToRelative(23f, 9f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 23f, -9f)
                reflectiveQuadToRelative(9f, -23f)
                verticalLineToRelative(-264f)
                lineToRelative(-66f, -192f)
                quadToRelative(-5f, -14f, -16.5f, -23f)
                reflectiveQuadToRelative(-25.5f, -9f)
                horizontalLineTo(308f)
                quadToRelative(-14f, 0f, -25.5f, 9f)
                reflectiveQuadTo(266f, 252f)
                lineToRelative(-66f, 192f)
                close()
                moveToRelative(106f, -64f)
                lineToRelative(28f, -80f)
                horizontalLineToRelative(292f)
                lineToRelative(28f, 80f)
                horizontalLineTo(306f)
                close()
                moveTo(160f, 160f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                close()
                moveToRelative(120f, 420f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Garage!!
    }

private var _Garage: ImageVector? = null

