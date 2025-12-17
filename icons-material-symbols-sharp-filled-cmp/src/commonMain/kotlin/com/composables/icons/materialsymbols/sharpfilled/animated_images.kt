package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Animated_images: ImageVector
    get() {
        if (_Animated_images != null) return _Animated_images!!
        
        _Animated_images = ImageVector.Builder(
            name = "animated_images",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 540f)
                lineToRelative(240f, -160f)
                lineToRelative(-240f, -160f)
                verticalLineToRelative(320f)
                close()
                moveTo(281f, 680f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(281f)
                close()
                moveTo(150f, 885f)
                lineTo(76f, 288f)
                lineToRelative(125f, -14f)
                verticalLineToRelative(486f)
                horizontalLineToRelative(531f)
                lineToRelative(7f, 53f)
                lineToRelative(-589f, 72f)
                close()
            }
        }.build()
        
        return _Animated_images!!
    }

private var _Animated_images: ImageVector? = null

