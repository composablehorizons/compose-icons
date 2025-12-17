package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pig: ImageVector
    get() {
        if (_Pig != null) return _Pig!!
        
        _Pig = ImageVector.Builder(
            name = "pig",
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
                moveTo(15f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3f)
                lineToRelative(0f, 3.803f)
                arcToRelative(6.019f, 6.019f, 0f, false, true, 2.658f, 3.197f)
                horizontalLineToRelative(1.341f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-1.342f)
                arcToRelative(6.008f, 6.008f, 0f, false, true, -1.658f, 2.473f)
                verticalLineToRelative(2.027f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineToRelative(-0.583f)
                arcToRelative(6.04f, 6.04f, 0f, false, true, -1f, 0.083f)
                horizontalLineToRelative(-4f)
                arcToRelative(6.04f, 6.04f, 0f, false, true, -1f, -0.083f)
                verticalLineToRelative(0.583f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineToRelative(-2f)
                lineToRelative(0f, -0.027f)
                arcToRelative(6f, 6f, 0f, false, true, 4f, -10.473f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4.5f, -3f)
                close()
            }
        }.build()
        
        return _Pig!!
    }

private var _Pig: ImageVector? = null

