package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Edit_square: ImageVector
    get() {
        if (_Edit_square != null) return _Edit_square!!
        
        _Edit_square = ImageVector.Builder(
            name = "edit_square",
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
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(357f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-278f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(358f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -360f)
                close()
                moveTo(360f, 600f)
                verticalLineToRelative(-170f)
                lineToRelative(367f, -367f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(56f, 57f)
                quadToRelative(11f, 12f, 17f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -5.5f, 29.5f)
                reflectiveQuadTo(897f, 232f)
                lineTo(530f, 600f)
                horizontalLineTo(360f)
                close()
                moveToRelative(481f, -424f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, 56f)
                close()
                moveTo(440f, 520f)
                horizontalLineToRelative(56f)
                lineToRelative(232f, -232f)
                lineToRelative(-28f, -28f)
                lineToRelative(-29f, -28f)
                lineToRelative(-231f, 231f)
                verticalLineToRelative(57f)
                close()
                moveToRelative(260f, -260f)
                lineToRelative(-29f, -28f)
                lineToRelative(29f, 28f)
                lineToRelative(28f, 28f)
                lineToRelative(-28f, -28f)
                close()
            }
        }.build()
        
        return _Edit_square!!
    }

private var _Edit_square: ImageVector? = null

