package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CirclesRelation: ImageVector
    get() {
        if (_CirclesRelation != null) return _CirclesRelation!!
        
        _CirclesRelation = ImageVector.Builder(
            name = "circles-relation",
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
                moveTo(9.183f, 6.117f)
                arcToRelative(6f, 6f, 0f, true, false, 4.511f, 3.986f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.813f, 17.883f)
                arcToRelative(6f, 6f, 0f, true, false, -4.496f, -3.954f)
            }
        }.build()
        
        return _CirclesRelation!!
    }

private var _CirclesRelation: ImageVector? = null

