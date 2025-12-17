package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ThumbDown: ImageVector
    get() {
        if (_ThumbDown != null) return _ThumbDown!!
        
        _ThumbDown = ImageVector.Builder(
            name = "thumb-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 21.008f)
                arcToRelative(3f, 3f, 0f, false, false, 2.995f, -2.823f)
                lineToRelative(0.005f, -0.177f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, false, 2.98f, -2.65f)
                lineToRelative(0.015f, -0.173f)
                lineToRelative(0.005f, -0.177f)
                lineToRelative(-0.02f, -0.196f)
                lineToRelative(-1.006f, -5.032f)
                curveToRelative(-0.381f, -1.625f, -1.502f, -2.796f, -2.81f, -2.78f)
                lineToRelative(-0.164f, 0.008f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.884f)
                lineToRelative(-0.007f, 0.116f)
                lineToRelative(0.001f, 9.536f)
                arcToRelative(1f, 1f, 0f, false, false, 0.5f, 0.866f)
                arcToRelative(2.998f, 2.998f, 0f, false, true, 1.492f, 2.396f)
                lineToRelative(0.007f, 0.202f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 14.008f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-9f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.852f)
                lineToRelative(-0.005f, 0.15f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 1.85f, 1.994f)
                lineToRelative(0.15f, 0.005f)
                horizontalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _ThumbDown!!
    }

private var _ThumbDown: ImageVector? = null

