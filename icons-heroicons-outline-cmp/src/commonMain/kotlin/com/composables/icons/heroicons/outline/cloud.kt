package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
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
                moveTo(2.25f, 15f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 4.5f, 4.5f)
                horizontalLineTo(18f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 1.332f, -7.257f)
                arcToRelative(3f, 3f, 0f, false, false, -3.758f, -3.848f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, -10.233f, 2.33f)
                arcTo(4.502f, 4.502f, 0f, false, false, 2.25f, 15f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

