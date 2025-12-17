package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shop: ImageVector
    get() {
        if (_Shop != null) return _Shop!!
        
        _Shop = ImageVector.Builder(
            name = "shop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-20f, 480f)
                lineToRelative(280f, -180f)
                lineToRelative(-280f, -180f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Shop!!
    }

private var _Shop: ImageVector? = null

