package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Smoke_free: ImageVector
    get() {
        if (_Smoke_free != null) return _Smoke_free!!
        
        _Smoke_free = ImageVector.Builder(
            name = "smoke_free",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(528f, 640f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(328f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-38f, -264f)
                lineToRelative(-34f, -34f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-26f)
                close()
                moveToRelative(66f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-140f, -74f)
                lineToRelative(-46f, -46f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(40f, -86f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -39f, -23f, -59.5f)
                reflectiveQuadTo(642f, 348f)
                horizontalLineToRelative(-62f)
                quadToRelative(-56f, 0f, -95f, -39f)
                reflectiveQuadToRelative(-39f, -95f)
                quadToRelative(0f, -56f, 39f, -95f)
                reflectiveQuadToRelative(95f, -39f)
                verticalLineToRelative(60f)
                quadToRelative(-30f, 0f, -52f, 21f)
                reflectiveQuadToRelative(-22f, 53f)
                quadToRelative(0f, 32f, 22f, 53f)
                reflectiveQuadToRelative(52f, 21f)
                horizontalLineToRelative(62f)
                quadToRelative(56f, 0f, 97f, 36f)
                reflectiveQuadToRelative(41f, 90f)
                verticalLineToRelative(66f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(100f, 0f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -66f, -46f, -114f)
                reflectiveQuadToRelative(-114f, -48f)
                verticalLineToRelative(-60f)
                quadToRelative(30f, 0f, 52f, -22f)
                reflectiveQuadToRelative(22f, -52f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, 29f, -11f, 52.5f)
                reflectiveQuadTo(754f, 190f)
                quadToRelative(56f, 26f, 91f, 80f)
                reflectiveQuadToRelative(35f, 120f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Smoke_free!!
    }

private var _Smoke_free: ImageVector? = null

