package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Meteor: ImageVector
    get() {
        if (_Meteor != null) return _Meteor!!
        
        _Meteor = ImageVector.Builder(
            name = "meteor",
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
                moveTo(21f, 3f)
                lineToRelative(-5f, 9f)
                horizontalLineToRelative(5f)
                lineToRelative(-6.891f, 7.086f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -8.855f, -9.506f)
                lineToRelative(7.746f, -6.58f)
                lineToRelative(-1f, 5f)
                lineToRelative(9f, -5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
            }
        }.build()
        
        return _Meteor!!
    }

private var _Meteor: ImageVector? = null

