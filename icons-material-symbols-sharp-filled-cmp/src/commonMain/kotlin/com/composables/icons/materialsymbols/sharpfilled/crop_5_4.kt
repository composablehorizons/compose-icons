package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Crop_5_4: ImageVector
    get() {
        if (_Crop_5_4 != null) return _Crop_5_4!!
        
        _Crop_5_4 = ImageVector.Builder(
            name = "crop_5_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(640f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Crop_5_4!!
    }

private var _Crop_5_4: ImageVector? = null

