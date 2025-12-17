package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Parking_meter: ImageVector
    get() {
        if (_Parking_meter != null) return _Parking_meter!!
        
        _Parking_meter = ImageVector.Builder(
            name = "parking_meter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(208f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(222f)
                lineToRelative(98f, 280f)
                verticalLineToRelative(360f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-60f, -200f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 640f)
                close()
                moveToRelative(370f, -340f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -12f, 9f, -21f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(12f, 0f, 21f, 9f)
                reflectiveQuadToRelative(9f, 21f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -38f, -26f, -64f)
                reflectiveQuadToRelative(-64f, -26f)
                quadToRelative(-38f, 0f, -64f, 26f)
                reflectiveQuadToRelative(-26f, 64f)
                close()
                moveToRelative(10f, 120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(600f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(40f, 420f)
                verticalLineToRelative(-280f)
                horizontalLineTo(520f)
                lineToRelative(-52f, -208f)
                quadToRelative(-3f, -14f, -5f, -27f)
                reflectiveQuadToRelative(-2f, -27f)
                quadToRelative(0f, -88f, 62.5f, -153f)
                reflectiveQuadTo(680f, 80f)
                quadToRelative(94f, 0f, 156.5f, 65f)
                reflectiveQuadTo(899f, 298f)
                quadToRelative(0f, 14f, -2f, 27f)
                reflectiveQuadToRelative(-5f, 27f)
                lineToRelative(-52f, 208f)
                horizontalLineTo(720f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Parking_meter!!
    }

private var _Parking_meter: ImageVector? = null

