package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Clover2: ImageVector
    get() {
        if (_Clover2 != null) return _Clover2!!
        
        _Clover2 = ImageVector.Builder(
            name = "clover-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 11f)
                lineToRelative(-3.397f, -3.44f)
                arcToRelative(2.104f, 2.104f, 0f, false, true, 0f, -2.95f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, 2.912f, 0f)
                lineToRelative(0.485f, 0.39f)
                lineToRelative(0.485f, -0.39f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, 2.912f, 0f)
                arcToRelative(2.104f, 2.104f, 0f, false, true, 0f, 2.95f)
                lineToRelative(-3.397f, 3.44f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 11f)
                lineToRelative(-3.397f, 3.44f)
                arcToRelative(2.104f, 2.104f, 0f, false, false, 0f, 2.95f)
                arcToRelative(2.04f, 2.04f, 0f, false, false, 2.912f, 0f)
                lineToRelative(0.485f, -0.39f)
                lineToRelative(0.485f, 0.39f)
                arcToRelative(2.04f, 2.04f, 0f, false, false, 2.912f, 0f)
                arcToRelative(2.104f, 2.104f, 0f, false, false, 0f, -2.95f)
                lineToRelative(-3.397f, -3.44f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.44f, 7.603f)
                arcToRelative(2.104f, 2.104f, 0f, false, true, 2.95f, 0f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, 0f, 2.912f)
                lineToRelative(-0.39f, 0.485f)
                lineToRelative(0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, 0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0f, false, true, -2.95f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.56f, 7.603f)
                arcToRelative(2.104f, 2.104f, 0f, false, false, -2.95f, 0f)
                arcToRelative(2.04f, 2.04f, 0f, false, false, 0f, 2.912f)
                lineToRelative(0.39f, 0.485f)
                lineToRelative(-0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0f, false, false, 0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0f, false, false, 2.95f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                lineToRelative(6f, 6f)
            }
        }.build()
        
        return _Clover2!!
    }

private var _Clover2: ImageVector? = null

