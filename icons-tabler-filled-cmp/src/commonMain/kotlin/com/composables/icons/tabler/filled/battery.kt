package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Battery: ImageVector
    get() {
        if (_Battery != null) return _Battery!!
        
        _Battery = ImageVector.Builder(
            name = "battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(0.086f)
                lineToRelative(0.052f, 0.019f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.941f, 1.25f)
                lineToRelative(0.007f, 0.145f)
                verticalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.948f, 1.395f)
                lineToRelative(-0.052f, 0.018f)
                verticalLineToRelative(0.087f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-11f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Battery!!
    }

private var _Battery: ImageVector? = null

