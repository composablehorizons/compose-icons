package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Skillet_cooktop: ImageVector
    get() {
        if (_Skillet_cooktop != null) return _Skillet_cooktop!!
        
        _Skillet_cooktop = ImageVector.Builder(
            name = "skillet_cooktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 600f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-69f)
                lineToRelative(267f, -89f)
                lineToRelative(25f, 76f)
                lineToRelative(-212f, 71f)
                verticalLineToRelative(291f)
                horizontalLineTo(120f)
                close()
                moveToRelative(240f, 240f)
                verticalLineToRelative(-120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Skillet_cooktop!!
    }

private var _Skillet_cooktop: ImageVector? = null

