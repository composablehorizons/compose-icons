package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.IrregularPolyhedron: ImageVector
    get() {
        if (_IrregularPolyhedron != null) return _IrregularPolyhedron!!
        
        _IrregularPolyhedron = ImageVector.Builder(
            name = "irregular-polyhedron",
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
                moveTo(6f, 12f)
                lineToRelative(-1.752f, 6.13f)
                arcToRelative(1f, 1f, 0f, false, false, 0.592f, 1.205f)
                lineToRelative(6.282f, 2.503f)
                arcToRelative(2.46f, 2.46f, 0f, false, false, 1.756f, 0f)
                lineToRelative(6.282f, -2.503f)
                arcToRelative(1f, 1f, 0f, false, false, 0.592f, -1.204f)
                lineToRelative(-1.752f, -6.131f)
                lineToRelative(1.752f, -6.13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.592f, -1.205f)
                lineToRelative(-6.282f, -2.503f)
                arcToRelative(2.46f, 2.46f, 0f, false, false, -1.756f, 0f)
                lineToRelative(-6.282f, 2.503f)
                arcToRelative(1f, 1f, 0f, false, false, -0.592f, 1.204f)
                lineToRelative(1.752f, 6.131f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 5.5f)
                lineToRelative(6.622f, 2.33f)
                arcToRelative(2.35f, 2.35f, 0f, false, false, 1.756f, 0f)
                lineToRelative(6.622f, -2.33f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                lineToRelative(5.21f, 1.862f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, 1.58f, 0f)
                lineToRelative(5.21f, -1.862f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineToRelative(-14f)
            }
        }.build()
        
        return _IrregularPolyhedron!!
    }

private var _IrregularPolyhedron: ImageVector? = null

