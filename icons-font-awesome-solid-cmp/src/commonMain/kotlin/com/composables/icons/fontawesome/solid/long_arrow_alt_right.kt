package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LongArrowAltRight: ImageVector
    get() {
        if (_LongArrowAltRight != null) return _LongArrowAltRight!!
        
        _LongArrowAltRight = ImageVector.Builder(
            name = "long-arrow-alt-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313.941f, 216f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(301.941f)
                verticalLineToRelative(46.059f)
                curveToRelative(0f, 21.382f, 25.851f, 32.09f, 40.971f, 16.971f)
                lineToRelative(86.059f, -86.059f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.569f, 0f, -33.941f)
                lineToRelative(-86.059f, -86.059f)
                curveToRelative(-15.119f, -15.119f, -40.971f, -4.411f, -40.971f, 16.971f)
                verticalLineTo(216f)
                close()
            }
        }.build()
        
        return _LongArrowAltRight!!
    }

private var _LongArrowAltRight: ImageVector? = null

