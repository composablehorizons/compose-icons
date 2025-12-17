package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.EllipsisHorizontalCircle: ImageVector
    get() {
        if (_EllipsisHorizontalCircle != null) return _EllipsisHorizontalCircle!!
        
        _EllipsisHorizontalCircle = ImageVector.Builder(
            name = "ellipsis-horizontal-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveToRelative(0f, 8.625f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
                moveTo(15.375f, 12f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
                moveTo(7.5f, 10.875f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
            }
        }.build()
        
        return _EllipsisHorizontalCircle!!
    }

private var _EllipsisHorizontalCircle: ImageVector? = null

