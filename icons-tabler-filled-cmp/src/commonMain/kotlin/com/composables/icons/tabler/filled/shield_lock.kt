package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ShieldLock: ImageVector
    get() {
        if (_ShieldLock != null) return _ShieldLock!!
        
        _ShieldLock = ImageVector.Builder(
            name = "shield-lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.998f, 2f)
                lineToRelative(0.118f, 0.007f)
                lineToRelative(0.059f, 0.008f)
                lineToRelative(0.061f, 0.013f)
                lineToRelative(0.111f, 0.034f)
                arcToRelative(0.993f, 0.993f, 0f, false, true, 0.217f, 0.112f)
                lineToRelative(0.104f, 0.082f)
                lineToRelative(0.255f, 0.218f)
                arcToRelative(11f, 11f, 0f, false, false, 7.189f, 2.537f)
                lineToRelative(0.342f, -0.01f)
                arcToRelative(1f, 1f, 0f, false, true, 1.005f, 0.717f)
                arcToRelative(13f, 13f, 0f, false, true, -9.208f, 16.25f)
                arcToRelative(1f, 1f, 0f, false, true, -0.502f, 0f)
                arcToRelative(13f, 13f, 0f, false, true, -9.209f, -16.25f)
                arcToRelative(1f, 1f, 0f, false, true, 1.005f, -0.717f)
                arcToRelative(11f, 11f, 0f, false, false, 7.531f, -2.527f)
                lineToRelative(0.263f, -0.225f)
                lineToRelative(0.096f, -0.075f)
                arcToRelative(0.993f, 0.993f, 0f, false, true, 0.217f, -0.112f)
                lineToRelative(0.112f, -0.034f)
                arcToRelative(0.97f, 0.97f, 0f, false, true, 0.119f, -0.021f)
                lineToRelative(0.115f, -0.007f)
                close()
                moveToRelative(0.002f, 7f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, false, false, 0.995f, 1.581f)
                verticalLineToRelative(1.769f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(0.001f, -1.768f)
                arcToRelative(2f, 2f, 0f, false, false, -1.001f, -3.732f)
                close()
            }
        }.build()
        
        return _ShieldLock!!
    }

private var _ShieldLock: ImageVector? = null

