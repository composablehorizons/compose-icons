package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Carpenter: ImageVector
    get() {
        if (_Carpenter != null) return _Carpenter!!
        
        _Carpenter = ImageVector.Builder(
            name = "carpenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(563f, 908f)
                lineTo(393f, 739f)
                lineToRelative(57f, -57f)
                lineToRelative(-326f, -466f)
                lineToRelative(156f, -156f)
                lineToRelative(566f, 565f)
                lineTo(563f, 908f)
                close()
                moveToRelative(0f, -113f)
                lineToRelative(169f, -169f)
                lineToRelative(-56f, -57f)
                lineToRelative(-170f, 170f)
                lineToRelative(57f, 56f)
                close()
            }
        }.build()
        
        return _Carpenter!!
    }

private var _Carpenter: ImageVector? = null

