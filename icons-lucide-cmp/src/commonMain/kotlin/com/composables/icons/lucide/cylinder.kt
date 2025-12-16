package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cylinder: ImageVector
    get() {
        if (_Cylinder != null) return _Cylinder!!
        
        _Cylinder = ImageVector.Builder(
            name = "cylinder",
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
                moveTo(21f, 5f)
                arcTo(9f, 3f, 0f, false, true, 12f, 8f)
                arcTo(9f, 3f, 0f, false, true, 3f, 5f)
                arcTo(9f, 3f, 0f, false, true, 21f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(9f, 3f, 0f, false, false, 18f, 0f)
                verticalLineTo(5f)
            }
        }.build()
        
        return _Cylinder!!
    }

private var _Cylinder: ImageVector? = null

