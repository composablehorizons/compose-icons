package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Dumpling: ImageVector
    get() {
        if (_Dumpling != null) return _Dumpling!!
        
        _Dumpling = ImageVector.Builder(
            name = "dumpling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.003f, 2.04f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 2.602f, 0.62f)
                lineToRelative(0.09f, 0.07f)
                lineToRelative(0.149f, -0.11f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 3.044f, -0.462f)
                lineToRelative(0.207f, 0.072f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 1.99f, 1.903f)
                lineToRelative(0.014f, 0.031f)
                lineToRelative(0.045f, -0.004f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 2.624f, 0.879f)
                lineToRelative(0.153f, 0.144f)
                lineToRelative(0.358f, 0.358f)
                curveToRelative(1.976f, 1.977f, -0.32f, 6.748f, -4.655f, 11.083f)
                curveToRelative(-4.336f, 4.335f, -9.106f, 6.632f, -11.083f, 4.655f)
                lineToRelative(-0.382f, -0.382f)
                lineToRelative(-0.135f, -0.145f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, -0.87f, -2.556f)
                lineToRelative(0.01f, -0.1f)
                lineToRelative(-0.162f, -0.072f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, -1.838f, -2.124f)
                lineToRelative(-0.055f, -0.192f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 0.56f, -2.937f)
                lineToRelative(0.062f, -0.079f)
                lineToRelative(-0.07f, -0.092f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, -0.644f, -2.401f)
                lineToRelative(0.025f, -0.2f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 1.707f, -2.505f)
                lineToRelative(0.046f, -0.026f)
                lineToRelative(-0.005f, -0.14f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 0.885f, -2.345f)
                lineToRelative(0.15f, -0.16f)
                lineToRelative(0.159f, -0.149f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 2.346f, -0.884f)
                lineToRelative(0.14f, 0.004f)
                lineToRelative(0.026f, -0.046f)
                arcToRelative(3.53f, 3.53f, 0f, false, true, 2.308f, -1.67f)
                close()
            }
        }.build()
        
        return _Dumpling!!
    }

private var _Dumpling: ImageVector? = null

