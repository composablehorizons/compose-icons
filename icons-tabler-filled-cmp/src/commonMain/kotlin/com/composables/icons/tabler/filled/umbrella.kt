package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) return _Umbrella!!
        
        _Umbrella = ImageVector.Builder(
            name = "umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -5.995f, 0.176f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                close()
            }
        }.build()
        
        return _Umbrella!!
    }

private var _Umbrella: ImageVector? = null

