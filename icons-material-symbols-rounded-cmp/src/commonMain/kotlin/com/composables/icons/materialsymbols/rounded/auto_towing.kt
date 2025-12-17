package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Auto_towing: ImageVector
    get() {
        if (_Auto_towing != null) return _Auto_towing!!
        
        _Auto_towing = ImageVector.Builder(
            name = "auto_towing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 640f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 520f)
                horizontalLineToRelative(288f)
                lineTo(120f, 324f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 400f)
                verticalLineToRelative(-154f)
                quadToRelative(0f, -23f, 19.5f, -34.5f)
                reflectiveQuadTo(99f, 211f)
                lineToRelative(421f, 231f)
                verticalLineToRelative(-242f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 160f)
                horizontalLineToRelative(123f)
                quadToRelative(18f, 0f, 34f, 7.5f)
                reflectiveQuadToRelative(27f, 21.5f)
                lineToRelative(157f, 189f)
                quadToRelative(9f, 11f, 14f, 24f)
                reflectiveQuadToRelative(5f, 27f)
                verticalLineToRelative(211f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 680f)
                horizontalLineToRelative(-60f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(360f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 640f)
                close()
                moveToRelative(200f, 100f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(460f, 0f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(600f, 400f)
                horizontalLineToRelative(216f)
                lineTo(682f, 240f)
                horizontalLineToRelative(-82f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Auto_towing!!
    }

private var _Auto_towing: ImageVector? = null

