package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Feather: ImageVector
    get() {
        if (_Feather != null) return _Feather!!
        
        _Feather = ImageVector.Builder(
            name = "feather",
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
                moveTo(4f, 20f)
                lineToRelative(10f, -10f)
                moveToRelative(0f, -5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                moveToRelative(-9f, -1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                moveToRelative(-9f, -1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                moveToRelative(-5f, -5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, -4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                curveToRelative(0.638f, -0.636f, 1f, -1.515f, 1f, -2.486f)
                arcToRelative(3.515f, 3.515f, 0f, false, false, -3.517f, -3.514f)
                curveToRelative(-0.97f, 0f, -1.847f, 0.367f, -2.483f, 1f)
                moveToRelative(-3f, 13f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _Feather!!
    }

private var _Feather: ImageVector? = null

