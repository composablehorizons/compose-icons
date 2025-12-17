package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ShieldCheckered: ImageVector
    get() {
        if (_ShieldCheckered != null) return _ShieldCheckered!!
        
        _ShieldCheckered = ImageVector.Builder(
            name = "shield-checkered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.013f, 12f)
                verticalLineToRelative(9.754f)
                arcToRelative(13f, 13f, 0f, false, true, -8.733f, -9.754f)
                horizontalLineToRelative(8.734f)
                close()
                moveToRelative(9.284f, 3.794f)
                arcToRelative(13f, 13f, 0f, false, true, -7.283f, 5.951f)
                lineToRelative(-0.001f, -9.745f)
                horizontalLineToRelative(8.708f)
                arcToRelative(12.96f, 12.96f, 0f, false, true, -1.424f, 3.794f)
                close()
                moveToRelative(-9.283f, -13.268f)
                lineToRelative(-0.001f, 7.474f)
                horizontalLineToRelative(-8.986f)
                curveToRelative(-0.068f, -1.432f, 0.101f, -2.88f, 0.514f, -4.282f)
                arcToRelative(1f, 1f, 0f, false, true, 1.005f, -0.717f)
                arcToRelative(11f, 11f, 0f, false, false, 7.192f, -2.256f)
                lineToRelative(0.276f, -0.219f)
                close()
                moveToRelative(1.999f, 7.474f)
                verticalLineToRelative(-7.453f)
                lineToRelative(-0.09f, -0.073f)
                arcToRelative(11f, 11f, 0f, false, false, 7.189f, 2.537f)
                lineToRelative(0.342f, -0.01f)
                arcToRelative(1f, 1f, 0f, false, true, 1.005f, 0.717f)
                curveToRelative(0.413f, 1.403f, 0.582f, 2.85f, 0.514f, 4.282f)
                horizontalLineToRelative(-8.96f)
                close()
            }
        }.build()
        
        return _ShieldCheckered!!
    }

private var _ShieldCheckered: ImageVector? = null

