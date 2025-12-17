package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ear: ImageVector
    get() {
        if (_Ear != null) return _Ear!!
        
        _Ear = ImageVector.Builder(
            name = "ear",
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
                moveTo(6f, 10f)
                arcToRelative(7f, 7f, 0f, true, true, 13f, 3.6f)
                arcToRelative(10f, 10f, 0f, false, true, -2f, 2f)
                arcToRelative(8f, 8f, 0f, false, false, -2f, 3f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -6.8f, 1.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                arcToRelative(3f, 3f, 0f, true, true, 5f, 2.2f)
            }
        }.build()
        
        return _Ear!!
    }

private var _Ear: ImageVector? = null

