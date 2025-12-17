package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cardboards: ImageVector
    get() {
        if (_Cardboards != null) return _Cardboards!!
        
        _Cardboards = ImageVector.Builder(
            name = "cardboards",
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
                moveTo(3f, 8f)
                verticalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(1.06f)
                arcToRelative(3f, 3f, 0f, false, false, 2.34f, -1.13f)
                lineToRelative(1.54f, -1.92f)
                arcToRelative(2f, 2f, 0f, false, true, 3.12f, 0f)
                lineToRelative(1.54f, 1.92f)
                arcToRelative(3f, 3f, 0f, false, false, 2.34f, 1.13f)
                horizontalLineToRelative(1.06f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-8.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
        }.build()
        
        return _Cardboards!!
    }

private var _Cardboards: ImageVector? = null

