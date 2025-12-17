package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Envelope: ImageVector
    get() {
        if (_Envelope != null) return _Envelope!!
        
        _Envelope = ImageVector.Builder(
            name = "envelope",
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
                moveTo(21.75f, 6.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                verticalLineTo(6.75f)
                moveToRelative(19.5f, 0f)
                arcTo(2.25f, 2.25f, 0f, false, false, 19.5f, 4.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                moveToRelative(19.5f, 0f)
                verticalLineToRelative(0.243f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.07f, 1.916f)
                lineToRelative(-7.5f, 4.615f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.36f, 0f)
                lineTo(3.32f, 8.91f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.07f, -1.916f)
                verticalLineTo(6.75f)
            }
        }.build()
        
        return _Envelope!!
    }

private var _Envelope: ImageVector? = null

