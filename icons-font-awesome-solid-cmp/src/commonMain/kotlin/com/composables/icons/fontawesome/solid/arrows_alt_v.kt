package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowsAltV: ImageVector
    get() {
        if (_ArrowsAltV != null) return _ArrowsAltV!!
        
        _ArrowsAltV = ImageVector.Builder(
            name = "arrows-alt-v",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(214.059f, 377.941f)
                horizontalLineTo(168f)
                verticalLineTo(134.059f)
                horizontalLineToRelative(46.059f)
                curveToRelative(21.382f, 0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineTo(144.971f, 7.029f)
                curveToRelative(-9.373f, -9.373f, -24.568f, -9.373f, -33.941f, 0f)
                lineTo(24.971f, 93.088f)
                curveToRelative(-15.119f, 15.119f, -4.411f, 40.971f, 16.971f, 40.971f)
                horizontalLineTo(88f)
                verticalLineToRelative(243.882f)
                horizontalLineTo(41.941f)
                curveToRelative(-21.382f, 0f, -32.09f, 25.851f, -16.971f, 40.971f)
                lineToRelative(86.059f, 86.059f)
                curveToRelative(9.373f, 9.373f, 24.568f, 9.373f, 33.941f, 0f)
                lineToRelative(86.059f, -86.059f)
                curveToRelative(15.12f, -15.119f, 4.412f, -40.971f, -16.97f, -40.971f)
                close()
            }
        }.build()
        
        return _ArrowsAltV!!
    }

private var _ArrowsAltV: ImageVector? = null

