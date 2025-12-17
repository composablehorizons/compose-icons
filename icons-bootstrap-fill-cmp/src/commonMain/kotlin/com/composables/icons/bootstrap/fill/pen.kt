package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Pen: ImageVector
    get() {
        if (_Pen != null) return _Pen!!
        
        _Pen = ImageVector.Builder(
            name = "pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.498f, 0.795f)
                lineToRelative(0.149f, -0.149f)
                arcToRelative(1.207f, 1.207f, 0f, true, true, 1.707f, 1.708f)
                lineToRelative(-0.149f, 0.148f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.059f, 2.059f)
                lineTo(4.854f, 14.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.233f, 0.131f)
                lineToRelative(-4f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.606f, -0.606f)
                lineToRelative(1f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.131f, -0.232f)
                lineToRelative(9.642f, -9.642f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.642f, 0.056f)
                lineTo(6.854f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineTo(9.44f, 0.854f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 0.796f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.998f, -0.001f)
            }
        }.build()
        
        return _Pen!!
    }

private var _Pen: ImageVector? = null

