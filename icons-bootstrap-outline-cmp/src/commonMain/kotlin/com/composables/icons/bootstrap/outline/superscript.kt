package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Superscript: ImageVector
    get() {
        if (_Superscript != null) return _Superscript!!
        
        _Superscript = ImageVector.Builder(
            name = "superscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.266f, 12.496f)
                lineToRelative(0.96f, -2.853f)
                horizontalLineTo(8.76f)
                lineToRelative(0.96f, 2.853f)
                horizontalLineTo(11f)
                lineTo(7.62f, 3f)
                horizontalLineTo(6.38f)
                lineTo(3f, 12.496f)
                close()
                moveToRelative(2.748f, -8.063f)
                lineToRelative(1.419f, 4.23f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(1.426f, -4.23f)
                close()
                moveToRelative(5.132f, -1.797f)
                verticalLineToRelative(-0.075f)
                curveToRelative(0f, -0.332f, 0.234f, -0.618f, 0.619f, -0.618f)
                curveToRelative(0.354f, 0f, 0.618f, 0.256f, 0.618f, 0.58f)
                curveToRelative(0f, 0.362f, -0.271f, 0.649f, -0.52f, 0.898f)
                lineToRelative(-1.788f, 1.832f)
                verticalLineTo(6f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(-0.958f)
                horizontalLineToRelative(-1.923f)
                verticalLineToRelative(-0.045f)
                lineToRelative(0.973f, -1.04f)
                curveToRelative(0.415f, -0.438f, 0.867f, -0.845f, 0.867f, -1.547f)
                curveToRelative(0f, -0.8f, -0.701f, -1.41f, -1.787f, -1.41f)
                curveTo(11.565f, 1f, 11f, 1.8f, 11f, 2.576f)
                verticalLineToRelative(0.06f)
                close()
            }
        }.build()
        
        return _Superscript!!
    }

private var _Superscript: ImageVector? = null

