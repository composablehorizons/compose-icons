package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Crop: ImageVector
    get() {
        if (_Crop != null) return _Crop!!
        
        _Crop = ImageVector.Builder(
            name = "crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 920f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(-480f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Crop!!
    }

private var _Crop: ImageVector? = null

