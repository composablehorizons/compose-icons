package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CoinTaka: ImageVector
    get() {
        if (_CoinTaka != null) return _CoinTaka!!
        
        _CoinTaka = ImageVector.Builder(
            name = "coin-taka",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-6.211f, 4.384f)
                arcToRelative(2f, 2f, 0f, false, false, -2.683f, -0.895f)
                lineToRelative(-0.553f, 0.277f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, 1.788f)
                lineToRelative(0.553f, -0.276f)
                lineToRelative(-0.001f, 1.382f)
                horizontalLineToRelative(-0.999f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.999f)
                lineToRelative(0.001f, 3f)
                arcToRelative(3f, 3f, 0f, false, false, 2.824f, 2.995f)
                lineToRelative(0.176f, 0.005f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.032f, 0.002f)
                lineToRelative(-0.02f, 0.057f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.395f, 0.948f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                lineToRelative(-0.001f, -3f)
                horizontalLineToRelative(4.001f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-4.001f)
                lineToRelative(0.001f, -1.382f)
                arcToRelative(2f, 2f, 0f, false, false, -0.136f, -0.725f)
                lineToRelative(-0.075f, -0.17f)
                close()
            }
        }.build()
        
        return _CoinTaka!!
    }

private var _CoinTaka: ImageVector? = null

