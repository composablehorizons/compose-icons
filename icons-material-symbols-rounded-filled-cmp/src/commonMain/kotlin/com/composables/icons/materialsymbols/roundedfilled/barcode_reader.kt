package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Barcode_reader: ImageVector
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
                moveToRelative(637f, -693f)
                lineToRelative(-90f, 41f)
                quadToRelative(-11f, 5f, -22.5f, 0.5f)
                reflectiveQuadTo(748f, 173f)
                quadToRelative(-5f, -11f, -1f, -22.5f)
                reflectiveQuadToRelative(15f, -16.5f)
                lineToRelative(90f, -41f)
                quadToRelative(11f, -5f, 23f, -0.5f)
                reflectiveQuadToRelative(17f, 15.5f)
                quadToRelative(5f, 11f, 0.5f, 22.5f)
                reflectiveQuadTo(877f, 147f)
                close()
                moveTo(763f, 427f)
                quadToRelative(-11f, -5f, -16f, -17f)
                reflectiveQuadToRelative(0f, -23f)
                quadToRelative(5f, -12f, 17f, -16f)
                reflectiveQuadToRelative(24f, 1f)
                lineToRelative(90f, 42f)
                quadToRelative(11f, 5f, 15f, 16.5f)
                reflectiveQuadToRelative(-1f, 22.5f)
                quadToRelative(-5f, 11f, -16.5f, 15.5f)
                reflectiveQuadTo(853f, 468f)
                lineToRelative(-90f, -41f)
                close()
                moveToRelative(127f, -117f)
                horizontalLineTo(790f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(760f, 280f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(790f, 250f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(920f, 280f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(890f, 310f)
                close()
            }
        }.build()
        
        return _Barcode_reader!!
    }

private var _Barcode_reader: ImageVector? = null

