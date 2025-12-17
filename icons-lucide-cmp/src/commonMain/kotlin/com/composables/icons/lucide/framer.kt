package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Framer: ImageVector
    get() {
        if (_Framer != null) return _Framer!!
        
        _Framer = ImageVector.Builder(
            name = "framer",
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
                moveTo(5f, 16f)
                verticalLineTo(9f)
                horizontalLineToRelative(14f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                lineToRelative(14f, 14f)
                horizontalLineToRelative(-7f)
                moveToRelative(-7f, 0f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(-7f)
                moveToRelative(-7f, 0f)
                horizontalLineToRelative(7f)
            }
        }.build()
        
        return _Framer!!
    }

private var _Framer: ImageVector? = null

