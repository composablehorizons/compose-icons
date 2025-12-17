package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`2Circle`: ImageVector
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
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(6.646f, 6.24f)
                verticalLineToRelative(0.07f)
                horizontalLineTo(5.375f)
                verticalLineToRelative(-0.064f)
                curveToRelative(0f, -1.213f, 0.879f, -2.402f, 2.637f, -2.402f)
                curveToRelative(1.582f, 0f, 2.613f, 0.949f, 2.613f, 2.215f)
                curveToRelative(0f, 1.002f, -0.6f, 1.667f, -1.287f, 2.43f)
                lineToRelative(-0.096f, 0.107f)
                lineToRelative(-1.974f, 2.22f)
                verticalLineToRelative(0.077f)
                horizontalLineToRelative(3.498f)
                verticalLineTo(12f)
                horizontalLineTo(5.422f)
                verticalLineToRelative(-0.832f)
                lineToRelative(2.97f, -3.293f)
                curveToRelative(0.434f, -0.475f, 0.903f, -1.008f, 0.903f, -1.705f)
                curveToRelative(0f, -0.744f, -0.557f, -1.236f, -1.313f, -1.236f)
                curveToRelative(-0.843f, 0f, -1.336f, 0.615f, -1.336f, 1.306f)
            }
        }.build()
        
        return _2Circle!!
    }

private var _2Circle: ImageVector? = null

