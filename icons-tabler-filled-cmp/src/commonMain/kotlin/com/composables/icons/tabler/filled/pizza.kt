package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pizza: ImageVector
    get() {
        if (_Pizza != null) return _Pizza!!
        
        _Pizza = ImageVector.Builder(
            name = "pizza",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.89f, 2.542f)
                lineToRelative(8.5f, 16.517f)
                arcToRelative(1f, 1f, 0f, false, true, -0.446f, 1.354f)
                arcToRelative(20.1f, 20.1f, 0f, false, true, -8.945f, 2.087f)
                lineToRelative(-0.522f, -0.007f)
                arcToRelative(20.1f, 20.1f, 0f, false, true, -8.423f, -2.08f)
                arcToRelative(1f, 1f, 0f, false, true, -0.443f, -1.354f)
                lineToRelative(8.5f, -16.517f)
                arcToRelative(1f, 1f, 0f, false, true, 1.778f, 0f)
                moveToRelative(-7.064f, 14.64f)
                lineToRelative(-0.96f, 1.865f)
                lineToRelative(0.409f, 0.17f)
                arcToRelative(18.2f, 18.2f, 0f, false, false, 6.226f, 1.276f)
                lineToRelative(0.5f, 0.007f)
                arcToRelative(18.1f, 18.1f, 0f, false, false, 6.708f, -1.279f)
                lineToRelative(0.424f, -0.176f)
                lineToRelative(-0.89f, -1.728f)
                arcToRelative(15.9f, 15.9f, 0f, false, true, -6.046f, 1.183f)
                arcToRelative(15.9f, 15.9f, 0f, false, true, -6.37f, -1.318f)
                moveToRelative(5.174f, -4.192f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                moveToRelative(2f, -2.99f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
            }
        }.build()
        
        return _Pizza!!
    }

private var _Pizza: ImageVector? = null

