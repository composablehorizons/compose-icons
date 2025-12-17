package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HexagonNumber7: ImageVector
    get() {
        if (_HexagonNumber7 != null) return _HexagonNumber7!!
        
        _HexagonNumber7 = ImageVector.Builder(
            name = "hexagon-number-7",
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
                moveTo(19.02f, 6.858f)
                arcToRelative(2f, 2f, 0f, false, true, 1f, 1.752f)
                verticalLineToRelative(6.555f)
                curveToRelative(0f, 0.728f, -0.395f, 1.4f, -1.032f, 1.753f)
                lineToRelative(-6.017f, 3.844f)
                arcToRelative(2f, 2f, 0f, false, true, -1.948f, 0f)
                lineToRelative(-6.016f, -3.844f)
                arcToRelative(2f, 2f, 0f, false, true, -1.032f, -1.752f)
                verticalLineToRelative(-6.556f)
                curveToRelative(0f, -0.728f, 0.395f, -1.4f, 1.032f, -1.753f)
                lineToRelative(6.017f, -3.582f)
                arcToRelative(2.062f, 2.062f, 0f, false, true, 2f, 0f)
                lineToRelative(6.017f, 3.583f)
                horizontalLineToRelative(-0.029f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, 8f)
            }
        }.build()
        
        return _HexagonNumber7!!
    }

private var _HexagonNumber7: ImageVector? = null

