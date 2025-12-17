package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Lda: ImageVector
    get() {
        if (_Lda != null) return _Lda!!
        
        _Lda = ImageVector.Builder(
            name = "lda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 743f)
                lineToRelative(-191f, -80f)
                quadToRelative(-23f, -9f, -36f, -29.5f)
                reflectiveQuadTo(200f, 589f)
                verticalLineToRelative(-69f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 320f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 520f)
                verticalLineToRelative(69f)
                quadToRelative(0f, 24f, -13f, 44.5f)
                reflectiveQuadTo(711f, 663f)
                lineToRelative(-191f, 80f)
                verticalLineToRelative(97f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-97f)
                close()
                moveToRelative(-40f, -503f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, 416f)
                verticalLineToRelative(-136f)
                horizontalLineTo(280f)
                verticalLineToRelative(69f)
                lineToRelative(160f, 67f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(160f, -67f)
                verticalLineToRelative(-69f)
                horizontalLineTo(520f)
                verticalLineToRelative(136f)
                close()
                moveTo(400f, 240f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Lda!!
    }

private var _Lda: ImageVector? = null

