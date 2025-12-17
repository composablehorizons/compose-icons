package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.AdjustmentsHorizontal: ImageVector
    get() {
        if (_AdjustmentsHorizontal != null) return _AdjustmentsHorizontal!!
        
        _AdjustmentsHorizontal = ImageVector.Builder(
            name = "adjustments-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.75f, 12.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(12f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 6f)
                close()
                moveTo(12f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 18f)
                close()
                moveTo(3.75f, 6.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(5.25f, 18.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                close()
                moveTo(3f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 12f)
                close()
                moveTo(9f, 3.75f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, -4.5f)
                close()
                moveTo(12.75f, 12f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -4.5f, 0f)
                close()
                moveTo(9f, 15.75f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, -4.5f)
                close()
            }
        }.build()
        
        return _AdjustmentsHorizontal!!
    }

private var _AdjustmentsHorizontal: ImageVector? = null

