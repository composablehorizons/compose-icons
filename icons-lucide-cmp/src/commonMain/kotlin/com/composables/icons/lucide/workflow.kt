package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Workflow: ImageVector
    get() {
        if (_Workflow != null) return _Workflow!!
        
        _Workflow = ImageVector.Builder(
            name = "workflow",
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
                moveTo(5f, 3f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 11f, 5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 9f, 11f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 9f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 5f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 15f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 13f, 19f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 15f, 13f)
                close()
            }
        }.build()
        
        return _Workflow!!
    }

private var _Workflow: ImageVector? = null

