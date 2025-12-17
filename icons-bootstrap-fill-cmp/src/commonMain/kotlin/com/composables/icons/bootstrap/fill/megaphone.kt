package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                verticalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                close()
                moveToRelative(-1f, 0.724f)
                curveToRelative(-2.067f, 0.95f, -4.539f, 1.481f, -7f, 1.656f)
                verticalLineToRelative(6.237f)
                arcToRelative(25f, 25f, 0f, false, true, 1.088f, 0.085f)
                curveToRelative(2.053f, 0.204f, 4.038f, 0.668f, 5.912f, 1.56f)
                close()
                moveToRelative(-8f, 7.841f)
                verticalLineTo(4.934f)
                curveToRelative(-0.68f, 0.027f, -1.399f, 0.043f, -2.008f, 0.053f)
                arcTo(2.02f, 2.02f, 0f, false, false, 0f, 7f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.106f, 0.896f, 1.996f, 1.994f, 2.009f)
                lineToRelative(0.496f, 0.008f)
                arcToRelative(64f, 64f, 0f, false, true, 1.51f, 0.048f)
                moveToRelative(1.39f, 1.081f)
                quadToRelative(0.428f, 0.032f, 0.85f, 0.078f)
                lineToRelative(0.253f, 1.69f)
                arcToRelative(1f, 1f, 0f, false, true, -0.983f, 1.187f)
                horizontalLineToRelative(-0.548f)
                arcToRelative(1f, 1f, 0f, false, true, -0.916f, -0.599f)
                lineToRelative(-1.314f, -2.48f)
                arcToRelative(66f, 66f, 0f, false, true, 1.692f, 0.064f)
                quadToRelative(0.491f, 0.026f, 0.966f, 0.06f)
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

