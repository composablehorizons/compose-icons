package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BoltSlash: ImageVector
    get() {
        if (_BoltSlash != null) return _BoltSlash!!
        
        _BoltSlash = ImageVector.Builder(
            name = "bolt-slash",
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
                moveTo(11.412f, 15.655f)
                lineTo(9.75f, 21.75f)
                lineToRelative(3.745f, -4.012f)
                moveTo(9.257f, 13.5f)
                horizontalLineTo(3.75f)
                lineToRelative(2.659f, -2.849f)
                moveToRelative(2.048f, -2.194f)
                lineTo(14.25f, 2.25f)
                lineTo(12f, 10.5f)
                horizontalLineToRelative(8.25f)
                lineToRelative(-4.707f, 5.043f)
                moveTo(8.457f, 8.457f)
                lineTo(3f, 3f)
                moveToRelative(5.457f, 5.457f)
                lineToRelative(7.086f, 7.086f)
                moveToRelative(0f, 0f)
                lineTo(21f, 21f)
            }
        }.build()
        
        return _BoltSlash!!
    }

private var _BoltSlash: ImageVector? = null

