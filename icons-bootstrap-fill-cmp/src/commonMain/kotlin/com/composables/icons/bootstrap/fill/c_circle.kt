package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CCircle: ImageVector
    get() {
        if (_CCircle != null) return _CCircle!!
        
        _CCircle = ImageVector.Builder(
            name = "c-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(8.146f, 4.992f)
                curveToRelative(0.961f, 0f, 1.641f, 0.633f, 1.729f, 1.512f)
                horizontalLineToRelative(1.295f)
                verticalLineToRelative(-0.088f)
                curveToRelative(-0.094f, -1.518f, -1.348f, -2.572f, -3.03f, -2.572f)
                curveToRelative(-2.068f, 0f, -3.269f, 1.377f, -3.269f, 3.638f)
                verticalLineToRelative(1.073f)
                curveToRelative(0f, 2.267f, 1.178f, 3.603f, 3.27f, 3.603f)
                curveToRelative(1.675f, 0f, 2.93f, -1.02f, 3.029f, -2.467f)
                verticalLineToRelative(-0.093f)
                horizontalLineTo(9.875f)
                curveToRelative(-0.088f, 0.832f, -0.75f, 1.418f, -1.729f, 1.418f)
                curveToRelative(-1.224f, 0f, -1.927f, -0.891f, -1.927f, -2.461f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0f, -1.583f, 0.715f, -2.503f, 1.927f, -2.503f)
            }
        }.build()
        
        return _CCircle!!
    }

private var _CCircle: ImageVector? = null

