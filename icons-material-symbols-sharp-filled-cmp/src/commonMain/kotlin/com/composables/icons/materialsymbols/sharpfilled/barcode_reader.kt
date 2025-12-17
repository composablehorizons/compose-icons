package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Barcode_reader: ImageVector
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
                horizontalLineToRelative(449f)
                lineTo(569f, 440f)
                horizontalLineTo(439f)
                lineToRelative(-11f, 40f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-94f)
                lineToRelative(-30f, 112f)
                quadToRelative(-11f, 39f, -43f, 63.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(520f, -640f)
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
            }
        }.build()
        
        return _Barcode_reader!!
    }

private var _Barcode_reader: ImageVector? = null

