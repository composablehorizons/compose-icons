package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CloudComputing: ImageVector
    get() {
        if (_CloudComputing != null) return _CloudComputing!!
        
        _CloudComputing = ImageVector.Builder(
            name = "cloud-computing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.997f)
                lineToRelative(-0.343f, 0.001f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -0.007f)
                lineToRelative(-0.105f, -0.001f)
                curveToRelative(-2.94f, -0.11f, -5.317f, -2.399f, -5.43f, -5.263f)
                lineToRelative(-0.005f, -0.216f)
                curveToRelative(0f, -2.747f, 2.08f, -5.01f, 4.784f, -5.417f)
                lineToRelative(0.114f, -0.016f)
                lineToRelative(0.07f, -0.181f)
                curveToRelative(0.663f, -1.62f, 2.056f, -2.906f, 3.829f, -3.518f)
                lineToRelative(0.244f, -0.08f)
                curveToRelative(2.194f, -0.667f, 4.614f, -0.224f, 6.36f, 1.176f)
                curveToRelative(1.385f, 1.108f, 2.187f, 2.686f, 2.25f, 4.34f)
                lineToRelative(0.004f, 0.212f)
                lineToRelative(0.091f, 0.003f)
                curveToRelative(2.3f, 0.107f, 4.143f, 1.961f, 4.25f, 4.27f)
                lineToRelative(0.004f, 0.211f)
                curveToRelative(0f, 2.478f, -1.997f, 4.487f, -4.465f, 4.487f)
                horizontalLineToRelative(-1.535f)
                verticalLineToRelative(2.996f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2.997f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.997f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-3.997f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _CloudComputing!!
    }

private var _CloudComputing: ImageVector? = null

