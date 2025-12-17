package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Signal: ImageVector
    get() {
        if (_Signal != null) return _Signal!!
        
        _Signal = ImageVector.Builder(
            name = "signal",
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
                moveTo(9.348f, 14.652f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 0f, -5.304f)
                moveToRelative(5.304f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 0f, 5.304f)
                moveToRelative(-7.425f, 2.121f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, 0f, -9.546f)
                moveToRelative(9.546f, 0f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, 0f, 9.546f)
                moveTo(5.106f, 18.894f)
                curveToRelative(-3.808f, -3.807f, -3.808f, -9.98f, 0f, -13.788f)
                moveToRelative(13.788f, 0f)
                curveToRelative(3.808f, 3.807f, 3.808f, 9.98f, 0f, 13.788f)
                moveTo(12f, 12f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
            }
        }.build()
        
        return _Signal!!
    }

private var _Signal: ImageVector? = null

