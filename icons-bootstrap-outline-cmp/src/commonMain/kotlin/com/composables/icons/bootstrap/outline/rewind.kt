package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Rewind: ImageVector
    get() {
        if (_Rewind != null) return _Rewind!!
        
        _Rewind = ImageVector.Builder(
            name = "rewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.196f, 8f)
                lineTo(15f, 4.633f)
                verticalLineToRelative(6.734f)
                close()
                moveToRelative(-0.792f, -0.696f)
                arcToRelative(0.802f, 0.802f, 0f, false, false, 0f, 1.392f)
                lineToRelative(6.363f, 3.692f)
                curveToRelative(0.52f, 0.302f, 1.233f, -0.043f, 1.233f, -0.696f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.653f, -0.713f, -0.998f, -1.233f, -0.696f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.196f, 8f)
                lineTo(7f, 4.633f)
                verticalLineToRelative(6.734f)
                close()
                moveToRelative(-0.792f, -0.696f)
                arcToRelative(0.802f, 0.802f, 0f, false, false, 0f, 1.392f)
                lineToRelative(6.363f, 3.692f)
                curveToRelative(0.52f, 0.302f, 1.233f, -0.043f, 1.233f, -0.696f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.653f, -0.713f, -0.998f, -1.233f, -0.696f)
                close()
            }
        }.build()
        
        return _Rewind!!
    }

private var _Rewind: ImageVector? = null

