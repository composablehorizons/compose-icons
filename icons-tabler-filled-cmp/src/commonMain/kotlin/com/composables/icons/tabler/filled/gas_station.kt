package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.GasStation: ImageVector
    get() {
        if (_GasStation != null) return _GasStation!!
        
        _GasStation = ImageVector.Builder(
            name = "gas-station",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 21f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                verticalLineToRelative(-13f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-0.585f)
                lineToRelative(-0.707f, -0.708f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(3.003f, 3.002f)
                lineToRelative(0.095f, 0.112f)
                lineToRelative(0.028f, 0.04f)
                lineToRelative(0.044f, 0.073f)
                lineToRelative(0.052f, 0.11f)
                lineToRelative(0.031f, 0.09f)
                lineToRelative(0.02f, 0.076f)
                lineToRelative(0.012f, 0.078f)
                lineToRelative(0.008f, 0.126f)
                verticalLineToRelative(7f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                close()
                moveToRelative(9f, -16f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _GasStation!!
    }

private var _GasStation: ImageVector? = null

