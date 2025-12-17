package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PercentBadge: ImageVector
    get() {
        if (_PercentBadge != null) return _PercentBadge!!
        
        _PercentBadge = ImageVector.Builder(
            name = "percent-badge",
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
                moveTo(8.99f, 14.993f)
                lineToRelative(6f, -6f)
                moveToRelative(6f, 3.001f)
                curveToRelative(0f, 1.268f, -0.63f, 2.39f, -1.593f, 3.069f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, -1.043f, 3.296f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, -3.296f, 1.043f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, -3.068f, 1.593f)
                curveToRelative(-1.268f, 0f, -2.39f, -0.63f, -3.068f, -1.593f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, -3.296f, -1.043f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, -1.043f, -3.297f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, -1.593f, -3.068f)
                curveToRelative(0f, -1.268f, 0.63f, -2.39f, 1.593f, -3.068f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, 1.043f, -3.297f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, 3.296f, -1.042f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, 3.068f, -1.594f)
                curveToRelative(1.268f, 0f, 2.39f, 0.63f, 3.068f, 1.593f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, 3.296f, 1.043f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, 1.043f, 3.297f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, 1.593f, 3.068f)
                close()
                moveTo(9.74f, 9.743f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.007f)
                horizontalLineTo(9.74f)
                verticalLineToRelative(-0.007f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(4.125f, 4.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
            }
        }.build()
        
        return _PercentBadge!!
    }

private var _PercentBadge: ImageVector? = null

