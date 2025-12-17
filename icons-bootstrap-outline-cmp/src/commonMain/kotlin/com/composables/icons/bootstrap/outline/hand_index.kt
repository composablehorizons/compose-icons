package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HandIndex: ImageVector
    get() {
        if (_HandIndex != null) return _HandIndex!!
        
        _HandIndex = ImageVector.Builder(
            name = "hand-index",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.75f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(5.467f)
                lineToRelative(0.086f, -0.004f)
                curveToRelative(0.317f, -0.012f, 0.637f, -0.008f, 0.816f, 0.027f)
                curveToRelative(0.134f, 0.027f, 0.294f, 0.096f, 0.448f, 0.182f)
                curveToRelative(0.077f, 0.042f, 0.15f, 0.147f, 0.15f, 0.314f)
                verticalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineTo(6.435f)
                lineToRelative(0.106f, -0.01f)
                curveToRelative(0.316f, -0.024f, 0.584f, -0.01f, 0.708f, 0.04f)
                curveToRelative(0.118f, 0.046f, 0.3f, 0.207f, 0.486f, 0.43f)
                curveToRelative(0.081f, 0.096f, 0.15f, 0.19f, 0.2f, 0.259f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.342f)
                arcToRelative(1f, 1f, 0f, false, true, 0.995f, 1.1f)
                lineToRelative(-0.271f, 2.715f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.317f, 0.991f)
                lineToRelative(-1.395f, 2.442f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.434f, 0.252f)
                horizontalLineTo(6.035f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.416f, -0.223f)
                lineToRelative(-1.433f, -2.15f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.243f, -0.666f)
                lineToRelative(-0.345f, -3.105f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.399f, -0.546f)
                lineTo(5f, 8.11f)
                verticalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6.75f, 1f)
                moveTo(8.5f, 4.466f)
                verticalLineTo(1.75f)
                arcToRelative(1.75f, 1.75f, 0f, true, false, -3.5f, 0f)
                verticalLineToRelative(5.34f)
                lineToRelative(-1.2f, 0.24f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.196f, 1.636f)
                lineToRelative(0.345f, 3.106f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0.405f, 1.11f)
                lineToRelative(1.433f, 2.15f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.035f, 16f)
                horizontalLineToRelative(6.385f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.302f, -0.756f)
                lineToRelative(1.395f, -2.441f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0.444f, -1.389f)
                lineToRelative(0.271f, -2.715f)
                arcToRelative(2f, 2f, 0f, false, false, -1.99f, -2.199f)
                horizontalLineToRelative(-0.581f)
                arcToRelative(5f, 5f, 0f, false, false, -0.195f, -0.248f)
                curveToRelative(-0.191f, -0.229f, -0.51f, -0.568f, -0.88f, -0.716f)
                curveToRelative(-0.364f, -0.146f, -0.846f, -0.132f, -1.158f, -0.108f)
                lineToRelative(-0.132f, 0.012f)
                arcToRelative(1.26f, 1.26f, 0f, false, false, -0.56f, -0.642f)
                arcToRelative(2.6f, 2.6f, 0f, false, false, -0.738f, -0.288f)
                curveToRelative(-0.31f, -0.062f, -0.739f, -0.058f, -1.05f, -0.046f)
                close()
                moveToRelative(2.094f, 2.025f)
            }
        }.build()
        
        return _HandIndex!!
    }

private var _HandIndex: ImageVector? = null

