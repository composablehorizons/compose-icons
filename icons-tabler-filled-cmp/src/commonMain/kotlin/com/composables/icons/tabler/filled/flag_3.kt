package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flag3: ImageVector
    get() {
        if (_Flag3 != null) return _Flag3!!
        
        _Flag3 = ImageVector.Builder(
            name = "flag-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 4f)
                curveToRelative(0.852f, 0f, 1.297f, 0.986f, 0.783f, 1.623f)
                lineToRelative(-0.076f, 0.084f)
                lineToRelative(-3.792f, 3.793f)
                lineToRelative(3.792f, 3.793f)
                curveToRelative(0.603f, 0.602f, 0.22f, 1.614f, -0.593f, 1.701f)
                lineToRelative(-0.114f, 0.006f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Flag3!!
    }

private var _Flag3: ImageVector? = null

