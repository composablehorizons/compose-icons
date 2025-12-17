package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Trash2: ImageVector
    get() {
        if (_Trash2 != null) return _Trash2!!
        
        _Trash2 = ImageVector.Builder(
            name = "trash2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.037f, 3.225f)
                arcTo(0.7f, 0.7f, 0f, false, true, 2f, 3f)
                curveToRelative(0f, -1.105f, 2.686f, -2f, 6f, -2f)
                reflectiveCurveToRelative(6f, 0.895f, 6f, 2f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.037f, 0.225f)
                lineToRelative(-1.684f, 10.104f)
                arcTo(2f, 2f, 0f, false, true, 10.305f, 15f)
                horizontalLineTo(5.694f)
                arcToRelative(2f, 2f, 0f, false, true, -1.973f, -1.671f)
                close()
                moveToRelative(9.89f, -0.69f)
                curveTo(10.966f, 2.214f, 9.578f, 2f, 8f, 2f)
                curveToRelative(-1.58f, 0f, -2.968f, 0.215f, -3.926f, 0.534f)
                curveToRelative(-0.477f, 0.16f, -0.795f, 0.327f, -0.975f, 0.466f)
                curveToRelative(0.18f, 0.14f, 0.498f, 0.307f, 0.975f, 0.466f)
                curveTo(5.032f, 3.786f, 6.42f, 4f, 8f, 4f)
                reflectiveCurveToRelative(2.967f, -0.215f, 3.926f, -0.534f)
                curveToRelative(0.477f, -0.16f, 0.795f, -0.327f, 0.975f, -0.466f)
                curveToRelative(-0.18f, -0.14f, -0.498f, -0.307f, -0.975f, -0.466f)
                close()
            }
        }.build()
        
        return _Trash2!!
    }

private var _Trash2: ImageVector? = null

