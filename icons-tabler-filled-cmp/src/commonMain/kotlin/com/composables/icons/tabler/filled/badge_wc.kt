package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BadgeWc: ImageVector
    get() {
        if (_BadgeWc != null) return _BadgeWc!!
        
        _BadgeWc = ImageVector.Builder(
            name = "badge-wc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-7.534f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.963f, 0.917f)
                lineToRelative(-0.204f, 2.445f)
                lineToRelative(-0.405f, -0.81f)
                lineToRelative(-0.063f, -0.11f)
                arcToRelative(1f, 1f, 0f, false, false, -1.725f, 0.11f)
                lineToRelative(-0.406f, 0.81f)
                lineToRelative(-0.203f, -2.445f)
                arcToRelative(1f, 1f, 0f, false, false, -0.963f, -0.917f)
                lineToRelative(-0.117f, 0.003f)
                arcToRelative(1f, 1f, 0f, false, false, -0.914f, 1.08f)
                lineToRelative(0.5f, 6f)
                lineToRelative(0.016f, 0.117f)
                curveToRelative(0.175f, 0.91f, 1.441f, 1.115f, 1.875f, 0.247f)
                lineToRelative(1.106f, -2.211f)
                lineToRelative(1.106f, 2.211f)
                curveToRelative(0.452f, 0.904f, 1.807f, 0.643f, 1.89f, -0.364f)
                lineToRelative(0.5f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.913f, -1.08f)
                close()
                moveToRelative(4.034f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
            }
        }.build()
        
        return _BadgeWc!!
    }

private var _BadgeWc: ImageVector? = null

