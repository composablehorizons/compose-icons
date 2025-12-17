package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`2Circle`: ImageVector
    get() {
        if (_2Circle != null) return _2Circle!!
        
        _2Circle = ImageVector.Builder(
            name = "2-circle",
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
                moveTo(6.646f, 6.24f)
                curveToRelative(0f, -0.691f, 0.493f, -1.306f, 1.336f, -1.306f)
                curveToRelative(0.756f, 0f, 1.313f, 0.492f, 1.313f, 1.236f)
                curveToRelative(0f, 0.697f, -0.469f, 1.23f, -0.902f, 1.705f)
                lineToRelative(-2.971f, 3.293f)
                verticalLineTo(12f)
                horizontalLineToRelative(5.344f)
                verticalLineToRelative(-1.107f)
                horizontalLineTo(7.268f)
                verticalLineToRelative(-0.077f)
                lineToRelative(1.974f, -2.22f)
                lineToRelative(0.096f, -0.107f)
                curveToRelative(0.688f, -0.763f, 1.287f, -1.428f, 1.287f, -2.43f)
                curveToRelative(0f, -1.266f, -1.031f, -2.215f, -2.613f, -2.215f)
                curveToRelative(-1.758f, 0f, -2.637f, 1.19f, -2.637f, 2.402f)
                verticalLineToRelative(0.065f)
                horizontalLineToRelative(1.271f)
                verticalLineToRelative(-0.07f)
                close()
            }
        }.build()
        
        return _2Circle!!
    }

private var _2Circle: ImageVector? = null

