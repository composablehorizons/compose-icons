package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PercentBadge: ImageVector
    get() {
        if (_PercentBadge != null) return _PercentBadge!!
        
        _PercentBadge = ImageVector.Builder(
            name = "percent-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.396f, 6.093f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 3.814f)
                arcToRelative(2f, 2f, 0f, false, false, 2.697f, 2.697f)
                arcToRelative(2f, 2f, 0f, false, false, 3.814f, 0f)
                arcToRelative(2.001f, 2.001f, 0f, false, false, 2.698f, -2.697f)
                arcToRelative(2f, 2f, 0f, false, false, -0.001f, -3.814f)
                arcToRelative(2.001f, 2.001f, 0f, false, false, -2.697f, -2.698f)
                arcToRelative(2f, 2f, 0f, false, false, -3.814f, 0.001f)
                arcToRelative(2f, 2f, 0f, false, false, -2.697f, 2.697f)
                close()
                moveTo(6f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveToRelative(3.47f, -1.53f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(4f, -4f)
                close()
                moveTo(11f, 10f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
        }.build()
        
        return _PercentBadge!!
    }

private var _PercentBadge: ImageVector? = null

