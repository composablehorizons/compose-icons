package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Feather: ImageVector
    get() {
        if (_Feather != null) return _Feather!!
        
        _Feather = ImageVector.Builder(
            name = "feather",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9.585f)
                verticalLineToRelative(6.415f)
                horizontalLineToRelative(6.414f)
                lineToRelative(-2.707f, 2.707f)
                arcToRelative(1f, 1f, 0f, false, true, -0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.114f, 0.054f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.149f, 0.03f)
                lineToRelative(-0.117f, 0.006f)
                horizontalLineToRelative(-4.586f)
                lineToRelative(-1.707f, 1.707f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, -1.414f)
                lineToRelative(1.707f, -1.709f)
                verticalLineToRelative(-4.584f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.03f, -0.111f)
                lineToRelative(0.044f, -0.111f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.067f, -0.096f)
                lineToRelative(0.08f, -0.09f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.414f, 11f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-4.914f)
                lineToRelative(2.914f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 4.586f)
                verticalLineToRelative(4.998f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(-4.999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.482f, 3f)
                arcToRelative(4.515f, 4.515f, 0f, false, true, 4.518f, 4.514f)
                arcToRelative(4.7f, 4.7f, 0f, false, true, -0.239f, 1.487f)
                lineToRelative(-5.761f, -0.001f)
                verticalLineToRelative(-5.76f)
                curveToRelative(0.469f, -0.158f, 0.968f, -0.24f, 1.482f, -0.24f)
            }
        }.build()
        
        return _Feather!!
    }

private var _Feather: ImageVector? = null

