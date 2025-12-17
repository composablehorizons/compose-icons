package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`9Circle`: ImageVector
    get() {
        if (_9Circle != null) return _9Circle!!
        
        _9Circle = ImageVector.Builder(
            name = "9-circle",
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
                moveToRelative(-8.223f, 4.146f)
                curveToRelative(2.104f, 0f, 3.123f, -1.464f, 3.123f, -4.3f)
                curveToRelative(0f, -3.147f, -1.459f, -4.014f, -2.97f, -4.014f)
                curveToRelative(-1.63f, 0f, -2.871f, 1.02f, -2.871f, 2.73f)
                curveToRelative(0f, 1.706f, 1.171f, 2.667f, 2.566f, 2.667f)
                curveToRelative(1.06f, 0f, 1.7f, -0.557f, 1.934f, -1.184f)
                horizontalLineToRelative(0.076f)
                curveToRelative(0.047f, 1.67f, -0.475f, 3.023f, -1.834f, 3.023f)
                curveToRelative(-0.71f, 0f, -1.149f, -0.363f, -1.248f, -0.72f)
                horizontalLineTo(5.258f)
                curveToRelative(0.094f, 0.908f, 0.926f, 1.798f, 2.52f, 1.798f)
                close()
                moveToRelative(0.118f, -3.972f)
                curveToRelative(0.808f, 0f, 1.535f, -0.528f, 1.535f, -1.594f)
                reflectiveCurveToRelative(-0.668f, -1.676f, -1.56f, -1.676f)
                curveToRelative(-0.838f, 0f, -1.517f, 0.616f, -1.517f, 1.659f)
                curveToRelative(0f, 1.072f, 0.708f, 1.61f, 1.54f, 1.61f)
                close()
            }
        }.build()
        
        return _9Circle!!
    }

private var _9Circle: ImageVector? = null

