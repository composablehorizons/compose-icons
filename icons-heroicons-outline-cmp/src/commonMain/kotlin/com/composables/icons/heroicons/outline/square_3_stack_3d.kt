package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Square3Stack3d: ImageVector
    get() {
        if (_Square3Stack3d != null) return _Square3Stack3d!!
        
        _Square3Stack3d = ImageVector.Builder(
            name = "square-3-stack-3d",
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
                moveTo(6.429f, 9.75f)
                lineTo(2.25f, 12f)
                lineToRelative(4.179f, 2.25f)
                moveToRelative(0f, -4.5f)
                lineToRelative(5.571f, 3f)
                lineToRelative(5.571f, -3f)
                moveToRelative(-11.142f, 0f)
                lineTo(2.25f, 7.5f)
                lineTo(12f, 2.25f)
                lineToRelative(9.75f, 5.25f)
                lineToRelative(-4.179f, 2.25f)
                moveToRelative(0f, 0f)
                lineTo(21.75f, 12f)
                lineToRelative(-4.179f, 2.25f)
                moveToRelative(0f, 0f)
                lineToRelative(4.179f, 2.25f)
                lineTo(12f, 21.75f)
                lineTo(2.25f, 16.5f)
                lineToRelative(4.179f, -2.25f)
                moveToRelative(11.142f, 0f)
                lineToRelative(-5.571f, 3f)
                lineToRelative(-5.571f, -3f)
            }
        }.build()
        
        return _Square3Stack3d!!
    }

private var _Square3Stack3d: ImageVector? = null

