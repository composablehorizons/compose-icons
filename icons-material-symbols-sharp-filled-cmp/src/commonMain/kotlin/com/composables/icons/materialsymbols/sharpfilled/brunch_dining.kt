package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Brunch_dining: ImageVector
    get() {
        if (_Brunch_dining != null) return _Brunch_dining!!
        
        _Brunch_dining = ImageVector.Builder(
            name = "brunch_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(720f, 880f)
                verticalLineToRelative(-244f)
                quadToRelative(-36f, -41f, -58f, -81f)
                reflectiveQuadToRelative(-22f, -97f)
                verticalLineToRelative(-378f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(378f)
                quadToRelative(0f, 57f, -21.5f, 97.5f)
                reflectiveQuadTo(800f, 636f)
                verticalLineToRelative(164f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Brunch_dining!!
    }

private var _Brunch_dining: ImageVector? = null

