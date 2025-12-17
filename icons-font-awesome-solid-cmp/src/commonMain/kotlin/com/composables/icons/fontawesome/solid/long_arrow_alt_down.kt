package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LongArrowAltDown: ImageVector
    get() {
        if (_LongArrowAltDown != null) return _LongArrowAltDown!!
        
        _LongArrowAltDown = ImageVector.Builder(
            name = "long-arrow-alt-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(168f, 345.941f)
                verticalLineTo(44f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-56f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(301.941f)
                horizontalLineTo(41.941f)
                curveToRelative(-21.382f, 0f, -32.09f, 25.851f, -16.971f, 40.971f)
                lineToRelative(86.059f, 86.059f)
                curveToRelative(9.373f, 9.373f, 24.569f, 9.373f, 33.941f, 0f)
                lineToRelative(86.059f, -86.059f)
                curveToRelative(15.119f, -15.119f, 4.411f, -40.971f, -16.971f, -40.971f)
                horizontalLineTo(168f)
                close()
            }
        }.build()
        
        return _LongArrowAltDown!!
    }

private var _LongArrowAltDown: ImageVector? = null

