package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mop: ImageVector
    get() {
        if (_Mop != null) return _Mop!!
        
        _Mop = ImageVector.Builder(
            name = "mop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(280f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-58f, 240f)
                horizontalLineToRelative(98f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 760f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(98f)
                lineToRelative(-40f, -160f)
                horizontalLineTo(182f)
                lineToRelative(-40f, 160f)
                close()
                moveToRelative(676f, 80f)
                horizontalLineTo(142f)
                quadToRelative(-39f, 0f, -63f, -31f)
                reflectiveQuadToRelative(-14f, -69f)
                lineToRelative(55f, -220f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 520f)
                verticalLineToRelative(80f)
                lineToRelative(55f, 220f)
                quadToRelative(13f, 38f, -11.5f, 69f)
                reflectiveQuadTo(818f, 920f)
                close()
                moveToRelative(-58f, -400f)
                horizontalLineTo(200f)
                horizontalLineToRelative(560f)
                close()
                moveToRelative(-240f, -80f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Mop!!
    }

private var _Mop: ImageVector? = null

