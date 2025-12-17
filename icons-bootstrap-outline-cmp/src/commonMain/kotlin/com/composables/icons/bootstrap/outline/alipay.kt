package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Alipay: ImageVector
    get() {
        if (_Alipay != null) return _Alipay!!
        
        _Alipay = ImageVector.Builder(
            name = "alipay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.541f, 0f)
                horizontalLineTo(13.5f)
                arcToRelative(2.55f, 2.55f, 0f, false, true, 2.54f, 2.563f)
                verticalLineToRelative(8.297f)
                curveToRelative(-0.006f, 0f, -0.531f, -0.046f, -2.978f, -0.813f)
                curveToRelative(-0.412f, -0.14f, -0.916f, -0.327f, -1.479f, -0.536f)
                quadToRelative(-0.456f, -0.17f, -0.957f, -0.353f)
                arcToRelative(13f, 13f, 0f, false, false, 1.325f, -3.373f)
                horizontalLineTo(8.822f)
                verticalLineTo(4.649f)
                horizontalLineToRelative(3.831f)
                verticalLineToRelative(-0.634f)
                horizontalLineToRelative(-3.83f)
                verticalLineTo(2.121f)
                horizontalLineTo(7.26f)
                curveToRelative(-0.274f, 0f, -0.274f, 0.273f, -0.274f, 0.273f)
                verticalLineToRelative(1.621f)
                horizontalLineTo(3.11f)
                verticalLineToRelative(0.634f)
                horizontalLineToRelative(3.875f)
                verticalLineToRelative(1.136f)
                horizontalLineToRelative(-3.2f)
                verticalLineToRelative(0.634f)
                horizontalLineTo(9.99f)
                curveToRelative(-0.227f, 0.789f, -0.532f, 1.53f, -0.894f, 2.202f)
                curveToRelative(-2.013f, -0.67f, -4.161f, -1.212f, -5.51f, -0.878f)
                curveToRelative(-0.864f, 0.214f, -1.42f, 0.597f, -1.746f, 0.998f)
                curveToRelative(-1.499f, 1.84f, -0.424f, 4.633f, 2.741f, 4.633f)
                curveToRelative(1.872f, 0f, 3.675f, -1.053f, 5.072f, -2.787f)
                curveToRelative(2.08f, 1.008f, 6.37f, 2.738f, 6.387f, 2.745f)
                verticalLineToRelative(0.105f)
                arcTo(2.55f, 2.55f, 0f, false, true, 13.5f, 16f)
                horizontalLineTo(2.541f)
                arcTo(2.55f, 2.55f, 0f, false, true, 0f, 13.437f)
                verticalLineTo(2.563f)
                arcTo(2.55f, 2.55f, 0f, false, true, 2.541f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.309f, 9.27f)
                curveToRelative(-1.22f, 1.073f, -0.49f, 3.034f, 1.978f, 3.034f)
                curveToRelative(1.434f, 0f, 2.868f, -0.925f, 3.994f, -2.406f)
                curveToRelative(-1.602f, -0.789f, -2.959f, -1.353f, -4.425f, -1.207f)
                curveToRelative(-0.397f, 0.04f, -1.14f, 0.217f, -1.547f, 0.58f)
                close()
            }
        }.build()
        
        return _Alipay!!
    }

private var _Alipay: ImageVector? = null

