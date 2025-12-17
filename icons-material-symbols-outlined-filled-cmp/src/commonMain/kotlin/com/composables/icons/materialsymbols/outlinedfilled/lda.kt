package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Lda: ImageVector
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
                moveTo(440f, 880f)
                verticalLineToRelative(-137f)
                lineTo(200f, 642f)
                verticalLineToRelative(-202f)
                horizontalLineToRelative(240f)
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
                horizontalLineToRelative(240f)
                verticalLineToRelative(202f)
                lineTo(520f, 743f)
                verticalLineToRelative(137f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -224f)
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
            }
        }.build()
        
        return _Lda!!
    }

private var _Lda: ImageVector? = null

