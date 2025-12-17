package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BadgeVr: ImageVector
    get() {
        if (_BadgeVr != null) return _BadgeVr!!
        
        _BadgeVr = ImageVector.Builder(
            name = "badge-vr",
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
                moveToRelative(-3.5f, 4f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-1.196f)
                lineToRelative(1.168f, 1.75f)
                arcToRelative(1f, 1f, 0f, false, false, 1.387f, 0.278f)
                lineToRelative(0.093f, -0.07f)
                arcToRelative(1f, 1f, 0f, false, false, 0.184f, -1.317f)
                lineToRelative(-1.159f, -1.738f)
                lineToRelative(0.044f, -0.023f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -1.217f, -4.684f)
                moveToRelative(-4.184f, 0.051f)
                arcToRelative(1f, 1f, 0f, false, false, -1.265f, 0.633f)
                lineToRelative(-1.051f, 3.154f)
                lineToRelative(-1.051f, -3.154f)
                arcToRelative(1f, 1f, 0f, false, false, -1.898f, 0.632f)
                lineToRelative(2f, 6f)
                curveToRelative(0.304f, 0.912f, 1.594f, 0.912f, 1.898f, 0f)
                lineToRelative(2f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.633f, -1.265f)
                moveToRelative(4.184f, 1.949f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _BadgeVr!!
    }

private var _BadgeVr: ImageVector? = null

