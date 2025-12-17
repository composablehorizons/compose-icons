package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Binoculars: ImageVector
    get() {
        if (_Binoculars != null) return _Binoculars!!
        
        _Binoculars = ImageVector.Builder(
            name = "binoculars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.887f, 6.748f)
                curveToRelative(-0.163f, 0f, -0.337f, 0.016f, -0.506f, 0.057f)
                curveToRelative(-0.172f, 0.041f, -0.582f, 0.165f, -0.838f, 0.562f)
                lineToRelative(-0.014f, 0.02f)
                lineToRelative(-0.607f, 1.05f)
                curveToRelative(-0.307f, 0.205f, -0.534f, 0.46f, -0.693f, 0.717f)
                lineToRelative(-0.014f, 0.02f)
                lineToRelative(-2.572f, 4.65f)
                arcToRelative(4.009f, 4.009f, 0f, false, false, -0.274f, 0.494f)
                lineToRelative(-0.006f, 0.01f)
                arcToRelative(3.99f, 3.99f, 0f, false, false, -0.363f, 1.672f)
                arcToRelative(4f, 4f, 0f, false, false, 8f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, true, false, 7.635f, -1.67f)
                lineToRelative(-0.004f, -0.012f)
                arcToRelative(4.008f, 4.008f, 0f, false, false, -0.274f, -0.494f)
                lineToRelative(-2.572f, -4.65f)
                lineToRelative(-0.014f, -0.02f)
                arcToRelative(2.337f, 2.337f, 0f, false, false, -0.693f, -0.716f)
                lineToRelative(-0.607f, -1.051f)
                lineToRelative(-0.014f, -0.02f)
                curveToRelative(-0.256f, -0.397f, -0.667f, -0.52f, -0.838f, -0.562f)
                arcToRelative(2.225f, 2.225f, 0f, false, false, -0.664f, -0.051f)
                arcToRelative(2.06f, 2.06f, 0f, false, false, -0.68f, 0.156f)
                curveToRelative(-0.184f, 0.081f, -0.638f, 0.327f, -0.754f, 0.889f)
                lineToRelative(-0.007f, 0.037f)
                lineToRelative(-0.14f, 1.1f)
                curveToRelative(-0.22f, 0.283f, -0.374f, 0.64f, -0.374f, 1.064f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.424f, -0.154f, -0.781f, -0.373f, -1.064f)
                lineToRelative(-0.14f, -1.1f)
                lineToRelative(-0.008f, -0.037f)
                curveToRelative(-0.116f, -0.562f, -0.57f, -0.808f, -0.754f, -0.889f)
                arcToRelative(2.06f, 2.06f, 0f, false, false, -0.68f, -0.156f)
                arcToRelative(2.374f, 2.374f, 0f, false, false, -0.158f, -0.006f)
                close()
                moveToRelative(-1.887f, 7.252f)
                arcToRelative(2f, 2f, 0f, true, true, -1.838f, 1.209f)
                lineToRelative(0.19f, -0.342f)
                curveToRelative(0.36f, -0.523f, 0.964f, -0.867f, 1.648f, -0.867f)
                close()
                moveToRelative(10f, 0f)
                curveToRelative(0.684f, 0f, 1.288f, 0.344f, 1.648f, 0.867f)
                lineToRelative(0.19f, 0.342f)
                arcToRelative(2f, 2f, 0f, true, true, -1.838f, -1.209f)
                close()
            }
        }.build()
        
        return _Binoculars!!
    }

private var _Binoculars: ImageVector? = null

