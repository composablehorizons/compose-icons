package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CheckBadge: ImageVector
    get() {
        if (_CheckBadge != null) return _CheckBadge!!
        
        _CheckBadge = ImageVector.Builder(
            name = "check-badge",
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
                moveTo(9f, 12.75f)
                lineTo(11.25f, 15f)
                lineTo(15f, 9.75f)
                moveTo(21f, 12f)
                curveToRelative(0f, 1.268f, -0.63f, 2.39f, -1.593f, 3.068f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, -1.043f, 3.296f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, -3.296f, 1.043f)
                arcTo(3.745f, 3.745f, 0f, false, true, 12f, 21f)
                curveToRelative(-1.268f, 0f, -2.39f, -0.63f, -3.068f, -1.593f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, -3.296f, -1.043f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, -1.043f, -3.296f)
                arcTo(3.745f, 3.745f, 0f, false, true, 3f, 12f)
                curveToRelative(0f, -1.268f, 0.63f, -2.39f, 1.593f, -3.068f)
                arcToRelative(3.745f, 3.745f, 0f, false, true, 1.043f, -3.296f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, 3.296f, -1.043f)
                arcTo(3.746f, 3.746f, 0f, false, true, 12f, 3f)
                curveToRelative(1.268f, 0f, 2.39f, 0.63f, 3.068f, 1.593f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, 3.296f, 1.043f)
                arcToRelative(3.746f, 3.746f, 0f, false, true, 1.043f, 3.296f)
                arcTo(3.745f, 3.745f, 0f, false, true, 21f, 12f)
                close()
            }
        }.build()
        
        return _CheckBadge!!
    }

private var _CheckBadge: ImageVector? = null

