package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.User: ImageVector
    get() {
        if (_User != null) return _User!!
        
        _User = ImageVector.Builder(
            name = "user",
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
                moveTo(15.75f, 6f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 7.5f, 0f)
                close()
                moveTo(4.501f, 20.118f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 14.998f, 0f)
                arcTo(17.933f, 17.933f, 0f, false, true, 12f, 21.75f)
                curveToRelative(-2.676f, 0f, -5.216f, -0.584f, -7.499f, -1.632f)
                close()
            }
        }.build()
        
        return _User!!
    }

private var _User: ImageVector? = null

