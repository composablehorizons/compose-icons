package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.KeyRound: ImageVector
    get() {
        if (_KeyRound != null) return _KeyRound!!
        
        _KeyRound = ImageVector.Builder(
            name = "key-round",
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
                moveTo(2.586f, 17.414f)
                arcTo(2f, 2f, 0f, false, false, 2f, 18.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(0.172f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -0.586f)
                lineToRelative(0.814f, -0.814f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, -4f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17f, 7.5f)
                close()
            }
        }.build()
        
        return _KeyRound!!
    }

private var _KeyRound: ImageVector? = null

