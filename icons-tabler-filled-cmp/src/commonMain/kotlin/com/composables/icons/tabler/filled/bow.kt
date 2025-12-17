package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bow: ImageVector
    get() {
        if (_Bow != null) return _Bow!!
        
        _Bow = ImageVector.Builder(
            name = "bow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 2f)
                lineToRelative(0.081f, 0.003f)
                lineToRelative(0.12f, 0.017f)
                lineToRelative(0.111f, 0.03f)
                lineToRelative(0.111f, 0.044f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.096f, 0.067f)
                lineToRelative(0.09f, 0.08f)
                quadToRelative(0.054f, 0.053f, 0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.031f, 0.062f)
                lineToRelative(0.034f, 0.081f)
                lineToRelative(0.024f, 0.076f)
                lineToRelative(0.03f, 0.148f)
                lineToRelative(0.006f, 0.118f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1.586f)
                lineToRelative(-2.07f, 2.07f)
                curveToRelative(1.301f, 1.624f, 2.07f, 3.706f, 2.07f, 6.016f)
                curveToRelative(0f, 2.703f, -1.047f, 5.462f, -2.793f, 7.207f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-5.543f, -5.542f)
                lineToRelative(-3.25f, 3.249f)
                verticalLineToRelative(2.586f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2.584f)
                lineToRelative(3.251f, -3.25f)
                lineToRelative(-5.542f, -5.543f)
                arcToRelative(1f, 1f, 0f, false, true, -0.002f, -1.412f)
                curveToRelative(1.745f, -1.755f, 4.489f, -2.795f, 7.209f, -2.795f)
                curveToRelative(2.31f, 0f, 4.393f, 0.768f, 6.015f, 2.07f)
                lineToRelative(2.069f, -2.07f)
                horizontalLineToRelative(-1.584f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-4.495f, 6.91f)
                lineToRelative(-4.09f, 4.09f)
                lineToRelative(4.595f, 4.594f)
                arcToRelative(9.1f, 9.1f, 0f, false, false, 0.985f, -3.795f)
                lineToRelative(0.005f, -0.299f)
                curveToRelative(0f, -1.754f, -0.55f, -3.336f, -1.495f, -4.59f)
                moveToRelative(-6.005f, -2.91f)
                curveToRelative(-1.44f, 0f, -2.89f, 0.36f, -4.098f, 0.987f)
                lineToRelative(4.598f, 4.598f)
                lineToRelative(4.09f, -4.09f)
                curveToRelative(-1.254f, -0.945f, -2.836f, -1.495f, -4.59f, -1.495f)
            }
        }.build()
        
        return _Bow!!
    }

private var _Bow: ImageVector? = null

