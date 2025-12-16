package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GitPullRequestDraft: ImageVector
    get() {
        if (_GitPullRequestDraft != null) return _GitPullRequestDraft!!
        
        _GitPullRequestDraft = ImageVector.Builder(
            name = "git-pull-request-draft",
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
                moveTo(21f, 18f)
                arcTo(3f, 3f, 0f, false, true, 18f, 21f)
                arcTo(3f, 3f, 0f, false, true, 15f, 18f)
                arcTo(3f, 3f, 0f, false, true, 21f, 18f)
                close()
            }
            path(
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11f)
                verticalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                lineTo(6f, 21f)
            }
        }.build()
        
        return _GitPullRequestDraft!!
    }

private var _GitPullRequestDraft: ImageVector? = null

