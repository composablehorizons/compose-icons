package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Linkedin: ImageVector
    get() {
        if (_Linkedin != null) return _Linkedin!!
        
        _Linkedin = ImageVector.Builder(
            name = "linkedin",
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
                moveTo(16f, 8f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 4f)
                arcTo(2f, 2f, 0f, false, true, 4f, 6f)
                arcTo(2f, 2f, 0f, false, true, 2f, 4f)
                arcTo(2f, 2f, 0f, false, true, 6f, 4f)
                close()
            }
        }.build()
        
        return _Linkedin!!
    }

private var _Linkedin: ImageVector? = null

