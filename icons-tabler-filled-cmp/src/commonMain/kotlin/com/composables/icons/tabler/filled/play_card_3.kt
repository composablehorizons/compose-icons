package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.PlayCard3: ImageVector
    get() {
        if (_PlayCard3 != null) return _PlayCard3!!
        
        _PlayCard3 = ImageVector.Builder(
            name = "play-card-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(0.01f, 16f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-4.51f, -10f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.09f, 0.992f)
                lineToRelative(-0.09f, 0.008f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.287f, 0f, -1.332f, 1.864f, -0.133f, 1.993f)
                lineToRelative(0.133f, 0.007f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(2.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.477f, -1.312f)
                lineToRelative(-0.019f, -0.024f)
                lineToRelative(0.019f, -0.024f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.018f, -3.976f)
                moveToRelative(-5.49f, -4f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
            }
        }.build()
        
        return _PlayCard3!!
    }

private var _PlayCard3: ImageVector? = null

