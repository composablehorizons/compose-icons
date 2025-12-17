package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AlphabetUppercase: ImageVector
    get() {
        if (_AlphabetUppercase != null) return _AlphabetUppercase!!
        
        _AlphabetUppercase = ImageVector.Builder(
            name = "alphabet-uppercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.226f, 10.88f)
                horizontalLineTo(0f)
                lineToRelative(2.056f, -6.26f)
                horizontalLineToRelative(1.42f)
                lineToRelative(2.047f, 6.26f)
                horizontalLineToRelative(-1.29f)
                lineToRelative(-0.48f, -1.61f)
                horizontalLineTo(1.707f)
                lineToRelative(-0.48f, 1.61f)
                close()
                moveTo(2.76f, 5.818f)
                horizontalLineToRelative(-0.054f)
                lineToRelative(-0.75f, 2.532f)
                horizontalLineTo(3.51f)
                close()
                moveToRelative(3.217f, 5.062f)
                verticalLineTo(4.62f)
                horizontalLineToRelative(2.56f)
                curveToRelative(1.09f, 0f, 1.808f, 0.582f, 1.808f, 1.54f)
                curveToRelative(0f, 0.762f, -0.444f, 1.22f, -1.05f, 1.372f)
                verticalLineToRelative(0.055f)
                curveToRelative(0.736f, 0.074f, 1.365f, 0.587f, 1.365f, 1.528f)
                curveToRelative(0f, 1.119f, -0.89f, 1.766f, -2.133f, 1.766f)
                close()
                moveTo(7.18f, 5.55f)
                verticalLineToRelative(1.675f)
                horizontalLineToRelative(0.8f)
                curveToRelative(0.812f, 0f, 1.171f, -0.308f, 1.171f, -0.853f)
                curveToRelative(0f, -0.51f, -0.328f, -0.822f, -0.898f, -0.822f)
                close()
                moveToRelative(0f, 2.537f)
                verticalLineTo(9.95f)
                horizontalLineToRelative(0.903f)
                curveToRelative(0.951f, 0f, 1.342f, -0.312f, 1.342f, -0.909f)
                curveToRelative(0f, -0.591f, -0.382f, -0.954f, -1.095f, -0.954f)
                close()
                moveToRelative(5.089f, -0.711f)
                verticalLineToRelative(0.775f)
                curveToRelative(0f, 1.156f, 0.49f, 1.803f, 1.347f, 1.803f)
                curveToRelative(0.705f, 0f, 1.163f, -0.454f, 1.212f, -1.096f)
                horizontalLineTo(16f)
                verticalLineToRelative(0.12f)
                curveTo(15.942f, 10.173f, 14.95f, 11f, 13.607f, 11f)
                curveToRelative(-1.648f, 0f, -2.573f, -1.073f, -2.573f, -2.849f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0f, -1.775f, 0.934f, -2.871f, 2.573f, -2.871f)
                curveToRelative(1.347f, 0f, 2.34f, 0.849f, 2.393f, 2.087f)
                verticalLineToRelative(0.115f)
                horizontalLineToRelative(-1.172f)
                curveToRelative(-0.05f, -0.665f, -0.516f, -1.156f, -1.212f, -1.156f)
                curveToRelative(-0.849f, 0f, -1.347f, 0.67f, -1.347f, 1.83f)
            }
        }.build()
        
        return _AlphabetUppercase!!
    }

private var _AlphabetUppercase: ImageVector? = null

