package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Subscript: ImageVector
    get() {
        if (_Subscript != null) return _Subscript!!
        
        _Subscript = ImageVector.Builder(
            name = "subscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.266f, 12.496f)
                lineToRelative(0.96f, -2.853f)
                horizontalLineTo(7.76f)
                lineToRelative(0.96f, 2.853f)
                horizontalLineTo(10f)
                lineTo(6.62f, 3f)
                horizontalLineTo(5.38f)
                lineTo(2f, 12.496f)
                close()
                moveToRelative(2.748f, -8.063f)
                lineToRelative(1.419f, 4.23f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(1.426f, -4.23f)
                close()
                moveToRelative(6.132f, 7.203f)
                verticalLineToRelative(-0.075f)
                curveToRelative(0f, -0.332f, 0.234f, -0.618f, 0.619f, -0.618f)
                curveToRelative(0.354f, 0f, 0.618f, 0.256f, 0.618f, 0.58f)
                curveToRelative(0f, 0.362f, -0.271f, 0.649f, -0.52f, 0.898f)
                lineToRelative(-1.788f, 1.832f)
                verticalLineTo(15f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(-0.958f)
                horizontalLineToRelative(-1.923f)
                verticalLineToRelative(-0.045f)
                lineToRelative(0.973f, -1.04f)
                curveToRelative(0.415f, -0.438f, 0.867f, -0.845f, 0.867f, -1.547f)
                curveToRelative(0f, -0.8f, -0.701f, -1.41f, -1.787f, -1.41f)
                curveToRelative(-1.23f, 0f, -1.795f, 0.8f, -1.795f, 1.576f)
                verticalLineToRelative(0.06f)
                close()
            }
        }.build()
        
        return _Subscript!!
    }

private var _Subscript: ImageVector? = null

