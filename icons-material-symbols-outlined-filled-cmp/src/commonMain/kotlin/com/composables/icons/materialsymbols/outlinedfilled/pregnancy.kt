package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pregnancy: ImageVector
    get() {
        if (_Pregnancy != null) return _Pregnancy!!
        
        _Pregnancy = ImageVector.Builder(
            name = "pregnancy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(36f, 15f, 58f, 48f)
                reflectiveQuadToRelative(22f, 72f)
                verticalLineToRelative(160f)
                horizontalLineTo(520f)
                verticalLineToRelative(200f)
                horizontalLineTo(400f)
                close()
                moveToRelative(40f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(520f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(440f, 240f)
                close()
            }
        }.build()
        
        return _Pregnancy!!
    }

private var _Pregnancy: ImageVector? = null

