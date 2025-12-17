package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.JoinBevel: ImageVector
    get() {
        if (_JoinBevel != null) return _JoinBevel!!
        
        _JoinBevel = ImageVector.Builder(
            name = "join-bevel",
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
                moveTo(6f, 4f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-6.586f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, -0.293f)
                lineToRelative(-6.414f, -6.414f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-6.586f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
        }.build()
        
        return _JoinBevel!!
    }

private var _JoinBevel: ImageVector? = null

