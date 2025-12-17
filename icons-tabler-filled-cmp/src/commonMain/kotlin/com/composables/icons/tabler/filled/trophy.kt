package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.17f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 5.659f)
                verticalLineToRelative(0.171f)
                arcToRelative(6.002f, 6.002f, 0f, false, true, -5f, 5.917f)
                verticalLineToRelative(2.083f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.083f)
                arcToRelative(6.002f, 6.002f, 0f, false, true, -4.996f, -5.692f)
                lineToRelative(-0.004f, -0.225f)
                verticalLineToRelative(-0.171f)
                arcToRelative(3f, 3f, 0f, false, true, -3.996f, -2.653f)
                lineToRelative(-0.003f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 3.995f, -2.654f)
                lineToRelative(-0.001f, -2.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(10f)
                close()
                moveToRelative(-12f, 5f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
                moveToRelative(14f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null

