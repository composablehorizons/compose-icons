package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GitMerge: ImageVector
    get() {
        if (_GitMerge != null) return _GitMerge!!
        
        _GitMerge = ImageVector.Builder(
            name = "git-merge",
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
                moveTo(21f, 18f)
                arcTo(3f, 3f, 0f, false, true, 18f, 21f)
                arcTo(3f, 3f, 0f, false, true, 15f, 18f)
                arcTo(3f, 3f, 0f, false, true, 21f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6f)
                arcTo(3f, 3f, 0f, false, true, 6f, 9f)
                arcTo(3f, 3f, 0f, false, true, 3f, 6f)
                arcTo(3f, 3f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 21f)
                verticalLineTo(9f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
            }
        }.build()
        
        return _GitMerge!!
    }

private var _GitMerge: ImageVector? = null

