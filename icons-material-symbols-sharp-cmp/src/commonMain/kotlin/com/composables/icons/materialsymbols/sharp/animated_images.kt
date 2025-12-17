package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Animated_images: ImageVector
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
                moveToRelative(33f, 220f)
                horizontalLineToRelative(217f)
                lineToRelative(7f, 53f)
                lineToRelative(-587f, 72f)
                lineToRelative(-74f, -597f)
                lineToRelative(125f, -14f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 4f)
                lineToRelative(54f, 438f)
                lineToRelative(294f, -36f)
                close()
                moveToRelative(-232f, -80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(281f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(361f)
                verticalLineToRelative(440f)
                close()
                moveTo(219f, 796f)
                close()
                moveToRelative(362f, -416f)
                close()
            }
        }.build()
        
        return _Animated_images!!
    }

private var _Animated_images: ImageVector? = null

