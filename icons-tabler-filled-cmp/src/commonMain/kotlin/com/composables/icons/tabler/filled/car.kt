package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Car: ImageVector
    get() {
        if (_Car != null) return _Car!!
        
        _Car = ImageVector.Builder(
            name = "car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.694f, 0.28f)
                lineToRelative(0.087f, 0.095f)
                lineToRelative(3.699f, 4.625f)
                horizontalLineToRelative(0.52f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.658f, 0f)
                horizontalLineToRelative(-4.342f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.658f, 0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-6f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(0.008f, -0.056f)
                lineToRelative(0.017f, -0.078f)
                lineToRelative(0.012f, -0.036f)
                lineToRelative(0.014f, -0.05f)
                lineToRelative(2.014f, -5.034f)
                arcToRelative(1f, 1f, 0f, false, true, 0.928f, -0.629f)
                close()
                moveToRelative(-7f, 11f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-6f, -9f)
                horizontalLineToRelative(-5.324f)
                lineToRelative(-1.2f, 3f)
                horizontalLineToRelative(6.524f)
                close()
                moveToRelative(2.52f, 0f)
                horizontalLineToRelative(-0.52f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.92f)
                close()
            }
        }.build()
        
        return _Car!!
    }

private var _Car: ImageVector? = null

