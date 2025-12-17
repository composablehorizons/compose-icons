package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowsAltH: ImageVector
    get() {
        if (_ArrowsAltH != null) return _ArrowsAltH!!
        
        _ArrowsAltH = ImageVector.Builder(
            name = "arrows-alt-h",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(377.941f, 169.941f)
                verticalLineTo(216f)
                horizontalLineTo(134.059f)
                verticalLineToRelative(-46.059f)
                curveToRelative(0f, -21.382f, -25.851f, -32.09f, -40.971f, -16.971f)
                lineTo(7.029f, 239.029f)
                curveToRelative(-9.373f, 9.373f, -9.373f, 24.568f, 0f, 33.941f)
                lineToRelative(86.059f, 86.059f)
                curveToRelative(15.119f, 15.119f, 40.971f, 4.411f, 40.971f, -16.971f)
                verticalLineTo(296f)
                horizontalLineToRelative(243.882f)
                verticalLineToRelative(46.059f)
                curveToRelative(0f, 21.382f, 25.851f, 32.09f, 40.971f, 16.971f)
                lineToRelative(86.059f, -86.059f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.568f, 0f, -33.941f)
                lineToRelative(-86.059f, -86.059f)
                curveToRelative(-15.119f, -15.12f, -40.971f, -4.412f, -40.971f, 16.97f)
                close()
            }
        }.build()
        
        return _ArrowsAltH!!
    }

private var _ArrowsAltH: ImageVector? = null

