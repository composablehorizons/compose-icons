package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nfc_off: ImageVector
    get() {
        if (_Nfc_off != null) return _Nfc_off!!
        
        _Nfc_off = ImageVector.Builder(
            name = "nfc_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-527f)
                lineToRelative(-93f, -93f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -160f)
                verticalLineToRelative(-287f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(560f, 46f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-446f)
                horizontalLineTo(314f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(526f)
                close()
                moveTo(360f, 600f)
                horizontalLineToRelative(127f)
                lineTo(360f, 473f)
                verticalLineToRelative(127f)
                close()
                moveToRelative(320f, -34f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-126f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(46f)
                lineToRelative(-75f, -75f)
                quadToRelative(9f, -23f, 29f, -37f)
                reflectiveQuadToRelative(46f, -14f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(286f)
                close()
                moveToRelative(-256f, -30f)
                close()
                moveToRelative(113f, -113f)
                close()
            }
        }.build()
        
        return _Nfc_off!!
    }

private var _Nfc_off: ImageVector? = null

