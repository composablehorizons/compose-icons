package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ambulance: ImageVector
    get() {
        if (_Ambulance != null) return _Ambulance!!
        
        _Ambulance = ImageVector.Builder(
            name = "ambulance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-177f, 57f)
                lineTo(143f, 97f)
                lineToRelative(57f, -57f)
                lineToRelative(120f, 120f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-23f, 503f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(131f, -270f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
                moveToRelative(29f, 110f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 360f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 560f)
                close()
                moveTo(120f, 920f)
                verticalLineToRelative(-360f)
                lineToRelative(98f, -280f)
                horizontalLineToRelative(142f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(131f)
                quadToRelative(-24f, 34f, -37.5f, 74.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineTo(274f)
                lineToRelative(-59f, 160f)
                horizontalLineToRelative(276f)
                quadToRelative(40f, 57f, 100f, 88.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(32f, 0f, 61.5f, -6.5f)
                reflectiveQuadTo(840f, 613f)
                verticalLineToRelative(307f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Ambulance!!
    }

private var _Ambulance: ImageVector? = null

