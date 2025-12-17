package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Trident: ImageVector
    get() {
        if (_Trident != null) return _Trident!!
        
        _Trident = ImageVector.Builder(
            name = "trident",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(3f)
                arcToRelative(7f, 7f, 0f, false, false, 14f, 0f)
                verticalLineToRelative(-3f)
                lineToRelative(2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                verticalLineToRelative(-18f)
                lineToRelative(-2f, 2f)
                moveToRelative(4f, 0f)
                lineToRelative(-2f, -2f)
            }
        }.build()
        
        return _Trident!!
    }

private var _Trident: ImageVector? = null

