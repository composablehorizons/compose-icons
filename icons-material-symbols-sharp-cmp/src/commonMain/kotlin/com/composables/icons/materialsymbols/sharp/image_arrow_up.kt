package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Image_arrow_up: ImageVector
    get() {
        if (_Image_arrow_up != null) return _Image_arrow_up!!
        
        _Image_arrow_up = ImageVector.Builder(
            name = "image_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -160f)
                horizontalLineToRelative(480f)
                lineTo(570f, 480f)
                lineTo(450f, 640f)
                lineToRelative(-90f, -120f)
                lineToRelative(-120f, 160f)
                close()
                moveToRelative(480f, -280f)
                verticalLineToRelative(-167f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(167f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Image_arrow_up!!
    }

private var _Image_arrow_up: ImageVector? = null

