package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Fire: ImageVector
    get() {
        if (_Fire != null) return _Fire!!
        
        _Fire = ImageVector.Builder(
            name = "fire",
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
                moveTo(15.362f, 5.214f)
                arcTo(8.252f, 8.252f, 0f, false, true, 12f, 21f)
                arcTo(8.25f, 8.25f, 0f, false, true, 6.038f, 7.047f)
                arcTo(8.287f, 8.287f, 0f, false, false, 9f, 9.601f)
                arcToRelative(8.983f, 8.983f, 0f, false, true, 3.361f, -6.867f)
                arcToRelative(8.21f, 8.21f, 0f, false, false, 3f, 2.48f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12f, 18f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 0.495f, -7.468f)
                arcToRelative(5.99f, 5.99f, 0f, false, false, -1.925f, 3.547f)
                arcToRelative(5.975f, 5.975f, 0f, false, true, -2.133f, -1.001f)
                arcTo(3.75f, 3.75f, 0f, false, false, 12f, 18f)
                close()
            }
        }.build()
        
        return _Fire!!
    }

private var _Fire: ImageVector? = null

