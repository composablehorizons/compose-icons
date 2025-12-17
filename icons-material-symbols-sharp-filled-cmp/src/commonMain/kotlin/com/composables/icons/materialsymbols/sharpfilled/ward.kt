package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ward: ImageVector
    get() {
        if (_Ward != null) return _Ward!!
        
        _Ward = ImageVector.Builder(
            name = "ward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-720f)
                close()
                moveTo(280f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(800f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -459f)
                quadToRelative(18f, -11f, 38f, -16f)
                reflectiveQuadToRelative(42f, -5f)
                horizontalLineToRelative(200f)
                quadToRelative(22f, 0f, 42f, 5f)
                reflectiveQuadToRelative(38f, 16f)
                verticalLineToRelative(-261f)
                horizontalLineTo(360f)
                verticalLineToRelative(261f)
                close()
                moveToRelative(180f, -61f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 360f)
                close()
                moveToRelative(-40f, 400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Ward!!
    }

private var _Ward: ImageVector? = null

