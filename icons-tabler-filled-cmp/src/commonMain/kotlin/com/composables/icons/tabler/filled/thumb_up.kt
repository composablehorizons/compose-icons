package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ThumbUp: ImageVector
    get() {
        if (_ThumbUp != null) return _ThumbUp!!
        
        _ThumbUp = ImageVector.Builder(
            name = "thumb-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, true, 2.98f, 2.65f)
                lineToRelative(0.015f, 0.174f)
                lineToRelative(0.005f, 0.176f)
                lineToRelative(-0.02f, 0.196f)
                lineToRelative(-1.006f, 5.032f)
                curveToRelative(-0.381f, 1.626f, -1.502f, 2.796f, -2.81f, 2.78f)
                lineToRelative(-0.164f, -0.008f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                lineToRelative(0.001f, -9.536f)
                arcToRelative(1f, 1f, 0f, false, true, 0.5f, -0.865f)
                arcToRelative(2.998f, 2.998f, 0f, false, false, 1.492f, -2.397f)
                lineToRelative(0.007f, -0.202f)
                verticalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _ThumbUp!!
    }

private var _ThumbUp: ImageVector? = null

