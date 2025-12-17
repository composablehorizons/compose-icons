package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Crop_9_16: ImageVector
    get() {
        if (_Crop_9_16 != null) return _Crop_9_16!!
        
        _Crop_9_16 = ImageVector.Builder(
            name = "crop_9_16",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(720f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Crop_9_16!!
    }

private var _Crop_9_16: ImageVector? = null

