package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.AdjustmentsVertical: ImageVector
    get() {
        if (_AdjustmentsVertical != null) return _AdjustmentsVertical!!
        
        _AdjustmentsVertical = ImageVector.Builder(
            name = "adjustments-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6f, 13.5f)
                verticalLineTo(3.75f)
                moveToRelative(0f, 9.75f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveToRelative(0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(0f, 3.75f)
                verticalLineTo(16.5f)
                moveToRelative(12f, -3f)
                verticalLineTo(3.75f)
                moveToRelative(0f, 9.75f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveToRelative(0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(0f, 3.75f)
                verticalLineTo(16.5f)
                moveToRelative(-6f, -9f)
                verticalLineTo(3.75f)
                moveToRelative(0f, 3.75f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveToRelative(0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(0f, 9.75f)
                verticalLineTo(10.5f)
            }
        }.build()
        
        return _AdjustmentsVertical!!
    }

private var _AdjustmentsVertical: ImageVector? = null

