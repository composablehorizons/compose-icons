package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.LiveView: ImageVector
    get() {
        if (_LiveView != null) return _LiveView!!
        
        _LiveView = ImageVector.Builder(
            name = "live-view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.19f, 7.214f)
                arcToRelative(5f, 5f, 0f, false, true, 1.185f, 6.27f)
                lineToRelative(-0.056f, 0.09f)
                lineToRelative(-3.484f, 4.976f)
                arcToRelative(1f, 1f, 0f, false, true, -0.077f, 0.103f)
                lineToRelative(-0.017f, 0.019f)
                lineToRelative(-0.057f, 0.056f)
                lineToRelative(-0.012f, 0.013f)
                lineToRelative(-0.019f, 0.017f)
                arcToRelative(1f, 1f, 0f, false, true, -0.096f, 0.073f)
                lineToRelative(-0.053f, 0.03f)
                lineToRelative(-0.038f, 0.024f)
                lineToRelative(-0.011f, 0.005f)
                arcToRelative(1f, 1f, 0f, false, true, -0.223f, 0.083f)
                lineToRelative(-0.045f, 0.008f)
                lineToRelative(-0.066f, 0.012f)
                arcToRelative(1f, 1f, 0f, false, true, -0.242f, 0f)
                lineToRelative(-0.061f, -0.011f)
                lineToRelative(-0.05f, -0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -0.234f, -0.087f)
                lineToRelative(-0.047f, -0.028f)
                lineToRelative(-0.044f, -0.026f)
                lineToRelative(-0.011f, -0.008f)
                lineToRelative(-0.032f, -0.025f)
                lineToRelative(-0.053f, -0.04f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-0.009f, -0.007f)
                lineToRelative(-0.034f, -0.035f)
                lineToRelative(-0.035f, -0.034f)
                lineToRelative(-0.007f, -0.01f)
                lineToRelative(-0.01f, -0.009f)
                lineToRelative(-0.037f, -0.05f)
                lineToRelative(-0.024f, -0.03f)
                lineToRelative(-3.5f, -5f)
                lineToRelative(-0.056f, -0.089f)
                arcToRelative(5f, 5f, 0f, false, true, 7.566f, -6.27f)
                moveToRelative(-3.191f, 2.786f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _LiveView!!
    }

private var _LiveView: ImageVector? = null

