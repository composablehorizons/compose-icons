package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Balcony: ImageVector
    get() {
        if (_Balcony != null) return _Balcony!!
        
        _Balcony = ImageVector.Builder(
            name = "balcony",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -66f, 25f, -124.5f)
                reflectiveQuadToRelative(68.5f, -102f)
                quadTo(297f, 130f, 355.5f, 105f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(66f, 0f, 124.5f, 25f)
                reflectiveQuadToRelative(102f, 68.5f)
                quadTo(750f, 217f, 775f, 275.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-397f)
                quadToRelative(-86f, 14f, -143f, 80.5f)
                reflectiveQuadTo(240f, 400f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -90f, -57f, -156.5f)
                reflectiveQuadTo(520f, 163f)
                verticalLineToRelative(397f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Balcony!!
    }

private var _Balcony: ImageVector? = null

