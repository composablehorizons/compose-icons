package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.AdjustmentsHorizontal: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.5f, 6f)
                horizontalLineToRelative(9.75f)
                moveTo(10.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                moveTo(3.75f, 6f)
                horizontalLineTo(7.5f)
                moveToRelative(3f, 12f)
                horizontalLineToRelative(9.75f)
                moveToRelative(-9.75f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -3f, 0f)
                moveToRelative(-3.75f, 0f)
                horizontalLineTo(7.5f)
                moveToRelative(9f, -6f)
                horizontalLineToRelative(3.75f)
                moveToRelative(-3.75f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -3f, 0f)
                moveToRelative(-9.75f, 0f)
                horizontalLineToRelative(9.75f)
            }
        }.build()
        
        return _AdjustmentsHorizontal!!
    }

private var _AdjustmentsHorizontal: ImageVector? = null

