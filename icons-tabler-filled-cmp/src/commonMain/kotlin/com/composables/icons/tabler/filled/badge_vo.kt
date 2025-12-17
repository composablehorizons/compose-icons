package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BadgeVo: ImageVector
    get() {
        if (_BadgeVo != null) return _BadgeVo!!
        
        _BadgeVo = ImageVector.Builder(
            name = "badge-vo",
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
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
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
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _BadgeVo!!
    }

private var _BadgeVo: ImageVector? = null

