package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.102f, 2.223f)
                arcTo(3.004f, 3.004f, 0f, false, false, 3.78f, 5.897f)
                lineToRelative(6.341f, 6.252f)
                arcTo(3.003f, 3.003f, 0f, false, false, 13f, 16f)
                arcToRelative(3f, 3f, 0f, true, false, -0.851f, -5.878f)
                lineTo(5.897f, 3.781f)
                arcTo(3.004f, 3.004f, 0f, false, false, 2.223f, 0.1f)
                lineToRelative(2.141f, 2.142f)
                lineTo(4f, 4f)
                lineToRelative(-1.757f, 0.364f)
                close()
                moveToRelative(13.37f, 9.019f)
                lineToRelative(0.528f, 0.026f)
                lineToRelative(0.287f, 0.445f)
                lineToRelative(0.445f, 0.287f)
                lineToRelative(0.026f, 0.529f)
                lineTo(15f, 13f)
                lineToRelative(-0.242f, 0.471f)
                lineToRelative(-0.026f, 0.529f)
                lineToRelative(-0.445f, 0.287f)
                lineToRelative(-0.287f, 0.445f)
                lineToRelative(-0.529f, 0.026f)
                lineTo(13f, 15f)
                lineToRelative(-0.471f, -0.242f)
                lineToRelative(-0.529f, -0.026f)
                lineToRelative(-0.287f, -0.445f)
                lineToRelative(-0.445f, -0.287f)
                lineToRelative(-0.026f, -0.529f)
                lineTo(11f, 13f)
                lineToRelative(0.242f, -0.471f)
                lineToRelative(0.026f, -0.529f)
                lineToRelative(0.445f, -0.287f)
                lineToRelative(0.287f, -0.445f)
                lineToRelative(0.529f, -0.026f)
                lineTo(13f, 11f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null

