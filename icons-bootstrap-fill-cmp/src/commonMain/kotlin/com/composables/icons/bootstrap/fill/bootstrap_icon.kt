package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bootstrap: ImageVector
    get() {
        if (_Bootstrap != null) return _Bootstrap!!
        
        _Bootstrap = ImageVector.Builder(
            name = "bootstrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.375f, 7.125f)
                verticalLineTo(4.658f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.973f, 0f, 1.542f, 0.457f, 1.542f, 1.237f)
                curveToRelative(0f, 0.802f, -0.604f, 1.23f, -1.764f, 1.23f)
                close()
                moveToRelative(0f, 3.762f)
                horizontalLineToRelative(1.898f)
                curveToRelative(1.184f, 0f, 1.81f, -0.48f, 1.81f, -1.377f)
                curveToRelative(0f, -0.885f, -0.65f, -1.348f, -1.886f, -1.348f)
                horizontalLineTo(6.375f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.002f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                close()
                moveToRelative(1.06f, 12f)
                verticalLineTo(3.545f)
                horizontalLineToRelative(3.399f)
                curveToRelative(1.587f, 0f, 2.543f, 0.809f, 2.543f, 2.11f)
                curveToRelative(0f, 0.884f, -0.65f, 1.675f, -1.483f, 1.816f)
                verticalLineToRelative(0.1f)
                curveToRelative(1.143f, 0.117f, 1.904f, 0.931f, 1.904f, 2.033f)
                curveToRelative(0f, 1.488f, -1.084f, 2.396f, -2.888f, 2.396f)
                close()
            }
        }.build()
        
        return _Bootstrap!!
    }

private var _Bootstrap: ImageVector? = null

