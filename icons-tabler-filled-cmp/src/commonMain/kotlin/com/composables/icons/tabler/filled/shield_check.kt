package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) return _ShieldCheck!!
        
        _ShieldCheck = ImageVector.Builder(
            name = "shield-check",
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
                moveToRelative(3.71f, 7.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.415f, 0f)
                lineToRelative(-3.293f, 3.292f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 1.497f)
                lineToRelative(2f, 2f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(4f, -4f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _ShieldCheck!!
    }

private var _ShieldCheck: ImageVector? = null

