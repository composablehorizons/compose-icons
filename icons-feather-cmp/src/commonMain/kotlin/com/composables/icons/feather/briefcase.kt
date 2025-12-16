package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
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
                moveTo(4f, 7f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 9f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 20f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 19f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 4f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 21f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(16f)
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

