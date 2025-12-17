package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Parking_meter: ImageVector
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
                moveTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(208f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(180f)
                quadToRelative(19f, 0f, 34.5f, 11f)
                reflectiveQuadToRelative(21.5f, 29f)
                lineToRelative(84f, 240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(220f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 640f)
                close()
                moveToRelative(362f, -160f)
                horizontalLineToRelative(196f)
                lineToRelative(36f, -148f)
                quadToRelative(2f, -8f, 3.5f, -16.5f)
                reflectiveQuadTo(819f, 299f)
                quadToRelative(0f, -56f, -40f, -97.5f)
                reflectiveQuadTo(680f, 160f)
                quadToRelative(-59f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-40f, 97f)
                quadToRelative(0f, 8f, 1.5f, 17f)
                reflectiveQuadToRelative(3.5f, 17f)
                lineToRelative(36f, 148f)
                close()
                moveToRelative(8f, -180f)
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
                moveToRelative(40f, -520f)
                close()
            }
        }.build()
        
        return _Parking_meter!!
    }

private var _Parking_meter: ImageVector? = null

