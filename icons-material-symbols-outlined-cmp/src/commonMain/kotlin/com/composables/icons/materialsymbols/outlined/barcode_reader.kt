package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Barcode_reader: ImageVector
    get() {
        if (_Barcode_reader != null) return _Barcode_reader!!
        
        _Barcode_reader = ImageVector.Builder(
            name = "barcode_reader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-60f, 0f, -95.5f, -46.5f)
                reflectiveQuadTo(124f, 690f)
                lineToRelative(72f, -272f)
                quadToRelative(-33f, -21f, -54.5f, -57f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(320f)
                quadToRelative(45f, 0f, 68f, 38f)
                reflectiveQuadToRelative(3f, 78f)
                lineToRelative(-80f, 160f)
                quadToRelative(-11f, 20f, -29.5f, 32f)
                reflectiveQuadTo(520f, 440f)
                horizontalLineToRelative(-81f)
                lineToRelative(-11f, 40f)
                horizontalLineToRelative(12f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 640f)
                horizontalLineToRelative(-54f)
                lineToRelative(-30f, 112f)
                quadToRelative(-11f, 39f, -43f, 63.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(14f, 0f, 24f, -8f)
                reflectiveQuadToRelative(14f, -21f)
                lineToRelative(78f, -291f)
                horizontalLineToRelative(-83f)
                lineToRelative(-72f, 270f)
                quadToRelative(-5f, 19f, 7f, 34.5f)
                reflectiveQuadToRelative(32f, 15.5f)
                close()
                moveToRelative(40f, -400f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, -160f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 360f)
                close()
                moveToRelative(480f, -160f)
                lineToRelative(-25f, -54f)
                lineToRelative(145f, -66f)
                lineToRelative(24f, 55f)
                lineToRelative(-144f, 65f)
                close()
                moveToRelative(120f, 280f)
                lineToRelative(-145f, -65f)
                lineToRelative(25f, -55f)
                lineToRelative(144f, 66f)
                lineToRelative(-24f, 54f)
                close()
                moveTo(760f, 310f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineTo(760f)
                close()
                moveToRelative(-360f, -30f)
                close()
                moveToRelative(-85f, 160f)
                close()
            }
        }.build()
        
        return _Barcode_reader!!
    }

private var _Barcode_reader: ImageVector? = null

